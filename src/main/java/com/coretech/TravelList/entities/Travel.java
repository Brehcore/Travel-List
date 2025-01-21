package com.coretech.TravelList.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_travel")
public class Travel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String category;
    private String monthToVisit;
    private String imgUrl;
    private String description;

    public Travel() {

    }

    public Travel(Long id, String title, String category, String monthToVisit, String imgUrl, String description) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.monthToVisit = monthToVisit;
        this.imgUrl = imgUrl;
        this.description = description;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Travel travel = (Travel) o;
        return Objects.equals(id, travel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
