package com.publicis.booking.repo;

import java.util.List;

import javax.persistence.Cacheable;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.publicis.booking.controller.model.Theatre;
@Cacheable
public interface TheatreRepo extends CassandraRepository<Theatre, Long> {
	public List<Theatre> findByCityId(Long cityId);
}
