package com.coretech.TravelList.repositories;

import com.coretech.TravelList.entities.TravelList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelListRepository extends JpaRepository<TravelList, Long> {
}
