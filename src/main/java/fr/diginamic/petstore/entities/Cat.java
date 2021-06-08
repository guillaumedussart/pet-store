package fr.diginamic.petstore.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "cats")
public class Cat extends Animal implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "chip_id")
    private String chipId;

    public Cat() {
    }

    public Cat(String chipId) {
        this.chipId = chipId;
    }

    public Cat(Date birth, String color, String chipId) {
        super(birth, color);
        this.chipId = chipId;
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
     * get field @Column(name = "chip_id")
     *
     * @return chipId @Column(name = "chip_id")

     */
    public String getChipId() {
        return this.chipId;
    }

    /**
     * set field @Column(name = "chip_id")
     *
     * @param chipId @Column(name = "chip_id")

     */
    public void setChipId(String chipId) {
        this.chipId = chipId;
    }
}
