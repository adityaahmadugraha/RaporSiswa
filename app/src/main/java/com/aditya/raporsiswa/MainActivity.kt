package com.aditya.raporsiswa

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.ImageView
import android.widget.TextView
import com.aditya.raporsiswa.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val calendar = Calendar.getInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.imgAdd.setOnClickListener {
            val intent = Intent(this@MainActivity, ActivityAddNilai::class.java)
            startActivity(intent)
        }


        val dateTextView: TextView = findViewById(R.id.dateTextView)

        // Membuat instance Calendar
        val calendar = Calendar.getInstance()

        // Format tanggal ke dalam format yang diinginkan
        val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        val currentDate = dateFormat.format(calendar.time)

        // Set tanggal yang diformat ke TextView
        dateTextView.text = currentDate
    }
}