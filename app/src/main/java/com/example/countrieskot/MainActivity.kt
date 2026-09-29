package com.example.countrieskot

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

private lateinit var btns: Array<Button>
private lateinit var ivEmbl: ImageView
private lateinit var ivFlag: ImageView
private lateinit var tvName: TextView

private val embl = intArrayOf(
    R.drawable.russia_embl,
    R.drawable.gerbchina,
    R.drawable.gerbiran
)

private val flag = intArrayOf(
    R.drawable.russia_l,
    R.drawable.flagchina,
    R.drawable.flagiran
)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        btns = arrayOf(
            findViewById(R.id.btn1),
            findViewById(R.id.btn2),
            findViewById(R.id.btn3)
        )

        ivEmbl = findViewById(R.id.ivEmbl)
        ivFlag = findViewById(R.id.ivFlag)
        tvName = findViewById(R.id.tvName)
    }

    fun goPict(view: View) {
        for (i in flag.indices) {
            if (view === btns[i]) {
                ivEmbl.setImageResource(embl[i])
                ivFlag.setImageResource(flag[i])
                tvName.text = btns[i].text
            }
        }
    }
}