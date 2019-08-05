/**
 * Copyright (c) 2019.
 * This program and the accompanying materials are made available
 * under my granted permission provided that this note is kept intact, unmodified and unchanged.
 * @ Author: Baraa Ali -  API and implementation.
 * All rights reserved.
*/

package co.grandcircus.RestuarantRating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.RestuarantRating.dao.RestRepository;
import co.grandcircus.RestuarantRating.entity.Restaurant;

@Controller
public class RestaurantController {

	@Autowired
	RestRepository restRepo;

	@RequestMapping("/")
	public ModelAndView showHome() {
		return new ModelAndView("redirect:/index");

	}

	@RequestMapping("/index")
	public ModelAndView processRatings() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("restaurants", restRepo.findAll());
		return mav;
	}

	@RequestMapping("/upvote")
	public ModelAndView processUpvote(@RequestParam("id") Long id) {

		Restaurant rest = restRepo.getOne(id);
		rest.setRating(rest.getRating() + 1);
		restRepo.save(rest);
		return new ModelAndView("redirect:/index");
	}

}