package com.main.reservation.api.domain.entities;

import java.util.Date;
import java.util.Objects;

public class Availability extends Entity {

    private String daysAvailable;
    private Date startHour;
    private Date endHour;

    public Availability(String daysAvailable, Date startHour, Date endHour) {
        this.daysAvailable = daysAvailable;
        this.startHour = startHour;
        this.endHour = endHour;
    }

    public void edit(String daysAvailable, Date startHour, Date endHour) {
        this.daysAvailable = daysAvailable;
        this.startHour = startHour;
        this.endHour = endHour;
    }

    public String getDaysAvailable() {
        return daysAvailable;
    }

    public void setDaysAvailable(String daysAvailable) {
        this.daysAvailable = daysAvailable;
    }

    public Date getStartHour() {
        return startHour;
    }

    public void setStartHour(Date startHour) {
        this.startHour = startHour;
    }

    public Date getEndHour() {
        return endHour;
    }

    public void setEndHour(Date endHour) {
        this.endHour = endHour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Availability that)) return false;
        if (!super.equals(o)) return false;

        if (!Objects.equals(daysAvailable, that.daysAvailable))
            return false;
        if (!Objects.equals(startHour, that.startHour)) return false;
        return Objects.equals(endHour, that.endHour);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (daysAvailable != null ? daysAvailable.hashCode() : 0);
        result = 31 * result + (startHour != null ? startHour.hashCode() : 0);
        result = 31 * result + (endHour != null ? endHour.hashCode() : 0);
        return result;
    }
}
