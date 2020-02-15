package com.xuzang.springbootmybatismultipledatasource.mapper.postgre;

import com.xuzang.springbootmybatismultipledatasource.model.Teacher;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> getTeachers();
}
