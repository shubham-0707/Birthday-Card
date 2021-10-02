package android.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class generate_card : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_get"
    }
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generate_card)

        val name = intent.getStringExtra(NAME_EXTRA)

        val greet = findViewById<TextView>(R.id.greeting)
        greet.text = "Happy Birthday\n $name!"
    }
}