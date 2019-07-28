package com.ram.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ram.domain.rest.HouseInfo;
import com.ram.persistence.entity.HouseEntity;
import com.ram.persistence.entity.MemberEntity;
import com.ram.persistence.repo.HouseRepo;
import com.ram.persistence.repo.MemberRepo;

@RestController
@RequestMapping("/house")
public class HouseRestService {
	
	@Autowired
	HouseRepo repo;
	
	@Autowired
	MemberRepo memberRepo;
	
	@PostMapping(path="/store",consumes = {"application/json"})
	public HouseInfo storeHouseDetails(@RequestBody HouseInfo info) {
		/*HouseInfo info = new HouseInfo();
		info.setHouseName("shriram");
		MemberInfo owner = new MemberInfo();
		owner.setFirstName("dummy");
		owner.setLastName("dummy");
		owner.setMemberType(EnumMemberType.OWNER);
		owner.setMobile("9668773569");
		@NonNull
		HouseAddress address = new HouseAddress();
		address.setAddressLine1("dummy");
		address.setAddressLine2("dummy");
		address.setCity("dummy");
		address.setPincode("751001");
		address.setState("dummy");
		info.setAddress(address);
		info.setOwner(owner);
		
		return info;*/
		System.out.println(info);
		MemberEntity owner = new MemberEntity();
		owner.setFirstName(info.getOwner().getFirstName());
		memberRepo.save(owner);
		
		HouseEntity entity = new HouseEntity();
		entity.setAddress(info.getAddress());
		entity.setHouseName(info.getHouseName());
		entity.setOwner(memberRepo.findById(owner.getId()).get());
		repo.save(entity);
		return info;
	}
}

