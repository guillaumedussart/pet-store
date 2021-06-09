package fr.diginamic.petstore.entities;


import fr.diginamic.petstore.enumeration.ProdType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "code", length = 100)
    private String code;

    @Column(name = "label",length = 100)
    private String label;

    @Column(name = "type")
    private ProdType type;

    @Column(name = "price")
    private double price;


    @ManyToMany(mappedBy = "products")
    private Set<PetStore> petstores;

    public Product(String code, Set<PetStore> petstores) {
        this.code = code;
        this.petstores = petstores;
    }

    public Product() {
    }

    public Product(String code, String label, ProdType type, double price, Set<PetStore> petstores) {
        this.code = code;
        this.label = label;
        this.type = type;
        this.price = price;
        this.petstores = petstores;
    }

    public Product(String code, String label, ProdType type, double price) {
        this.code = code;
        this.label = label;
        this.type = type;
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }


    /**
     * get field @Column(name = "code", length = 100)
     *
     * @return code @Column(name = "code", length = 100)
     */
    public String getCode() {
        return this.code;
    }

    /**
     * set field @Column(name = "code", length = 100)
     *
     * @param code @Column(name = "code", length = 100)
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * get field @ManyToMany(mappedBy = "products")
     *
     * @return petstores @ManyToMany(mappedBy = "products")
     */
    public Set<PetStore> getPetstores() {
        return this.petstores;
    }

    /**
     * set field @ManyToMany(mappedBy = "products")
     *
     * @param petstores @ManyToMany(mappedBy = "products")
     */
    public void setPetstores(Set<PetStore> petstores) {
        this.petstores = petstores;
    }

    /**
     * get field @Column(name = "label",length = 100)
     *
     * @return label @Column(name = "label",length = 100)

     */
    public String getLabel() {
        return this.label;
    }

    /**
     * set field @Column(name = "label",length = 100)
     *
     * @param label @Column(name = "label",length = 100)

     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * get field @Column(name = "type")
     *
     * @return type @Column(name = "type")

     */
    public ProdType getType() {
        return this.type;
    }

    /**
     * set field @Column(name = "type")
     *
     * @param type @Column(name = "type")

     */
    public void setType(ProdType type) {
        this.type = type;
    }

    /**
     * get field @Column(name = "price")
     *
     * @return price @Column(name = "price")

     */
    public double getPrice() {
        return this.price;
    }

    /**
     * set field @Column(name = "price")
     *
     * @param price @Column(name = "price")

     */
    public void setPrice(double price) {
        this.price = price;
    }
}
