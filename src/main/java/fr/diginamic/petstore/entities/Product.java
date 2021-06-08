package fr.diginamic.petstore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "products")
public class Product implements Serializable {
    @Id
    private Long id;


    @Column(name = "code", length = 100)
    private String code;


    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }


}
