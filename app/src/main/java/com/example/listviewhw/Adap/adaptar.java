package com.example.listviewhw.Adap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listviewhw.Pogo.Student;
import com.example.listviewhw.R;

import java.util.ArrayList;

public class adaptar extends ArrayAdapter<Student> {
    private ArrayList<Student> students;
    private Context context;
    public adaptar(@NonNull Context context, ArrayList<Student> students) {
        super(context, R.layout.tabel, students);
        this.context=context;
        this.students=students;
        }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        TextView studentnameTV,studentIdTV;
        ImageView imageback;
               LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
             View view=  inflater.inflate(R.layout.tabel, parent,false);

             studentnameTV=view.findViewById(R.id.name_tabelTV);
             studentIdTV=view.findViewById(R.id.id_tabelTV);
             imageback=view.findViewById(R.id.imageTV);

             studentnameTV.setText(students.get(position).getStudentName());
             studentIdTV.setText(students.get(position).getStudentID());
             imageback.setImageResource(students.get(position).getImage());
        return view;
    }
}
