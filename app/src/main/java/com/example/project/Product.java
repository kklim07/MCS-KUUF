package com.example.project;

public class Product {
    public int id;
    public String name;
    public int minplayer;
    public int maxplayer;
    public int price;
    public int longitude;
    public int latitude;

    public Product (int id,String name,int minplayer, int maxplayer,int price,int longitude,int latitude){
        this.id=id;
        this.name=name;
        this.minplayer=minplayer;
        this.maxplayer=maxplayer;
        this.price=price;
        this.longitude=longitude;
        this.latitude=latitude;
    }
}


