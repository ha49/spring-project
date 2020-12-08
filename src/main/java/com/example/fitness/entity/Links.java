package com.example.fitness.entity;


import javax.persistence.*;

@Entity
public class Links {

    @Id
    @Column( name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "link")
    private String link;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "coachId")
    private Coach coach;

    public Links(String name, String link) {
        this.name = name;
        this.link = link;
    }

    public Links(){

    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}