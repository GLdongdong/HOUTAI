package com.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.swjtuhc.demo.model.Address;

@Mapper
public interface AddressMapper {

	public List<Address> selectAddress();
}
