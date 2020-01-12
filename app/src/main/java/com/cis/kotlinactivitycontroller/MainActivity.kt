package com.cis.kotlinactivitycontroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var inputFragment = InputFragment()
    var resultFragment = ResultFragment()

    var value1: String? = null
    var value2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setFragment("input")
    }

    fun setFragment(name: String) {
        val tran = supportFragmentManager.beginTransaction()
        when(name) {
            "input" -> {
                tran.replace(R.id.container, inputFragment)
            }
            "result" -> {
                tran.replace(R.id.container, resultFragment)
                tran.addToBackStack(null)
            }
        }
        tran.commit()
    }
}
