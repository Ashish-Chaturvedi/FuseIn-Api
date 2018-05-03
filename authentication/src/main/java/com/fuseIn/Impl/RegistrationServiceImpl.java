package com.fuseIn.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fuseIn.Iservice.IRegister;
import com.fuseIn.Iservice.IRegisterDao;
import com.fuseIn.bo.RegisterUserBO;
import com.fuseIn.dao.RegisterUserDAO;
/*
 * 
 * @author AshishChaturvedi
 * 
 */

@Service
public class RegistrationServiceImpl implements IRegister {

	@Autowired
	private IRegisterDao registerUserDao;

	public void create(RegisterUserBO userBo) {

		RegisterUserDAO userDao = new RegisterUserDAO();

		userDao.setFirstName(userBo.getFirstName());
		userDao.setLastName(userBo.getLastName());
		userDao.setAddress(userBo.getAddress());
		userDao.setAge(userBo.getAge());
		userDao.setEmail(userBo.getEmail());
		userDao.setContact(userBo.getContact());
		userDao.setGender(userBo.getGender());
		userDao.setInterest(userBo.getInterest());

		registerUserDao.create(userDao);
	}

	public IRegisterDao getRegisterUserDao() {
		return registerUserDao;
	}

	public void setRegisterUserDao(IRegisterDao registerUserDao) {
		this.registerUserDao = registerUserDao;
	}

}
