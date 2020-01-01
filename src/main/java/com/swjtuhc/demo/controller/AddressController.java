package com.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swjtuhc.demo.model.Address;
import com.swjtuhc.demo.service.AddressService;

@RestController
@RequestMapping("/games")
public class AddressController {
    
	
	@Autowired
	AddressService AddressService;
	
	@RequestMapping("/getAddress")
	public List<Address> getAddress(){
		return AddressService.getAddress();
	}
}
