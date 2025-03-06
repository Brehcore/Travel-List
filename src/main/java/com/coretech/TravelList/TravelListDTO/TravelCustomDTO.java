package com.coretech.TravelList.TravelListDTO;

import com.coretech.TravelList.entities.Travel;
import com.coretech.TravelList.projections.TravelCustomProjection;

public class TravelCustomDTO {

    private Long id;
    private String title;
    private String monthToVisit;
    private String imgUrl;

    public TravelCustomDTO(TravelCustomProjection x) {
    }

    public TravelCustomDTO(Travel entity) {
        id = entity.getId();
        title = entity.getTitle();
        monthToVisit = entity.getMonthToVisit();
        imgUrl = entity.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getMonthToVisit() {
        return monthToVisit;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
