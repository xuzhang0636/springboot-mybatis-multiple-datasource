package com.xuzang.springbootmybatismultipledatasource.mapper;

import com.xuzang.springbootmybatismultipledatasource.mapper.mysql.StudentMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestStudentMapper {
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testFindStudents() {
        Assertions.assertEquals(2, studentMapper.getStudents().size());
    }
}
