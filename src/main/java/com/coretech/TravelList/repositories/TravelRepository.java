package com.coretech.TravelList.repositories;

import com.coretech.TravelList.entities.Travel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelRepository extends JpaRepository<Travel, Long> {
}
