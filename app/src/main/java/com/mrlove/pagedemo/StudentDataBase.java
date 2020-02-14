package com.mrlove.pagedemo;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = {Student.class},version = 1)
public abstract class StudentDataBase extends RoomDatabase {
    private static StudentDataBase studentDataBase;

    static synchronized StudentDataBase getStudentDataBase(Context context){
        if(studentDataBase == null){
            studentDataBase = Room.databaseBuilder(context,StudentDataBase.class,"students_database")
                    .build();
        }
        return studentDataBase;
    }
    abstract StudentDao getStudentDao();
}
