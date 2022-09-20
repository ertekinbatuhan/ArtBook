package com.batuhanberkertekin.artbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.batuhanberkertekin.artbook.data.ArtData
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)






      val gelenData =  intent.getSerializableExtra("key") as ArtData

        imageView.setImageResource(gelenData.image)
        nameView.text = gelenData.name



    }
}