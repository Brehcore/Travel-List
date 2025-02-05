package com.coretech.TravelList.TravelListDTO;

import com.coretech.TravelList.entities.Travel;
import org.springframework.beans.BeanUtils;

public class TravelDTO {

    private Long id;
    private String title;
    private String city;
    private String state;
    private String category;
    private String monthToVisit;
    private String imgUrl;
    private String description;

    public TravelDTO() {}

    public TravelDTO(Travel entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMonthToVisit() {
        return monthToVisit;
    }

    public void setMonthToVisit(String monthToVisit) {
        this.monthToVisit = monthToVisit;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
