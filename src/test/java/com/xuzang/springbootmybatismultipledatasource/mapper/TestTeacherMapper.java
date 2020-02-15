package com.xuzang.springbootmybatismultipledatasource.mapper;

import com.xuzang.springbootmybatismultipledatasource.mapper.postgre.TeacherMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestTeacherMapper {
    @Autowired
    private TeacherMapper teacherMapper;

    @Test
    void testGetTeachers() {
        Assertions.assertEquals(2, teacherMapper.getTeachers().size());
    }
}
