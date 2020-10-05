package com.itacademy.whitecollar.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    /*@OneToMany(mappedBy = "shops", cascade = {
            CascadeType.ALL
    })*/
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "shops")
    private List<PictureResponseDto> pictures;
}
