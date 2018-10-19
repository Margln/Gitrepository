package com.sztheatre.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.sztheatre.entity.User;

public interface UserMapper {
	
	@Select("SELECT * FROM viuser WHERE NAME = #{name}")
	User findByName(@Param("name") String name);
	
	@Insert("INSERT INTO viuser(name, pwd) VALUES(#{name}, #{pwd})")
	int insert(@Param("name") String name, @Param("pwd") String pwd);


}
