package com.offcn.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="student")
@Data
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //主键自增长
    private int sid;
    private String sname;
    private int gender;
    private String hobby;
    private String degree;
    private String mark;
    private Date jointime;

    public Student(String sname, int gender, String hobby, String degree, String mark, Date jointime) {
        this.sname = sname;
        this.gender = gender;
        this.hobby = hobby;
        this.degree = degree;
        this.mark = mark;
        this.jointime = jointime;
    }
}
