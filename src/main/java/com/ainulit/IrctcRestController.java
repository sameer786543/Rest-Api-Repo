package com.ainulit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IrctcRestController {
	private Map<String,String> hm=new HashAmp<>();

       private String url="www.ainulit.com";
	

	@GetMapping(value = "/book")
	public String bookTicket()
	{
		return "Confirmed";
	}

}
