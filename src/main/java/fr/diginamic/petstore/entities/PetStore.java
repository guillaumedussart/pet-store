package fr.diginamic.petstore.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "petstores")
public class PetStore extends Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "manager_name", length = 100)
    private String managerName;

    @ManyToMany
    @JoinTable(name = "petstore_product",
            joinColumns = @JoinColumn(name = "id_petstore", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_product", referencedColumnName = "id")
    )
    private Set<Product> products;

    @OneToMany
    private Set<Animal> animals;


    public PetStore() {
        products = new HashSet<>();
    }

    public PetStore(String name, String managerName) {
        this.name = name;
        this.managerName = managerName;
    }

    public PetStore(int number, String street, int zipCode, String city, String name, String managerName) {
        super(number, street, zipCode, city);
        this.name = name;
        this.managerName = managerName;
    }

    public PetStore(String name, String managerName, Set<Product> products) {
        this.name = name;
        this.managerName = managerName;
        this.products = products;
    }

    public PetStore(int number, String street, int zipCode, String city, String name, String managerName, Set<Product> products) {
        super(number, street, zipCode, city);
        this.name = name;
        this.managerName = managerName;
        this.products = products;
    }

    public PetStore(String name, String managerName, Set<Product> products, Set<Animal> animals) {
        this.name = name;
        this.managerName = managerName;
        this.products = products;
        this.animals = animals;
    }

    public PetStore(int number, String street, int zipCode, String city, String name, String managerName, Set<Product> products, Set<Animal> animals) {
        super(number, street, zipCode, city);
        this.name = name;
        this.managerName = managerName;
        this.products = products;
        this.animals = animals;
    }

    /**
     * get field @Id
     *
     * @return id @Id
     * @GeneratedValue
     * @GeneratedValue
     */
    public Long getId() {
        return this.id;
    }

    /**
     * set field @Id
     *
     * @param id @Id
     * @GeneratedValue
     * @GeneratedValue
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get field @Column(name = "name",length = 100)
     *
     * @return name @Column(name = "name",length = 100)
     */
    public String getName() {
        return this.name;
    }

    /**
     * set field @Column(name = "name",length = 100)
     *
     * @param name @Column(name = "name",length = 100)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get field @Column(name = "manager_name",length = 100)
     *
     * @return managerName @Column(name = "manager_name",length = 100)
     */
    public String getManagerName() {
        return this.managerName;
    }

    /**
     * set field @Column(name = "manager_name",length = 100)
     *
     * @param managerName @Column(name = "manager_name",length = 100)
     */
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    /**
     * get field @ManyToMany
     *
     * @return products @ManyToMany
     * @JoinTable(name = "petstore_product",
     * joinColumns = @JoinColumn(name = "id_petstore", referencedColumnName = "id"),
     * inverseJoinColumns = @JoinColumn(name = "id_product", referencedColumnName = "id")
     * )
     * @JoinTable(name = "petstore_product",
     * joinColumns = @JoinColumn(name = "id_petstore", referencedColumnName = "id"),
     * inverseJoinColumns = @JoinColumn(name = "id_product", referencedColumnName = "id")
     * )
     */
    public Set<Product> getProducts() {
        return this.products;
    }

    /**
     * set field @ManyToMany
     *
     * @param products @ManyToMany
     * @JoinTable(name = "petstore_product",
     * joinColumns = @JoinColumn(name = "id_petstore", referencedColumnName = "id"),
     * inverseJoinColumns = @JoinColumn(name = "id_product", referencedColumnName = "id")
     * )
     * @JoinTable(name = "petstore_product",
     * joinColumns = @JoinColumn(name = "id_petstore", referencedColumnName = "id"),
     * inverseJoinColumns = @JoinColumn(name = "id_product", referencedColumnName = "id")
     * )
     */
    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    /**
     * get field @OneToMany
     *
     * @return animals @OneToMany
     */
    public Set<Animal> getAnimals() {
        return this.animals;
    }

    /**
     * set field @OneToMany
     *
     * @param animals @OneToMany
     */
    public void setAnimals(Set<Animal> animals) {
        this.animals = animals;
    }
}
