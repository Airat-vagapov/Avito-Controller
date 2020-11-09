package tech.itpark.crud.manager;

import tech.itpark.crud.model.Flat;

import java.util.ArrayList;
import java.util.List;

public class FlatManager {
    private ArrayList<Flat> items = new ArrayList<>();
    private int nextId = 1;

    public ArrayList<Flat> getAll() {
        return items;
    }

    public Flat getById(int id) {
        for (Flat item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public Flat save(Flat item) {
        if (item.getId() == 0) {
            item.setId(nextId);
            nextId++;
            items.add(item);
            return item;
        }
        for (Flat flat : items) {
            if (flat.getId() == item.getId()){
                flat.setName(item.getName());
                flat.setStation(item.getStation());
                flat.setDistrict(item.getDistrict());
                flat.setPrice(item.getPrice());
                flat.setFloor(item.getFloor());
                flat.setRooms(item.getRooms());
                return flat;
            }
        }
        return null;
    }

    private int indexById(int id) {
        for (int i = 0; i < items.size(); i++) {
             Flat flat = items.get(i);
             if (flat.getId() == id) {
                 return i;
             }
        }
        return -1;
    }

    public void removeById(int id) {
        int index = indexById(id);
        if (index != -1) {
            items.remove(index);
        }

    }

    public ArrayList<Flat> filter(
            ArrayList<String> station,
            ArrayList<String> district,
            int maxPrice,
            int minPrice,
            int maxFloor,
            int minFloor,
            int rooms) {

        ArrayList<Flat> result = new ArrayList<>();

        for (Flat item : items) {
            if (!containsStations(item, station)){
                continue;
            }

            if (!containsDistricts(item, district)){
                continue;
            }

            if (item.getPrice() < minPrice && item.getPrice() > maxPrice) {
                continue;
            }

            if (item.getFloor() < minFloor && item.getFloor() > maxFloor) {
                continue;
            }

            if (item.getRooms() != rooms) {
                continue;
            }
            result.add(item);

        }
        return result;
    }

    private boolean containsStations(Flat item, ArrayList<String> stations) {
        for (String station : item.getStation()) {
            if (stations.contains(station)) {
                return true;
            }
        }
        return false;
    }

    private boolean containsDistricts(Flat item, ArrayList<String> districts) {
        for (String district : item.getDistrict()) {
            if (districts.contains(district)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Flat> search(String text) {
        text = text.toLowerCase();
        ArrayList<Flat> result = new ArrayList<>();

        for (Flat item : items) {
            if (item.getName().toLowerCase().contains(text)){
                result.add(item);
            }
        }
        return result;
    }










}
