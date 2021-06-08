package fr.diginamic.petstore.entities;

import fr.diginamic.petstore.enumeration.FishLivEnv;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "fishs")
public class Fish extends Animal implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "living_env")
    private FishLivEnv livingEnv;

    public Fish(FishLivEnv livingEnv) {
        this.livingEnv = livingEnv;
    }

    public Fish(Date birth, String color, FishLivEnv livingEnv) {
        super(birth, color);
        this.livingEnv = livingEnv;
    }

    public Fish() {

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
     * get field @Column(name = "living_env")
     *
     * @return livingEnv @Column(name = "living_env")

     */
    public FishLivEnv getLivingEnv() {
        return this.livingEnv;
    }

    /**
     * set field @Column(name = "living_env")
     *
     * @param livingEnv @Column(name = "living_env")

     */
    public void setLivingEnv(FishLivEnv livingEnv) {
        this.livingEnv = livingEnv;
    }
}
