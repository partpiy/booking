package com.publicis.booking.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.publicis.booking.controller.model.ShowSeating;

public interface ShowSeatRepo extends JpaRepository<ShowSeating, UUID> {

}
