package org.example.entity;

import java.util.Date;
import java.util.List;

public class Clinic {

        private String clinicId;
        private String clinicName;
        private String businessName;
        private String streetAddress;
        private String city;
        private String state;
        private String country;
        private String zipCode;
        private double latitude;
        private double longitude;
        private Date dateCreated;
        private List<Service> servicesOffered;
        // Getters and setters


    public Clinic() {
    }

    @Override
    public String toString() {
        return "Clinic{" +
                "clinicId='" + clinicId + '\'' +
                ", clinicName='" + clinicName + '\'' +
                ", businessName='" + businessName + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", dateCreated=" + dateCreated +
                ", servicesOffered=" + servicesOffered +
                '}';
    }

    public Clinic(String clinicId, String clinicName, String businessName, String streetAddress, String city, String state, String country, String zipCode, double latitude, double longitude, Date dateCreated, List<Service> servicesOffered) {
        this.clinicId = clinicId;
        this.clinicName = clinicName;
        this.businessName = businessName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.dateCreated = dateCreated;
        this.servicesOffered = servicesOffered;
    }

    public String getClinicId() {
        return clinicId;
    }

    public void setClinicId(String clinicId) {
        this.clinicId = clinicId;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public List<Service> getServicesOffered() {
        return servicesOffered;
    }

    public void setServicesOffered(List<Service> servicesOffered) {
        this.servicesOffered = servicesOffered;
    }
}
