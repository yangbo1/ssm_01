package com.yb.dao;


import java.util.List;

import com.yb.model.Student;
import com.yb.model.StudentExample;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    int countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer studentId);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer studentId);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);


    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    Student selectByNumber(Integer integer);

//    @Update("update student set name = #{name}, number = #{number}, sex = #{sex}, birthday = #{birthday}, grade_id = #{gradeId)")
//    void update(Student student);
//    @Insert("insert into student (number, name, sex, birthday, grade_id) values (#{number}, #{name}, #{sex}, birthday = #{birthday}, #{gradeId})")
//    void insert1(Student student);
}