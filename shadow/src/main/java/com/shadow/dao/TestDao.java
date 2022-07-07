package com.shadow.dao;


import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

public interface TestDao {

	@Select("select user_id as userId,user_name as userName from user_info")
	public List<Map<String,Object>> query();
}
