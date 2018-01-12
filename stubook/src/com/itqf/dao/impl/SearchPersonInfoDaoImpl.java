package com.itqf.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.itqf.dao.SearchPsersonInfo;
import com.itqf.domain.Product;
import com.itqf.domain.ProductAndStudent;
import com.itqf.utils.JDBCUtils;

public class SearchPersonInfoDaoImpl implements SearchPsersonInfo{

	@Override
	public List<ProductAndStudent> searchPerson() throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(JDBCUtils.getSource());
		String sql="select p_s.username,p_s.product_id,product.product_name,product.product_url from p_s left join product on p_s.product_id=product.product_id;";
			List<ProductAndStudent> list = runner.query(sql, new BeanListHandler<ProductAndStudent>(ProductAndStudent.class));
		return list;
		
	}

}
