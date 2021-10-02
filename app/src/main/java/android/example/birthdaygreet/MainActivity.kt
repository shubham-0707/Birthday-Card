package android.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayButton(view: View) {
        val name = findViewById<EditText>(R.id.editTextTextPersonName)
        val message = name.text.toString()
        val intent = Intent(this , generate_card::class.java)
        intent.putExtra(generate_card.NAME_EXTRA , message)
        startActivity(intent)
        Toast.makeText(this , "Happy Birthday!" , Toast.LENGTH_LONG).show()
    }
}