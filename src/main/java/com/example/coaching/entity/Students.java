package com.example.coaching.entity;

import jakarta.persistence.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String mobile;

    private String course;

    private Double totalFee;

    private Double paidFee;

    private Double dueFee;
}