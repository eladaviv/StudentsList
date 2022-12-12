package com.example.studentslist;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.studentslist.model.Model;
import com.example.studentslist.model.Student;

public class StudentDetailsActivity extends AppCompatActivity {
    Student student;
    TextView nameTv;
    TextView idTv;
    TextView phoneTv;
    TextView addressTv;
    CheckBox cb;
    Button editBtn;
    ImageView avatar;
    Intent EditIntent;
    int pos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);
        nameTv = findViewById(R.id.details_name_text_view);
        idTv = findViewById(R.id.details_id_text_view);
        phoneTv = findViewById(R.id.details_phone_text_view);
        addressTv = findViewById(R.id.details_address_text_view);
        cb = findViewById(R.id.details_checked_box);
        avatar = findViewById(R.id.details_student_imgv);
        editBtn=findViewById(R.id.details_to_edit_btn);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            pos = extras.getInt("pos");
            student = Model.instance.getAllStudents().get(pos);
            nameTv.setText(student.getName());
            idTv.setText(student.getId());
            addressTv.setText(student.getAddress());
            phoneTv.setText(student.getPhone());
            cb.setChecked(student.isFlag());
        }
        editBtn.setOnClickListener(v -> {
            EditIntent = new Intent(v.getContext(),
                    EditStudentActivity.class);
            EditIntent.putExtra("pos",pos);
            startActivity(EditIntent);
        });

    }
    @Override
    protected void onPause() {
        super.onPause();
    }


    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            pos = extras.getInt("pos");
            student = Model.instance.getAllStudents().get(pos);
            nameTv.setText(student.getName());
            idTv.setText(student.getId());
            addressTv.setText(student.getAddress());
            phoneTv.setText(student.getPhone());
            cb.setChecked(student.isFlag());
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}