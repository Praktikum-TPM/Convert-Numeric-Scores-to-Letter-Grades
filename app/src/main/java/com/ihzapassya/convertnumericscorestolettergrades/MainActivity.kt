package com.ihzapassya.convertnumericscorestolettergrades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private var btnConvert: Button? = null
    private var etName: EditText? = null
    private var etNIM: EditText? = null
    private var etIPK: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.et_name)
        etNIM = findViewById(R.id.et_nim)
        etIPK = findViewById(R.id.et_ipk)
        btnConvert = findViewById(R.id.btn_convert)
        btnConvert?.setOnClickListener(View.OnClickListener {
            val data = Intent(this@MainActivity, OutputActivity::class.java)
            val name = etName?.text.toString()
            val nim = etNIM?.text.toString()
            val ipk = (etIPK?.text.toString()).toFloat()
            data.putExtra("name", name)
            data.putExtra("nim", nim)
            data.putExtra("ipk", ipk)

            startActivity(data)
        })
    }
}
