package com.dubbo.exercise.api.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by liusonglin
 * Date:2017/7/6
 * Description:
 */
@Data
@Table(name = "t_demo")
public class Demo implements Serializable {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer age;

    private Double money;
}
