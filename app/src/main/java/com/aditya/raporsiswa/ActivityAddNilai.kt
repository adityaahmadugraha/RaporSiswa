package com.aditya.raporsiswa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.aditya.raporsiswa.databinding.ActivityAddNilaiBinding
import com.google.android.material.textfield.TextInputEditText

class ActivityAddNilai : AppCompatActivity() {

    private lateinit var binding: ActivityAddNilaiBinding

    private lateinit var txtName: TextInputEditText
    private lateinit var txtNisn: TextInputEditText
    private lateinit var txtMid: TextInputEditText
    private lateinit var txtUas: TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityAddNilaiBinding.inflate(layoutInflater)
        setContentView(binding.root)


        txtName = binding.edtName
        txtNisn = binding.edtNisn
        txtMid = binding.edtMid
        txtUas = binding.edtUas

        // Mengatur adapter untuk Spinner Kelas
        val adapterKelas = ArrayAdapter.createFromResource(
            this,
            R.array.kelas_array,
            android.R.layout.simple_spinner_item
        )
        adapterKelas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerKelas.adapter = adapterKelas

        // Mengatur adapter untuk Spinner Semester
        val adapterSemester = ArrayAdapter.createFromResource(
            this,
            R.array.semester_array,
            android.R.layout.simple_spinner_item
        )
        adapterSemester.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerSemester.adapter = adapterSemester

        // Mengatur adapter untuk Spinner Jurusan
        val adapterJurusan = ArrayAdapter.createFromResource(
            this,
            R.array.jurusan_array,
            android.R.layout.simple_spinner_item
        )
        adapterJurusan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerJurusan.adapter = adapterJurusan


        binding.btnAddData.setOnClickListener {
            val name = txtName.text.toString()
            val nisn = txtNisn.text.toString()
//            val mid = txtMid.text.toString()
//            val uas = txtUas.text.toString()
            val midStr = txtMid.text.toString()
            val uasStr = txtUas.text.toString()

            if (midStr.isEmpty() || uasStr.isEmpty()) {
                return@setOnClickListener
            }
            val mid = midStr.toDouble()
            val uas = uasStr.toDouble()


            if (mid > 100 || uas > 100) {
                return@setOnClickListener
            }

            val nilaiAkhir = (mid * 0.4) + (uas * 0.6)

            val kelas = binding.spinnerKelas.selectedItem.toString()
            val semester = binding.spinnerSemester.selectedItem.toString()
            val jurusan = binding.spinnerJurusan.selectedItem.toString()

            // Membuat objek Intent untuk berpindah ke ActivityRapor
            val intent = Intent(this, ActivityRapor::class.java)

            // Mengirim data melalui Intent
            intent.putExtra("NAME", name)
            intent.putExtra("NISN", nisn)
            intent.putExtra("MID", mid)
            intent.putExtra("UAS", uas)
            intent.putExtra("KELAS", kelas)
            intent.putExtra("SEMESTER", semester)
            intent.putExtra("JURUSAN", jurusan)
            intent.putExtra("NILAI_AKHIR", nilaiAkhir)

            startActivity(intent)
        }

    }
}