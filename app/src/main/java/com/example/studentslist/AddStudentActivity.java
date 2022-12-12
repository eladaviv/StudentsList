package com.example.studentslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.studentslist.model.Model;
import com.example.studentslist.model.Student;

public class AddStudentActivity extends AppCompatActivity {
    Student student;
    EditText nameTv;
    EditText idTv;
    EditText phoneTv;
    EditText addressTv;
    Button cancelBtn;
    Button saveBtn;
    CheckBox cb;
    ImageView avatar;
    Intent listIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        listIntent = new Intent(this,
                StudentListRvActivity.class);
        nameTv = findViewById(R.id.add_name_txt);
        idTv =findViewById(R.id.add_id_txt);
        phoneTv =findViewById(R.id.add_phone_txt);
        addressTv =findViewById(R.id.add_address_txt);
        cb =findViewById(R.id.add_checked_chk);
        avatar =findViewById(R.id.add_student_imgv);
        cancelBtn = findViewById(R.id.add_cancel_btn);
        saveBtn = findViewById(R.id.add_save_btn);
        cancelBtn.setOnClickListener(v -> {
            finish();
            listIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(listIntent);
        });
        saveBtn.setOnClickListener(v -> {
            if(isValidateFields()){
                student = new Student(nameTv.getText().toString(),idTv.getText().toString(),phoneTv.getText().toString(),addressTv.getText().toString(),cb.isChecked(),avatar.getId());
                Model.instance.addStudent(student);
                startActivity(listIntent);
            }
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
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    private boolean isValidateFields(){
        if(nameTv.getText().toString().equals("")||idTv.getText().toString().equals("")||phoneTv.getText().toString().equals("")||addressTv.getText().toString().equals(""))
            return false;
        return true;
    }
}