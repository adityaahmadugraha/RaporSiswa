package com.aditya.raporsiswa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class ActivityAddNilai : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_nilai)


//        val spinnerKelas: Spinner = findViewById(R.id.spinner_kelas)
//        val adapter = ArrayAdapter.createFromResource(
//            this,
//            R.array.kelas_array, android.R.layout.simple_spinner_item
//        )
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        spinnerKelas.adapter = adapter
//
//    }
//}
        val spinnerKelas: Spinner = findViewById(R.id.spinner_kelas)
        val spinnerSemester: Spinner = findViewById(R.id.spinner_semester)
        val spinnerJurusan: Spinner = findViewById(R.id.spinner_Jurusan)

        val adapterKelas = ArrayAdapter.createFromResource(this, R.array.kelas_array, android.R.layout.simple_spinner_item)
        adapterKelas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerKelas.adapter = adapterKelas

        val adapterSemester = ArrayAdapter.createFromResource(this, R.array.semester_array, android.R.layout.simple_spinner_item)
        adapterSemester.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerSemester.adapter = adapterSemester


        val adapterJurusan = ArrayAdapter.createFromResource(this, R.array.jurusan_array, android.R.layout.simple_spinner_item)
        adapterJurusan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerJurusan.adapter = adapterJurusan
    }
}