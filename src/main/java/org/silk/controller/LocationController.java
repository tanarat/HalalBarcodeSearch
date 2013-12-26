package org.silk.controller;

import java.util.Map;

import org.silk.model.Location;
import org.silk.service.LocaionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocationController {
	
	@Autowired
	private LocaionService service;

	@RequestMapping("/location")
	public String list(Map<String, Object> map){
		Location location = new Location();
		map.put("location", location);
		map.put("locationList", service.list());
		return "location";
	}
}
