package com.swjtuhc.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swjtuhc.demo.mapper.AddressMapper;
import com.swjtuhc.demo.model.Address;
import com.swjtuhc.demo.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	AddressMapper addressMapper;
	@Override
	public List<Address> getAddress() {
		// TODO Auto-generated method stub
		return addressMapper.selectAddress();
	}
	

}
