package com.example.demo.mapper.Car;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.Car;

@Mapper
public interface CarMapper {

	@Select("select * from CAR")
	List<Car> findAll();

	@Insert("insert into car(make, model,comment) values( #{make}, #{model}, #{comment})")
	@Options(useGeneratedKeys = true)
	void insert(Car car);

	@Delete("delete from car where id = #{id}")
	void deleteById(int id);

	List<Car> search(@Param("make") String make, @Param("model") String model, @Param("comment") String comment);
}
