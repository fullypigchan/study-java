package com.app.domain;

import java.util.Objects;

//id bigint unsigned auto_increment primary key,
//owner_name varchar(255) not null,
//owner_age int,
//owner_phone varchar(255) not null,
//owner_address varchar(255) not null,
//owner_address_detail varchar(255) not null
public class OwnerVO {
	private Long id;
	private String ownerName;
	private int ownerAge;
	private String ownerPhone;
	private String ownerAddress;
	private String ownerAddressDetail;

	public OwnerVO() {
		;
	}

	public OwnerVO(Long id, String ownerName, int ownerAge, String ownerPhone, String ownerAddress,
			String ownerAddressDetail) {
		super();
		this.id = id;
		this.ownerName = ownerName;
		this.ownerAge = ownerAge;
		this.ownerPhone = ownerPhone;
		this.ownerAddress = ownerAddress;
		this.ownerAddressDetail = ownerAddressDetail;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getOwnerAge() {
		return ownerAge;
	}

	public void setOwnerAge(int ownerAge) {
		this.ownerAge = ownerAge;
	}

	public String getOwnerPhone() {
		return ownerPhone;
	}

	public void setOwnerPhone(String ownerPhone) {
		this.ownerPhone = ownerPhone;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	public String getOwnerAddressDetail() {
		return ownerAddressDetail;
	}

	public void setOwnerAddressDetail(String ownerAddressDetail) {
		this.ownerAddressDetail = ownerAddressDetail;
	}

	@Override
	public String toString() {
		return "OwnerVO [id=" + id + ", ownerName=" + ownerName + ", ownerAge=" + ownerAge + ", ownerPhone="
				+ ownerPhone + ", ownerAddress=" + ownerAddress + ", ownerAddressDetail=" + ownerAddressDetail + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OwnerVO other = (OwnerVO) obj;
		return Objects.equals(id, other.id);
	}

}
