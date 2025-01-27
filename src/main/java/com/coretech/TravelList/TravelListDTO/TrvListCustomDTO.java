package com.coretech.TravelList.TravelListDTO;

import com.coretech.TravelList.entities.Travel;

public class TrvListCustomDTO {

    private Long id;
    private String title;
    private String monthToVisit;
    private String imgUrl;

    public TrvListCustomDTO() {
    }

    public TrvListCustomDTO(Travel entity) {
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
