package fr.diginamic.petstore.tests;

import fr.diginamic.petstore.entities.*;
import fr.diginamic.petstore.enumeration.FishLivEnv;
import fr.diginamic.petstore.enumeration.ProdType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class PetTests {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("petstore");
    private static EntityManager em = emf.createEntityManager();

    public static void main(String[] args) {
        //addAnimalsAndProducts();

        PetStore petStore = em.find(PetStore.class,1L);
        System.out.println(petStore.getProducts());
        emf.close();
        em.close();
    }

    private static void addAnimalsAndProducts(){
        em.getTransaction().begin();

        Product product1 = new Product("36A56", "testLabel1", ProdType.FOOD, 20.2);
        Product product2 = new Product("36A57", "testLabel2", ProdType.ACCESSORY, 220.2);
        Product product3 = new Product("36A58", "testLabel3", ProdType.CLEANING, 120.2);
        em.persist(product1);
        em.persist(product2);
        em.persist(product3);
        Set<Product> products = new HashSet<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);

        Address address = new Address(12, "Lion", 12500, "test");

        PetStore petStore = new PetStore( "Amizoo", "Robert", products,address);
        em.persist(petStore);
        Animal cat1 = new Cat(new Date(2021, 10, 02), "brown", petStore, "n25698");
        em.persist(cat1);
        Animal cat2 = new Cat(new Date(2021, 11, 22), "red", petStore, "b256f5");
        em.persist(cat2);
        Animal fish1 = new Fish(new Date(2021, 11, 22), "red", petStore, FishLivEnv.FRESH_WATER);
        em.persist(fish1);

        em.getTransaction().commit();
    }
}
