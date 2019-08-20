package com.example.demo.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.Result;
import com.example.demo.model.HotelRoom;
import com.example.demo.repository.HotelRepository;

@Service
public class HotelService {
	
	@Autowired
	List<HotelRoom> hotelList;
	@Autowired
	private HotelRepository repo;
	
	
	
	
	public HotelRoom save(HotelRoom room) {
		return repo.save(room);
	}
	
	public Iterable<HotelRoom> findAll(){
		return repo.findAll();
	}
	
	
	
	public Result findById(long id) {
		
		Result result = new Result();
		result.setVacantRoom(repo.countByHotelIdAndVacancyStatus(id,true));
		result.setHotelId(id);
		result.setOccupiedRoom(repo.countByHotelIdAndVacancyStatus(id,false));
		 return result;
	
	}
}
