package com.mrlove.pagedemo;

import androidx.paging.DataSource;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;


@Dao
public interface StudentDao {
    @Insert
    void insertStudents(Student... students);

    @Query("DELETE FROM Student")
    void deleteAllStudents();

    @Query("SELECT * FROM Student ORDER BY id")
    DataSource.Factory<Integer,Student> getAllStudents();
}
