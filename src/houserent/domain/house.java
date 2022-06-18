package houserent.domain;

public class house {
    private int id;
    private String phone;
    private String name;
    private int rent;
    private String address;
    private String state;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRent() {
        return rent;
    }
    public void setRent(int rent) {
        this.rent = rent;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public house(int id, String phone, String name, int rent, String address, String state) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.rent = rent;
        this.address = address;
        this.state = state;
    }
    //
    @Override
    public String toString() {
        return id +"\t"+name+"\t"+phone+"\t"+address+"\t"+rent+"\t"+state;
    }
    
    
    
}
