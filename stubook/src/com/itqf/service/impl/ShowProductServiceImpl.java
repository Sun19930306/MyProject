package com.itqf.service.impl;

import java.util.Map;

import com.itqf.dao.ShowProduct;
import com.itqf.dao.impl.ShowProductDaoImpl;
import com.itqf.service.ShowProductService;

public class ShowProductServiceImpl implements ShowProductService {
	private ShowProduct product = new ShowProductDaoImpl();

	public Map<String, Object> query(int page) {
		return product.query(page);
	}
}
