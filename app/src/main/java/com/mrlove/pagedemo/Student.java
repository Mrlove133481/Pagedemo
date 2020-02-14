package com.mrlove.pagedemo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
//entity声明定义，并且指定了映射数据表明
@Entity
public class Student {
    //设置主键自动增长
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int studentNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}
