package com.itacademy.whitecollar.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="shops")
public class ShopResponseDto {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int maxCapacity;
}
