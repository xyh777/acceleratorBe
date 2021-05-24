package com.accelerator.accelerator.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Student {
    @Id
    private Integer id;
    private String name;
    private String dept_name;//属性名和字段名对应

}
