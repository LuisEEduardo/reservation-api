package com.main.reservation.api.domain.entities;

import java.util.Objects;

public class Client extends Entity {
    private String phone;
    private User user;

    public Client(String phone, User user) {
        this.phone = phone;
        this.user = user;
    }

    public void edit(String phone, User user) {
        this.phone = phone;
        this.user = user;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        if (!(o instanceof Client client)) return false;
        if (!super.equals(o)) return false;

        if (!Objects.equals(phone, client.phone)) return false;
        return Objects.equals(user, client.user);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }
}
