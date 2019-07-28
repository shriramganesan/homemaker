package com.ram.persistence.entity;

import org.springframework.data.annotation.Id;

import com.ram.domain.EnumMemberType;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberEntity {

	@Id String id;
	String firstName;
	String lastName;
	String mobile;
	String email;
	EnumMemberType memberType;
}
