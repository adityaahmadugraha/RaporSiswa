package com.aditya.raporsiswa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
        val mid: String? = intent.getStringExtra("MID")
        val uas: String? = intent.getStringExtra("UAS")
        val kelas: String? = intent.getStringExtra("KELAS")
        val semester: String? = intent.getStringExtra("SEMESTER")
        val jurusan: String? = intent.getStringExtra("JURUSAN")

        binding.tvName.text = name
        binding.tvNisn.text = nisn
        binding.tvNilaimid.text = mid
        binding.tvNilaiuas.text = uas
        binding.tvKelas.text = kelas
        binding.tvSemester.text = semester
        binding.tvJurusan.text = jurusan
    }
}
