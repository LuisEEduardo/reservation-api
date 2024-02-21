package com.main.reservation.api.domain.entities;

import java.util.Objects;

public class Address extends Entity {

    public String street;
    public String state;
    public String country;
    public String postalCode;
    public String number;
    public String complement;
    public String description;
    public String linkGoogleMaps;

    public Address(String street, String state, String country,
                   String postalCode, String number, String complement,
                   String description, String linkGoogleMaps) {
        this.street = street;
        this.state = state;
        this.country = country;
        this.postalCode = postalCode;
        this.number = number;
        this.complement = complement;
        this.description = description;
        this.linkGoogleMaps = linkGoogleMaps;
    }

    public void edit(String street, String state, String country,
                     String postalCode, String number, String complement,
                     String description, String linkGoogleMaps) {
        this.street = street;
        this.state = state;
        this.country = country;
        this.postalCode = postalCode;
        this.number = number;
        this.complement = complement;
        this.description = description;
        this.linkGoogleMaps = linkGoogleMaps;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLinkGoogleMaps() {
        return linkGoogleMaps;
    }

    public void setLinkGoogleMaps(String linkGoogleMaps) {
        this.linkGoogleMaps = linkGoogleMaps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;
        if (!super.equals(o)) return false;

        if (!Objects.equals(street, address.street)) return false;
        if (!Objects.equals(state, address.state)) return false;
        if (!Objects.equals(country, address.country)) return false;
        if (!Objects.equals(postalCode, address.postalCode)) return false;
        if (!Objects.equals(number, address.number)) return false;
        if (!Objects.equals(complement, address.complement)) return false;
        if (!Objects.equals(description, address.description)) return false;
        return Objects.equals(linkGoogleMaps, address.linkGoogleMaps);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (complement != null ? complement.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (linkGoogleMaps != null ? linkGoogleMaps.hashCode() : 0);
        return result;
    }
}
