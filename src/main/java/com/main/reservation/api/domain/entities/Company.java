package com.main.reservation.api.domain.entities;

import java.util.Objects;

public class Company extends Entity {

    private String name;
    private String bio;
    private Address address;
    private User user;

    public Company(String name, String bio, Address address, User user) {
        this.name = name;
        this.bio = bio;
        this.address = address;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company company)) return false;
        if (!super.equals(o)) return false;

        if (!Objects.equals(name, company.name)) return false;
        if (!Objects.equals(bio, company.bio)) return false;
        if (!Objects.equals(address, company.address)) return false;
        return Objects.equals(user, company.user);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (bio != null ? bio.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }
}
