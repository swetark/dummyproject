package com.brs.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {
	private int reservationId;
	private String reservationStatus;
	private String reservationType;
	private LocalDate reservationDate;
	private LocalTime reservationTime;
	private String source;
	private String destination;
	private Bus bus;

}
