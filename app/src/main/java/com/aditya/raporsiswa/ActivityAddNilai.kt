package com.aditya.raporsiswa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.aditya.raporsiswa.databinding.ActivityAddNilaiBinding
import com.google.android.material.textfield.TextInputEditText

class ActivityAddNilai : AppCompatActivity() {

    private lateinit var binding: ActivityAddNilaiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNilaiBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val adapterKelas = ArrayAdapter.createFromResource(
            this,
            R.array.kelas_array,
            android.R.layout.simple_spinner_item
        )
        adapterKelas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerKelas.adapter = adapterKelas

        val adapterSemester = ArrayAdapter.createFromResource(
            this,
            R.array.semester_array,
            android.R.layout.simple_spinner_item
        )
        adapterSemester.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerSemester.adapter = adapterSemester

        val adapterJurusan = ArrayAdapter.createFromResource(
            this,
            R.array.jurusan_array,
            android.R.layout.simple_spinner_item
        )
        adapterJurusan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerJurusan.adapter = adapterJurusan

        binding.btnAddData.setOnClickListener {
            val name = binding.edtName.text.toString()
            val nisn = binding.edtNisn.text.toString()
            val agama = binding.edtAgama.text.toString()
            val database = binding.edtDatabase.text.toString()
            val jaringan = binding.edtJaringan.text.toString()
            val mtk = binding.edtMtk.text.toString()
            val bInggris = binding.edtBIngris.text.toString()
            val kelas = binding.spinnerKelas.selectedItem.toString()
            val semester = binding.spinnerSemester.selectedItem.toString()
            val jurusan = binding.spinnerJurusan.selectedItem.toString()

            // Create an Intent to start the ActivityRapor
            val intent = Intent(this, ActivityRapor::class.java)

            // Pass the data to the next activity using Intent extras
            intent.putExtra("NAME", name)
            intent.putExtra("NISN", nisn)
            intent.putExtra("AGAMA", agama)
            intent.putExtra("DATABASE", database)
            intent.putExtra("JARINGAN", jaringan)
            intent.putExtra("MTK", mtk)
            intent.putExtra("BINGGRIS", bInggris)
            intent.putExtra("KELAS", kelas)
            intent.putExtra("SEMESTER", semester)
            intent.putExtra("JURUSAN", jurusan)

            startActivity(intent)
        }
    }
}