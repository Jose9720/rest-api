package com.example.demo.service;

import java.util.List;

import com.example.demo.model.SwiggyModel;

public interface RestaurantService {
	SwiggyModel saveHotel(SwiggyModel hotel);
	List<SwiggyModel>  getHotelFromDb();
	SwiggyModel getHotelById(int hotelId);
	SwiggyModel updateHotelDetails(SwiggyModel hotel, int hotelId);
	void deleteHotelById(int hotelId);

}
