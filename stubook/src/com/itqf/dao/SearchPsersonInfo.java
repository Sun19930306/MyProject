package com.itqf.dao;
import java.sql.SQLException;
import java.util.List;
import com.itqf.domain.ProductAndStudent;
public interface SearchPsersonInfo {
	public List<ProductAndStudent> searchPerson() throws SQLException;
}
