package com.publicis.booking.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.publicis.booking.controller.model.Booking;
import com.publicis.booking.controller.model.BookingRequest;
import com.publicis.booking.controller.model.BookingResponse;
import com.publicis.booking.controller.model.BookingStatus;
import com.publicis.booking.controller.model.MovieSchedule;
import com.publicis.booking.controller.model.PaymentDetails;
import com.publicis.booking.controller.model.PaymentStatus;
import com.publicis.booking.controller.model.SeatStatus;
import com.publicis.booking.controller.model.Show;
import com.publicis.booking.controller.model.ShowSeating;
import com.publicis.booking.controller.model.Theatre;
import com.publicis.booking.repo.MovieScheduleRepo;
import com.publicis.booking.repo.ShowRepo;
import com.publicis.booking.repo.TheatreRepo;

import io.netty.util.internal.StringUtil;

@Service
public class BookingService {
	@PersistenceContext // or even @Autowired
	private EntityManager entityManager;

	@Autowired
	private TheatreRepo theatreRepo;
	
	@Autowired
	private MovieScheduleRepo movieScheduleRepo;
	
	@Transactional
	public BookingResponse book(BookingRequest bookingRequest) {
		List<ShowSeating> seats = entityManager
				.createQuery("select s from ShowSeating s where s.id in :ids and s.seatStatus =:seatStatus",
						ShowSeating.class)
				.setParameter("ids", bookingRequest.getShowSeats()).setParameter("seatStatus", SeatStatus.AVAILABLE)
				.getResultList();
		if (CollectionUtils.isEmpty(seats) || seats.size() != bookingRequest.getShowSeats().size())
			return new BookingResponse(null, seats, BookingStatus.FAILED, "Not all seats available");
		PaymentDetails pd = entityManager.find(PaymentDetails.class, bookingRequest.getPaymentId());
		if (Objects.isNull(pd) || pd.getPaymentStatus() != PaymentStatus.CONFIRMED)
			return new BookingResponse(null, seats, BookingStatus.FAILED, "Payment not confirmed");

		Booking booking = new Booking();
		booking.setUserId(bookingRequest.getUserId());
		booking.setBookingTime(LocalDateTime.now());
		booking.setShowId(bookingRequest.getShowId());
		booking.setPaymentDetailId(bookingRequest.getPaymentId());
		entityManager.persist(booking);
		for (ShowSeating showSeating : seats) {
			showSeating.setSeatStatus(SeatStatus.BOOKED);
			showSeating.setBookingId(booking.getId());
			entityManager.persist(showSeating);
		}
		return new BookingResponse(booking.getId(), seats, BookingStatus.CONFIRMED, StringUtil.EMPTY_STRING);
	}
	
	public List<Show> getAllTheatres(Long movieId, Long cityId, LocalDate date){
		List<Theatre> cityTheatres = theatreRepo.findByCityId(cityId);
		List<Long> theatreIds = cityTheatres.stream().map(t -> t.getId()).collect(Collectors.toList());
		return ShowRepo.
	}mapToLong
}
