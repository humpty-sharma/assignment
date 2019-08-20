

package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.HotelRoom;


@Repository
public interface HotelRepository extends CrudRepository<HotelRoom, Long> {
	long countByHotelIdAndVacancyStatus(long hotelId,boolean vacancyStatus);
}
