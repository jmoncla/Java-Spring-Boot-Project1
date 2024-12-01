package com.d288.james.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "vacations")
public class Vacation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vacation_id")
    private Long id;

    @Column(name = "vacation_title")
    private String vacation;

    @Column(name = "description")
    private String description;

    @Column(name = "travel_fare_price")
    private Double travel_price;

    @Column(name = "image_url")
    private String image_URL;

    @CreationTimestamp
    @Column(name = "create_date", updatable = false)
    private Date create_date;

    @UpdateTimestamp
    @Column(name = "last_update")
    private Date last_update;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vacation")
    private Set<CartItem> cartitems;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vacation")
    private Set<Excursion> excursions;


}
