package dto;

import java.util.List;

import entity.Account;
import entity.PlaceApply;

public class PlaceApplyDto {
	// 场地申请的集合
	private PlaceApply placeApply;

	// 账号
	private Account account;
	
	public PlaceApply getPlaceApply() {
		return placeApply;
	}

	public void setPlaceApply(PlaceApply placeApply) {
		this.placeApply = placeApply;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
