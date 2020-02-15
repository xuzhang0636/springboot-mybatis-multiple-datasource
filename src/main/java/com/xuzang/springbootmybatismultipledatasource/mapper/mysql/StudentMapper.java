package com.xuzang.springbootmybatismultipledatasource.mapper.mysql;

import com.xuzang.springbootmybatismultipledatasource.model.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> getStudents();
}
