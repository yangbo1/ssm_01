package com.yb.service.impl;

import com.yb.dao.StudentMapper;
import com.yb.model.Student;
import com.yb.model.StudentExample;
import com.yb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by 杨波 on 2017/3/14.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    /**
     * 获取所有的学生
     */
    @Override
    public List<Student> getAllStudent() {
        return studentMapper.selectByExample(new StudentExample());
    }

    /**
     * 删除学生
     */
    @Override
    public void deleteStudent(Integer id) {
        studentMapper.deleteByPrimaryKey(id);
    }
    @Override
    public Student getStudent(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    /**
     * 更新学生
     */
    @Override
    public void updateStudent(Student student) {
        studentMapper.updateByPrimaryKey(student);
    }
    /**
     * 添加学生
     */
    @Override
    public void addStudent(Student student) {
        studentMapper.insertSelective(student);
    }

    /**
     * 按学号查询
     */
    @Override
    public Student getStudentByNumber(Integer number) {
        return studentMapper.selectByNumber(number);
    }

}
