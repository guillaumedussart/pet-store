package fr.diginamic.petstore.entities;

import com.mysql.cj.xdevapi.Client;

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

    @ManyToMany(mappedBy = "products")
    private Set<PetStore> petstores;

    public Product(String code, Set<PetStore> petstores) {
        this.code = code;
        this.petstores = petstores;
    }

    public Product() {
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
}
