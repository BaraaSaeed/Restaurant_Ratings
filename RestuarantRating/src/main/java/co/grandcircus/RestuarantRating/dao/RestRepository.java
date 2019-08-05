/**
 * Copyright (c) 2019.
 * This program and the accompanying materials are made available
 * under my granted permission provided that this note is kept intact, unmodified and unchanged.
 * @ Author: Baraa Ali -  API and implementation.
 * All rights reserved.
*/
/**
 * 
 */
package co.grandcircus.RestuarantRating.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.RestuarantRating.entity.Restaurant;

public interface RestRepository extends JpaRepository<Restaurant, Long> {

}
