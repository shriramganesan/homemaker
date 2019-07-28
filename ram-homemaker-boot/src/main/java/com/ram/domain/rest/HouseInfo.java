package com.ram.domain.rest;

import com.ram.domain.HouseAddress;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter 
@Setter
public class HouseInfo {
	
	@NonNull String houseName;
	@NonNull MemberInfo owner;
	@NonNull HouseAddress address;
	@Override
	public String toString() {
		return "HouseInfo [houseName=" + houseName + ", owner=" + owner + ", address=" + address + "]";
	}
	
}
