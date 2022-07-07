package daniel.salas.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCLickMe = findViewById<Button>(R.id.myButton)
        val tvCounter = findViewById<TextView>(R.id.textView)
        var num = 0

        btnCLickMe.text = "Count People!"
        btnCLickMe.setOnClickListener {
            num += 1
            tvCounter.text = num.toString()
            Toast.makeText(this,"And another one", Toast.LENGTH_SHORT).show()
        }

    }
}