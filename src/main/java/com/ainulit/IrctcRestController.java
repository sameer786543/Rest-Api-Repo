package com.ainulit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IrctcRestController {
	private Map<String,String> hm=new HashAmp<>();
	@GetMapping(value = "/book")
	public String bookTicket()
	{
		return "Confirmed";
	}

}
