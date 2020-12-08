package com.example.fitness.entity;


import javax.persistence.*;

@Entity
@Table(name = "Documents")
public class Documents {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "clientId")
    private FlxClient flxClient;

    @Column(name = "name")
    private String name;

    @Column(name = "path")
    private  String path;

    public Documents() {
    }

    public Documents(FlxClient flxClient, String name, String path) {
        this.flxClient = flxClient;
        this.name = name;
        this.path = path;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public FlxClient getClient() {
        return flxClient;
    }

    public void setClient(FlxClient flxClient) {
        this.flxClient = flxClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}