package com.flight.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Booking")
public class Booking {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long bookingId;
	private int UserId;
	private String bookingdate;
	private List<Passenger>PassengerList;
	
	

}
