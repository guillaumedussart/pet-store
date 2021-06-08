package fr.diginamic.petstore.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "animals")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Animal implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @Column(name = "birth")
    private Date birth;

    @Column(name = "color",length = 20)
    private String color;


    @ManyToOne()
    @JoinColumn(name = "id_petstore")
    private PetStore petStore;

    public Animal(Date birth, String color) {
        this.birth = birth;
        this.color = color;
    }

    public Animal() {

    }

    public Animal(Date birth, String color, PetStore petStore) {
        this.birth = birth;
        this.color = color;
        this.petStore = petStore;
    }

    /**
     * get field @Id
     *
     * @return id @Id

     */
    public Long getId() {
        return this.id;
    }

    /**
     * set field @Id
     *
     * @param id @Id

     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get field @Column(name = "birth")
     *
     * @return birth @Column(name = "birth")

     */
    public Date getBirth() {
        return this.birth;
    }

    /**
     * set field @Column(name = "birth")
     *
     * @param birth @Column(name = "birth")

     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * get field @Column(name = "color",length = 20)
     *
     * @return color @Column(name = "color",length = 20)

     */
    public String getColor() {
        return this.color;
    }

    /**
     * set field @Column(name = "color",length = 20)
     *
     * @param color @Column(name = "color",length = 20)

     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * get field @ManyToOne()
     @JoinColumn(name = "id_petstore")

      *
      * @return petStore @ManyToOne()
     @JoinColumn(name = "id_petstore")

     */
    public PetStore getPetStore() {
        return this.petStore;
    }

    /**
     * set field @ManyToOne()
     @JoinColumn(name = "id_petstore")

      *
      * @param petStore @ManyToOne()
     @JoinColumn(name = "id_petstore")

     */
    public void setPetStore(PetStore petStore) {
        this.petStore = petStore;
    }
}
