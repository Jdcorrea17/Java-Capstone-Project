package com.capstone.project.dtos;

import com.capstone.project.entities.Home;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HomeDto implements Serializable {
    private Long id;

    private String img;
    private String address;
    private int bedrooms;
    private int bathrooms;
    private String squareFt;
    private double price;
    private boolean availability;

    public HomeDto(Home home){
        if(home.getId() != null){
            this.id = home.getId();
        }
        this.img = home.getImg();

        if(home.getAddress() != null){
            this.address = home.getAddress();
        }

        this.bedrooms = home.getBedrooms();


        this.bathrooms = home.getBathrooms();

        if(home.getSquareFt() != null){
            this.squareFt = home.getSquareFt();
        }

        this.price = home.getPrice();
        this.availability = home.isAvailability();
    }
}
