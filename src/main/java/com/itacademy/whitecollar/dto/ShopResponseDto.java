package com.itacademy.whitecollar.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="shops")
public class ShopResponseDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Long max_capacity;

    @OneToMany(mappedBy = "shop_id", cascade = {
            CascadeType.ALL
    })
    private List<PictureResponseDto> pictures;
}
