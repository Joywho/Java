package houserent.service;

import houserent.domain.house; 

public class houseService {
    private house[] houses;
    private int houseNumber = 1;
    private int idcouter = 1;

    public houseService(int size) {
        houses = new house[size];
        houses[0] = new house(1, "111", "who1", 3000, "where1", "未出租");
    }

    // add()
    public boolean add(house newhouse) {
        if (houseNumber == houses.length) {
            return false;
        }
        houses[houseNumber] = newhouse;
        houseNumber++;
        newhouse.setId(idcouter);
        return true;

    }

    // list()
    public house[] list() {
        return houses;
    }

}
