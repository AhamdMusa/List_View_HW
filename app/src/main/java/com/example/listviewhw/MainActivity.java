package com.example.listviewhw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.listviewhw.Adap.adaptar;
import com.example.listviewhw.Pogo.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private Student student;
    private ArrayList<Student> students;
    private adaptar studentadaptar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview_main);
        student = new Student();
        students = student.getAllStudent();
        studentadaptar = new adaptar(this, students);
        listView.setAdapter(studentadaptar);
    }

}
