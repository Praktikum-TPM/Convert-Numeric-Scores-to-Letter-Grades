package com.ihzapassya.convertnumericscorestolettergrades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class OutputActivity : AppCompatActivity() {
    private var tvName: TextView? = null
    private var tvNIM: TextView? = null
    private var tvGrade: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output)

        tvName = findViewById(R.id.tv_name)
        tvNIM = findViewById(R.id.tv_nim)
        tvGrade = findViewById(R.id.tv_grade)
        val name = intent.getStringExtra("name")
        val nim = intent.getStringExtra("nim")
        val ipk = intent.getFloatExtra("ipk", 0f)
        val grade = convert(ipk)

        tvName?.setText(name)
        tvNIM?.setText(nim)
        tvGrade?.setText(grade)
    }

    private fun convert(ipk: Float): String {
        val grade: String = if (ipk > 3.66f && ipk <= 4.00f) {
            "A"
        } else if (ipk > 3.33f && ipk <= 3.66f) {
            "A-"
        } else if (ipk > 3.00f && ipk <= 3.33f) {
            "B+"
        } else if (ipk > 2.66f && ipk <= 3.00f) {
            "B"
        } else if (ipk > 2.33f && ipk <= 2.66f) {
            "B-"
        } else if (ipk > 2.00f && ipk <= 2.33f) {
            "C+"
        } else if (ipk > 1.66f && ipk <= 2.00f) {
            "C"
        } else if (ipk > 1.33f && ipk <= 1.66f) {
            "C-"
        } else if (ipk > 1.00f && ipk <= 1.33f) {
            "D+"
        } else if (ipk == 1.00f) {
            "D"
        } else {
            "value cannot be reached"
        }

        return grade;
    }

}
