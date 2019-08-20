package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.HotelRoom;
import com.example.demo.service.HotelService;





@SpringBootApplication
public class Question1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Question1Application.class, args);
		HotelService service = ctx.getBean(HotelService.class);
		
		HotelRoom room = ctx.getBean(HotelRoom.class);
		
		room.setId(101);
		room.setHotelId(101);
		room.setHotelName("Hotel A");
		room.setRoomNumber(1);
		room.setVacancyStatus(true);
		
		service.save(room);
		
		
		room.setId(104);
		room.setHotelId(101);
		room.setHotelName("Hotel A");
		room.setRoomNumber(2);
		room.setVacancyStatus(false);
		
		service.save(room);
		
		
		room.setId(103);
		room.setHotelId(101);
		room.setHotelName("Hotel A");
		room.setRoomNumber(3);
		room.setVacancyStatus(true);
		
		service.save(room);
		
		
		room.setId(102);
		room.setHotelId(102);
		room.setHotelName("Hotel B");
		room.setRoomNumber(2);
		room.setVacancyStatus(true);
		
		service.save(room);
		
		
		room.setId(105);
		room.setHotelId(102);
		room.setHotelName("Hotel B");
		room.setRoomNumber(3);
		room.setVacancyStatus(false);
		
		service.save(room);
		
		
		room.setId(106);
		room.setHotelId(102);
		room.setHotelName("Hotel B");
		room.setRoomNumber(4);
		room.setVacancyStatus(true);
		
		service.save(room);
		
		
		room.setId(107);
		room.setHotelId(102);
		room.setHotelName("Hotel B");
		room.setRoomNumber(1);
		room.setVacancyStatus(false);
		
	
		service.save(room);
		
	}

}









	

