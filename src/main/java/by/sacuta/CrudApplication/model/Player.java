package by.sacuta.CrudApplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String name;
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "player_number")
    private Long number;



    @Column(name = "player_age")
    private Long age;



    public Player(Long id, String name, String lastName, Long number, Long age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.number =number;
        this.age = age;
    }

    public Player() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;

    }
    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

}