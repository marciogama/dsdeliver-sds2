package com.marciogama.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marciogama.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
