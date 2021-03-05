package by.lebedev.adapterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class AutocompleteViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_autocomplete_view)

        val autocompleteView = findViewById<AutoCompleteTextView>(R.id.autocomplete_view)

        val personArray: Array<String> = resources.getStringArray(R.array.person_names)

        autocompleteView.setAdapter(ArrayAdapter(this, R.layout.item_person_name, personArray))
    }
}