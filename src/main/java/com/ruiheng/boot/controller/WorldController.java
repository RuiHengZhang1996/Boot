package com.ruiheng.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {

		@RequestMapping("/w")
		public String TheWorld() {
			return "THE! WorlD!";
		}
}
