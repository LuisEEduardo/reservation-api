package com.main.reservation.api.domain.entities;

import java.util.Objects;

public class Employee extends Entity {

    private String position;
    private User user;

    public Employee(String position, User user) {
        this.position = position;
        this.user = user;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
        if (!(o instanceof Employee employee)) return false;
        if (!super.equals(o)) return false;

        if (!Objects.equals(position, employee.position)) return false;
        return Objects.equals(user, employee.user);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }
}
