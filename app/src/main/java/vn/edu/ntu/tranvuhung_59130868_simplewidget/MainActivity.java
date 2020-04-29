package vn.edu.ntu.tranvuhung_59130868_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView stKhac;
    EditText edtten, edtngaysinh;
    RadioGroup rdgGT;
    CheckBox cb1, cb2, cb3, cb4, cb5;
    Button btnXacNhan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addVieWs();
        addEvents();
    }

    private void addVieWs() {
        stKhac = findViewById(R.id.txtSoThich);
        edtten = findViewById(R.id.edtten);
        edtngaysinh = findViewById(R.id.edtngaysinh);
        rdgGT = findViewById(R.id.rdgGT);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);
        btnXacNhan = findViewById(R.id.btnXacNhan);
    }

    private void addEvents() {
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xacdinhTT();
            }
        });
    }

    private void xacdinhTT() {
        String ten= edtten.getText()+"";
        String ns = edtngaysinh.getText()+"";
        String GT = "Giới Tính: ";
        switch (rdgGT.getCheckedRadioButtonId()) {
            case R.id.rbNam:
                GT = GT+ "Nam";
                break;

            case R.id.rbNu:
                GT =GT+ "Nữ";
                break;


        }
        String soThich="";
        if(cb1.isChecked())
            soThich+=cb1.getText()+",";
        if(cb2.isChecked())
            soThich+=cb2.getText()+",";
        if(cb3.isChecked())
            soThich+=cb3.getText()+",";
        if(cb4.isChecked())
            soThich+=cb4.getText()+",";
        if(cb5.isChecked())
            soThich+=cb5.getText()+",";
        String khac = stKhac.getText()+"";
        soThich+=khac;
        String str="Tên"+ten+
                "\n Ngày Sinh: "+ns+
                "\n "+GT+
                "\n Sở Thích: "+soThich;
        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG).show();
    }
}
