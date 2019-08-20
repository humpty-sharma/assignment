package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

@Data
@Entity
@Table(name="Hotel")
@Component

public class HotelRoom {
	
	@Id
	private long Id;
	private long hotelId;
	private String hotelName;
	private long roomNumber;
	private boolean vacancyStatus;
	public long getId() {
		return Id;
	}
	public void setId(long Id) {
		this.Id = Id;
	}
	public long getHotelId() {
		return hotelId;
	}
	public void setHotelId(long hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public long getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(long roomNumber) {
		this.roomNumber = roomNumber;
	}
	public boolean isVacancyStatus() {
		return vacancyStatus;
	}
	public void setVacancyStatus(boolean vacancyStatus) {
		this.vacancyStatus = vacancyStatus;
	}

}
