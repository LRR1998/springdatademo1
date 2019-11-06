package com.offcn.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Data
public class Stu implements Serializable {

    private int sid;
    private String sname;
    private int gender;
    private String hobby;
    private String degree;
    private String mark;
    private Date jointime;
}
