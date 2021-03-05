package by.lebedev.adapterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class SpinnerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner_view)

        val spinnerView = findViewById<Spinner>(R.id.spinner_view)

        val personArray = resources.getStringArray(R.array.person_names)

        spinnerView.adapter = ArrayAdapter(this, R.layout.item_person_name, personArray)

        spinnerView.setSelection(-1)

        spinnerView.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {

                Toast.makeText(this@SpinnerViewActivity,personArray[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
    }
}