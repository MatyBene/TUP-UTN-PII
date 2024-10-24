package model;

import java.util.List;

public class Persona {

    private String _id;
    private boolean isActive;
    private String balance;
    private String eyeColor;
    private String name;
    private String gender;
    private List<String> tags;
    private List<Amigo> amigos;

    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona{" +
                "_id='" + _id + '\'' +
                ", isActive=" + isActive +
                ", balance='" + balance + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", tags=" + tags +
                ", friends=" + amigos +
                '}';
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<Amigo> getFriends() {
        return amigos;
    }

    public void setFriends(List<Amigo> amigos) {
        this.amigos = amigos;
    }
}
