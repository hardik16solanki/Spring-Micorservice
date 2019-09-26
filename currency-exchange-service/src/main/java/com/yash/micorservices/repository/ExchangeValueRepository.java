package com.yash.micorservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.micorservices.entities.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{

	ExchangeValue findByFromAndTo(String from,String to);
}
