package by.lebedev.adapterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val listView = findViewById<ListView>(R.id.list_view)

        val personArray: Array<String> = resources.getStringArray(R.array.person_names)

        listView.adapter = ArrayAdapter(this, R.layout.item_person_name, personArray)

        listView.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                Toast.makeText(this@ListViewActivity,personArray[position],Toast.LENGTH_SHORT).show()

            }

        }

    }
}