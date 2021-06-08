package fr.diginamic.petstore.tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PetTests {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("petstore");
    private static EntityManager em = emf.createEntityManager();

    public static void main(String[] args) {





        emf.close();
        em.close();
    }
}
