package com.dubbo.exercise.entity;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by liusonglin
 * Date:2017/7/6
 * Description:
 */
@Data
@Table(name = "t_other")
public class Other implements Serializable {

    private Integer id;

    private String otherName;

    private String otherThing;
}
