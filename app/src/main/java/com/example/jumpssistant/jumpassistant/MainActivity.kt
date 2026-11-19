package com.example.jumpssistant.jumpassistant

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
            setBackgroundColor(0xFFF4F4F4.toInt())
        }

        val title = TextView(this).apply {
            text = "Jump Assistant"
            textSize = 28f
            setTextColor(0xFF222222.toInt())
        }

        val status = TextView(this).apply {
            text = "第一版项目已创建"
            textSize = 16f
            setTextColor(0xFF666666.toInt())
            setPadding(0, 20, 0, 0)
        }

        root.addView(title)
        root.addView(status)
        setContentView(root)
    }
}
