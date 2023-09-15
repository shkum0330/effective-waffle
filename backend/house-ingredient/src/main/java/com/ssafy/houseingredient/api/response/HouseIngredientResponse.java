package com.ssafy.houseingredient.api.response;

import lombok.Data;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
public class HouseIngredientResponse {
    private Integer houseSeq;
    private Short ingredientInfoId;
    private String ingredientInfoName;
    private Byte storageType;
    private Date lastDate;
    private LocalDateTime storageDate;
}