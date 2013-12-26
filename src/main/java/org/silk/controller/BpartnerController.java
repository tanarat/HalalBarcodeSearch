package org.silk.controller;

import java.util.Map;

import org.silk.model.Bpartner;
import org.silk.service.BpartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BpartnerController {
	
	@Autowired
	private BpartnerService service;

	@RequestMapping("/bpartner")
	public String list(Map<String, Object> map){
		Bpartner bpartner = new Bpartner();
		map.put("bpartner", bpartner);
		map.put("bpartnerList", service.list());
		return "bpartner";
	}
}
