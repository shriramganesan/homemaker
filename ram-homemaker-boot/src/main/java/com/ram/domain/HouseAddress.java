package com.ram.domain;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter @Setter
public class HouseAddress {
	
	@NonNull String addressLine1;
	String addressLine2;
	@NonNull String city;
    @NonNull String state;
    @NonNull String country;
    @NonNull String pincode;
}
