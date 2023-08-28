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

        binding.imgBack.setOnClickListener {
            intent = Intent(this@ActivityRapor, ActivityAddNilai::class.java)
            startActivity(intent)
        }

        // Menerima data dari intent
        val intent = intent
        val namaSiswa = intent.getStringExtra("NAME")
        val nisn = intent.getStringExtra("NISN")
        val agama = intent.getStringExtra("AGAMA")
        val database = intent.getStringExtra("DATABASE")
        val jaringan = intent.getStringExtra("JARINGAN")
        val mtk = intent.getStringExtra("MTK")
        val bInggris = intent.getStringExtra("BINGGRIS")
        val bIndo = intent.getStringExtra("BINDO")
        val kelas = intent.getStringExtra("KELAS")
        val semester = intent.getStringExtra("SEMESTER")
        val jurusan = intent.getStringExtra("JURUSAN")

        // Menampilkan data yang diterima di TextView
        binding.tvName.text = "$namaSiswa"
        binding.tvNisn.text = "$nisn"
        binding.tvAgama.text = "$agama"
        binding.tvDatabase.text = "$database"
        binding.tvJaringan.text = "$jaringan"
        binding.tvMatematika.text = "$mtk"
        binding.tvBInggris.text = "$bInggris"
        binding.tvBIndo.text = "$bIndo"
        binding.tvKelas.text = "$kelas"
        binding.tvSemester.text = "$semester"
        binding.tvJurusan.text = "$jurusan"
    }
}