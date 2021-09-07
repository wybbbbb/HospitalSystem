package com.dgut.hospitalsystem.Bean;

import java.util.Date;

public class Doctor extends Person{
    private String department;
    private String category;       //专家号、普通号
    private String expertAt;       //擅长
    private String introduction;   //简介
    private int[] workshift;       //工作时间
    private boolean onDuty;        //是否在岗
    private int count;             //每班问诊人数
}
