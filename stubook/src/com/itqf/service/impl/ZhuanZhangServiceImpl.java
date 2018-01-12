package com.itqf.service.impl;

import java.sql.SQLException;

import com.itqf.dao.ZhuanZhangDao;
import com.itqf.dao.impl.ZhuanZhangDaoImpl;
import com.itqf.service.ZhuanZhangService;
import com.itqf.utils.ManagerTransactionUtils;

public class ZhuanZhangServiceImpl implements ZhuanZhangService{
	ZhuanZhangDao dao=new ZhuanZhangDaoImpl();
	@Override
	public void zhuanZhang(String fromId, String toId, double money) {
		// TODO Auto-generated method stub
		try {
			ManagerTransactionUtils.startTransaction();
		    double fromMoney=  dao.queryMoneyById(fromId);
		     double toMoney =dao.queryMoneyById(toId);
		     fromMoney=  fromMoney-money;
		     toMoney =toMoney+money;
		     dao.updateMoneyById(fromId, fromMoney);
		     dao.updateMoneyById(toId, toMoney);
		     ManagerTransactionUtils.closeTransaction();
		} catch (Exception e) {
				ManagerTransactionUtils.rollBackTransaction();
		}
	}

}
