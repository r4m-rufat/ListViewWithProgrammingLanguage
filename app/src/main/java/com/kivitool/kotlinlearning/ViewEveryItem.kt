package com.kivitool.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ViewEveryItem : AppCompatActivity() {

    lateinit var logo_image: ImageView
    lateinit var title: TextView
    lateinit var long_description: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_every_item)

        getWidgets()
        setValues()



    }

    fun getWidgets(){

        logo_image = findViewById(R.id.logoImage) as ImageView
        title = findViewById(R.id.txttitle) as TextView
        long_description = findViewById(R.id.txtlongdescription) as TextView

    }

    fun setValues(){

        val intent = intent
        logo_image.setImageResource(intent.getIntExtra("image", 0))
        title.setText(intent.getStringExtra("title"))
        long_description.setText(intent.getStringExtra("long_desc"))

    }
}