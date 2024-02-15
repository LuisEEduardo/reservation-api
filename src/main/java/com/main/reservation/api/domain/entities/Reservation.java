package com.main.reservation.api.domain.entities;

import java.util.Date;
import java.util.Objects;

public class Reservation extends Entity {

    private Employee employee;
    private Date day;
    private Client client;
    private String nameClientAnonymous;
    private String emailClientAnonymous;
    private String phoneClientAnonymous;
    private Date serviceTime;

    public Reservation(Employee employee, Date day, Client client, String nameClientAnonymous, String emailClientAnonymous, String phoneClientAnonymous, Date serviceTime) {
        this.employee = employee;
        this.day = day;
        this.client = client;
        this.nameClientAnonymous = nameClientAnonymous;
        this.emailClientAnonymous = emailClientAnonymous;
        this.phoneClientAnonymous = phoneClientAnonymous;
        this.serviceTime = serviceTime;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getNameClientAnonymous() {
        return nameClientAnonymous;
    }

    public void setNameClientAnonymous(String nameClientAnonymous) {
        this.nameClientAnonymous = nameClientAnonymous;
    }

    public String getEmailClientAnonymous() {
        return emailClientAnonymous;
    }

    public void setEmailClientAnonymous(String emailClientAnonymous) {
        this.emailClientAnonymous = emailClientAnonymous;
    }

    public String getPhoneClientAnonymous() {
        return phoneClientAnonymous;
    }

    public void setPhoneClientAnonymous(String phoneClientAnonymous) {
        this.phoneClientAnonymous = phoneClientAnonymous;
    }

    public Date getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(Date serviceTime) {
        this.serviceTime = serviceTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reservation that)) return false;
        if (!super.equals(o)) return false;

        if (!Objects.equals(employee, that.employee)) return false;
        if (!Objects.equals(day, that.day)) return false;
        if (!Objects.equals(client, that.client)) return false;
        if (!Objects.equals(nameClientAnonymous, that.nameClientAnonymous))
            return false;
        if (!Objects.equals(emailClientAnonymous, that.emailClientAnonymous))
            return false;
        if (!Objects.equals(phoneClientAnonymous, that.phoneClientAnonymous))
            return false;
        return Objects.equals(serviceTime, that.serviceTime);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (employee != null ? employee.hashCode() : 0);
        result = 31 * result + (day != null ? day.hashCode() : 0);
        result = 31 * result + (client != null ? client.hashCode() : 0);
        result = 31 * result + (nameClientAnonymous != null ? nameClientAnonymous.hashCode() : 0);
        result = 31 * result + (emailClientAnonymous != null ? emailClientAnonymous.hashCode() : 0);
        result = 31 * result + (phoneClientAnonymous != null ? phoneClientAnonymous.hashCode() : 0);
        result = 31 * result + (serviceTime != null ? serviceTime.hashCode() : 0);
        return result;
    }
}
