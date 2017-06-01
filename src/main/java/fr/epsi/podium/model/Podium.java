package fr.epsi.podium.model;

import java.util.HashMap;


public class Podium {

    private int id;
    private String name;
    private int numberOfVote;
    private HashMap<Integer, PodiumItem> items = new HashMap();

    // Getters & Seters

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getNumberOfVote() {return numberOfVote;}

    public void setNumberOfVote(int numberOfVote) {this.numberOfVote = numberOfVote;}

    public HashMap<Integer, PodiumItem> getItems() {return items;}

    public void setItems(HashMap<Integer, PodiumItem> items) {this.items = items;}
}
