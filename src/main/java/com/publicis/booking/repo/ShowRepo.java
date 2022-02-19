package com.publicis.booking.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import com.publicis.booking.controller.model.Show;

import jnr.ffi.mapper.FromNativeConverter.Cacheable;
@Cacheable
public interface ShowRepo extends CassandraRepository<Show, Long> {
	
	@Query("select * from Show where theatreId in (:theatreIds) and movieId =: movieId and showDate := date")
	List<Show> findByTheatreIdMovieIdDateTime(List<Long> theatreIds, Long movieId, LocalDate date );

}
