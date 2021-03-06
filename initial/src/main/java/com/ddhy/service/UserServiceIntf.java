package com.ddhy.service;

import com.ddhy.domain.YybDriverAccount;
import com.ddhy.domain.YybUserAccount;

public interface UserServiceIntf {
	public YybUserAccount cusLogin(String fakeName,String password);
	public YybDriverAccount drvLogin(String fakeName,String password);
	public YybUserAccount cusRegister(YybUserAccount cus);
	public Boolean checkCusToken(String token,int userid);
	public YybDriverAccount drvRegister(YybDriverAccount drv);
	public Boolean uploadPic();
	public Boolean uploadLicencePic();
	public Boolean uploadCarLicencePic();
}
