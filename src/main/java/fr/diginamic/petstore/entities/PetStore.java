package fr.diginamic.petstore.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "petstores")
public class PetStore implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "manager_name", length = 100)
    private String managerName;

    @ManyToMany
    @JoinTable(name = "petstores_products",
            joinColumns = @JoinColumn(name = "id_petstore", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_product", referencedColumnName = "id")
    )
    private Set<Product> products;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name="id_petstore")
    private Set<Animal> animals;

    @Embedded
    private Address adresse;

    public PetStore() {
        products = new HashSet<>();
        animals = new HashSet<>();
    }

    public PetStore(String name, String managerName, Set<Product> products, Set<Animal> animals, Address adresse) {
        this.name = name;
        this.managerName = managerName;
        this.products = products;
        this.animals = animals;
        this.adresse = adresse;
    }

    public PetStore(String name, String managerName, Set<Product> products, Address adresse) {
        this.name = name;
        this.managerName = managerName;
        this.products = products;
        this.adresse = adresse;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PetStore{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", managerName='").append(managerName).append('\'');
        sb.append(", products=").append(products);
        sb.append(", animals=").append(animals);
        sb.append('}');
        return sb.toString();
    }

    /**
     * get field @Embedded
     *
     * @return adresse @Embedded

     */
    public Address getAdresse() {
        return this.adresse;
    }
}
