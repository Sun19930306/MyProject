package com.itqf.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.itqf.dao.ShowUser;
import com.itqf.domain.User;
import com.itqf.domain.XueXin;
import com.itqf.test.JDBCUtils;

public class ShowUserDaoImpl implements ShowUser {

	@Override
	public Map<String, Object> query(int currentPage) {
		int pageSize = 4;
		Map<String, Object> map = new HashMap<String, Object>();
		String sql = "select count(*) from xuexin;";
		QueryRunner runner = new QueryRunner(JDBCUtils.getSource());
		try {
			int rows = ((Long) runner.query(sql, new ScalarHandler())).intValue();
			int pageCount = (rows + (pageSize - 1)) / pageSize;
			int start = (currentPage - 1) * pageSize;
			sql = "select * from xuexin limit " + start + "," + pageSize;
			List<XueXin> list = runner.query(sql, new BeanListHandler<XueXin>(XueXin.class));
			map.put("pageCount", pageCount);
			map.put("list", list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}

}
