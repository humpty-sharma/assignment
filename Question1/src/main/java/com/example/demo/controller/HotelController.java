package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Result;
import com.example.demo.model.HotelRoom;
import com.example.demo.service.HotelService;

@RestController
public class HotelController {

	List<HotelRoom> room;
	@Autowired
	private HotelService service;
	
	@GetMapping(value="/api")
	public List<HotelRoom> getAll() {
		List<HotelRoom> roomList = new ArrayList<>();
		this.service.findAll().forEach(eachObject->{
			roomList.add(eachObject);
		});;
		return roomList;
	}
	
	@GetMapping("/api/{hotelId}")
	public Result findHotelById(@PathVariable("hotelId") long id)
	{
	return this.service.findById(id);

	}
}
