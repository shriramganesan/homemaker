package com.ram.domain.rest;

import com.ram.domain.EnumMemberType;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter @Setter
public class MemberInfo {
	@NonNull String firstName;
	@NonNull String lastName;
	@NonNull String mobile;
	@NonNull String email;
	@NonNull EnumMemberType memberType;
}
