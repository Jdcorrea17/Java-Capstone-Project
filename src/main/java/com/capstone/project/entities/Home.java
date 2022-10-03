package com.capstone.project.entities;

import com.capstone.project.dtos.HomeDto;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Homes")
public class Home {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "text")
    private String img;
    @Column
    private String address;
    @Column
    private int bedrooms;
    @Column
    private int bathrooms;
    @Column
    private String squareFt;
    @Column
    private double price;
    @Column
    private boolean availability;

    Home(String img, String address, int bedrooms, int bathrooms, String squareFt, double price, boolean availability) {
        this.img = img;
        this.address = address;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.squareFt = squareFt;
        this.price = price;
        this.availability = availability;
    }
    public String getImg(){return img;}

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int rooms) {
        this.bedrooms = rooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public String getSquareFt() {
        return squareFt;
    }

    public void setSquareFt(String squareFt) {
        this.squareFt = squareFt;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    public Home(HomeDto homeDto){
        if(homeDto.getId() != null){
            this.id = homeDto.getId();
        }
        this.img = homeDto.getImg();
        if(homeDto.getAddress() != null){
            this.address = homeDto.getAddress();
        }
        this.bedrooms = homeDto.getBedrooms();
        this.bathrooms = homeDto.getBathrooms();

        if(homeDto.getSquareFt() != null){
            this.squareFt = homeDto.getSquareFt();
        }
        this.price = homeDto.getPrice();
        this.availability = homeDto.isAvailability();
    }
    @ManyToOne
    @JsonBackReference
    private User user;
}
