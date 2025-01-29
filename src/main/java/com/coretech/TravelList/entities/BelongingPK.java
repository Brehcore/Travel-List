package com.coretech.TravelList.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "travel_id")
    private Travel travel;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private TravelList list;

    public BelongingPK() {
    }

    public BelongingPK(Travel travel, TravelList list) {
        this.travel = travel;
        this.list = list;
    }

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    public TravelList getList() {
        return list;
    }

    public void setList(TravelList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(travel, that.travel) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(travel, list);
    }
}
