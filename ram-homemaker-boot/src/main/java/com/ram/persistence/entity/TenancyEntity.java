package com.ram.persistence.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;

import com.ram.domain.AttachmentFiles;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TenancyEntity {

	@Id String id;
	HouseEntity houseEntity;
	MemberEntity[] tenants;
	
	Double rent;
	Date dateFrom;
	Date dateTo;
	Double maintenance;
	AttachmentFiles[] files;
	
}
