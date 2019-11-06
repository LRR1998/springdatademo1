package com.offcn;

import com.offcn.entity.Student;
import com.offcn.mapper.StudentMapper;
import com.offcn.pojo.Stu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApplication.class)
public class SBTest {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void test1(){
        List<Stu> students = studentMapper.getStudents();
        for (Stu student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void testRedisTemplate(){
        redisTemplate.opsForValue().set("hello","0708java");
        String str = (String)redisTemplate.opsForValue().get("hello");
        System.out.println(str);
        Student student = new Student("张桂军",1,"唱歌","本科","家里蹲",new Date());
        redisTemplate.opsForValue().set("student",student);
        Student student1 = (Student)redisTemplate.opsForValue().get("student");
        System.out.println(student1);
    }
}
