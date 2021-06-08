package fr.diginamic.petstore.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "address")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Address implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number", nullable = false, length = 10)
    private int number;

    @Column(name = "street", nullable = false, length = 100)
    private String street;

    @Column(name = "zip_code", nullable = false, length = 10)
    private int zipCode;

    @Column(name = "city", nullable = false, length = 50)
    private String city;

    public Address() {
    }


    public Address(int number, String street, int zipCode, String city) {
        this.number = number;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
    }

    /**
     * get field @Id
     @Column(name = "id")
     @GeneratedValue

      *
      * @return id @Id
     @Column(name = "id")
     @GeneratedValue

     */
    public Long getId() {
        return this.id;
    }

    /**
     * set field @Id
     @Column(name = "id")
     @GeneratedValue

      *
      * @param id @Id
     @Column(name = "id")
     @GeneratedValue

     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get field @Column(name = "number", nullable = false, length = 10)
     *
     * @return number @Column(name = "number", nullable = false, length = 10)

     */
    public int getNumber() {
        return this.number;
    }

    /**
     * set field @Column(name = "number", nullable = false, length = 10)
     *
     * @param number @Column(name = "number", nullable = false, length = 10)

     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * get field @Column(name = "street", nullable = false, length = 100)
     *
     * @return street @Column(name = "street", nullable = false, length = 100)

     */
    public String getStreet() {
        return this.street;
    }

    /**
     * set field @Column(name = "street", nullable = false, length = 100)
     *
     * @param street @Column(name = "street", nullable = false, length = 100)

     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * get field @Column(name = "zip_code", nullable = false, length = 10)
     *
     * @return zipCode @Column(name = "zip_code", nullable = false, length = 10)

     */
    public int getZipCode() {
        return this.zipCode;
    }

    /**
     * set field @Column(name = "zip_code", nullable = false, length = 10)
     *
     * @param zipCode @Column(name = "zip_code", nullable = false, length = 10)

     */
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * get field @Column(name = "city", nullable = false, length = 50)
     *
     * @return city @Column(name = "city", nullable = false, length = 50)

     */
    public String getCity() {
        return this.city;
    }

    /**
     * set field @Column(name = "city", nullable = false, length = 50)
     *
     * @param city @Column(name = "city", nullable = false, length = 50)

     */
    public void setCity(String city) {
        this.city = city;
    }
}
