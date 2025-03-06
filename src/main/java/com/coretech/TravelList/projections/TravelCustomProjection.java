package com.coretech.TravelList.projections;

public interface TravelCustomProjection {

    Long getId();
    String getTitle();
    String getYear();
    String getImgUrl();
    String getDescription();
    Integer getPosition();

}
