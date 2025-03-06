package com.coretech.TravelList.repositories;

import com.coretech.TravelList.entities.Travel;
import com.coretech.TravelList.projections.TravelCustomProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TravelRepository extends JpaRepository<Travel, Long> {

    @Query(nativeQuery = true, value = """
            SELECT tb_travel.id, tb_travel.title, tb_travel.month_to_visit AS `month`, tb_travel.img_url AS imgUrl,
            tb_travel.description AS Description, tb_belonging.position
            FROM tb_travel
            INNER JOIN tb_belonging ON tb_travel.id = tb_belonging.travel_id
            WHERE tb_belonging.list_id :listId
            ORDER BY tb_belonging.position
            """)
    List<TravelCustomProjection> searchBy(Long listId);
}