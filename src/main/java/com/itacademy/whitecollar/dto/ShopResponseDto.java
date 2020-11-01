package com.itacademy.whitecollar.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Component
@Data
@Entity
@Table(name="shops")
public class ShopResponseDto extends ResponseDto{
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
