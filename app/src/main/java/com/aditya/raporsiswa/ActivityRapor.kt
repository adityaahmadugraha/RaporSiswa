package com.aditya.raporsiswa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.aditya.raporsiswa.databinding.ActivityRaporBinding

class ActivityRapor : AppCompatActivity() {

    private lateinit var binding: ActivityRaporBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRaporBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent: Intent = getIntent()
        val name: String? = intent.getStringExtra("NAME")
        val nisn: String? = intent.getStringExtra("NISN")
        val kelas: String? = intent.getStringExtra("KELAS")
        val semester: String? = intent.getStringExtra("SEMESTER")
        val jurusan: String? = intent.getStringExtra("JURUSAN")
        val mid = intent.getDoubleExtra("MID", 0.0)
        val uas = intent.getDoubleExtra("UAS", 0.0)
        val nilaiAkhir = intent.getDoubleExtra("NILAI_AKHIR", 0.0)


    }
}
