package tech.itpark.crud.model;

import java.util.ArrayList;

public class Flat {
    private int id;
    private String name;
    private ArrayList<String> station;
    private ArrayList<String> district;
    private int price;
    private int floor;
    private int rooms;

    public Flat() {
    }

    public Flat(int id, String name, ArrayList<String> station, ArrayList<String> district, int price, int floor, int rooms) {
        this.id = id;
        this.name = name;
        this.station = station;
        this.district = district;
        this.price = price;
        this.floor = floor;
        this.rooms = rooms;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getStation() {
        return station;
    }

    public void setStation(ArrayList<String> station) {
        this.station = station;
    }

    public ArrayList<String> getDistrict() {
        return district;
    }

    public void setDistrict(ArrayList<String> district) {
        this.district = district;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
}

