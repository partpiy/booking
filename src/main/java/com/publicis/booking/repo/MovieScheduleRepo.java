package com.publicis.booking.repo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.persistence.Cacheable;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import com.publicis.booking.controller.model.MovieSchedule;
import com.publicis.booking.controller.model.Theatre;

@Cacheable 
public interface MovieScheduleRepo extends CassandraRepository<MovieSchedule, UUID> {

	@Query("select * from MovieSchedule where theatreId in (:theatreIds) and movieId =: movieId and :dateTime between startDate and endDate")
	List<Theatre> findByTheatreIdMovieIdDateTime(List<Long> theatreIds, Long movieId, LocalDateTime dateTime );
}
