package se.magictechnology.pia9viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var viewModel : MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        var countingtv = findViewById<TextView>(R.id.countingTextview)

        countingtv.setOnClickListener {
            viewModel.addToNumber()
        }

        viewModel.getCountingText().observe(this, Observer {
            countingtv.text = it
        })


    }
}

