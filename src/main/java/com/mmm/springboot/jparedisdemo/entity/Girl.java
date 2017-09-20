package com.mmm.springboot.jparedisdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class Girl implements Serializable{
    @Id
    @GeneratedValue
    private Integer id;
    @NotNull(message = "名字不能为空")
    private String name;
    @Min(1)
    @NotNull(message = "年龄不能为空")
    private Integer age;
    private Character cupSize;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getCupSize() {
        return cupSize;
    }

    public void setCupSize(Character cupSize) {
        this.cupSize = cupSize;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
