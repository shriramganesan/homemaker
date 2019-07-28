package com.ram.persistence.entity;


import org.springframework.data.annotation.Id;

import com.ram.domain.HouseAddress;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class HouseEntity {

	@Id String id;
	String houseName;
	MemberEntity owner;
	HouseAddress address;
	
	
}
