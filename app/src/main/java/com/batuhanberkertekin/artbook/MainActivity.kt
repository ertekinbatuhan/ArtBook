package com.batuhanberkertekin.artbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.batuhanberkertekin.artbook.adapter.ArtAdapter
import com.batuhanberkertekin.artbook.data.ArtData
import com.batuhanberkertekin.artbook.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
       private lateinit var binding : ActivityMainBinding
       private lateinit var  artAdapter : ArtAdapter
       private  lateinit var  artList : ArrayList<ArtData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
         artList = ArrayList<ArtData>()

        val eyfel_kulesi = ArtData("Eyfel Kulesi",R.drawable.eyfel)
        val kız_kulesi = ArtData("Kız Kulesi", R.drawable.kiz_kulesi)
        val pisa_kulesi = ArtData("Pisa Kulesi",R.drawable.pisa)


         artList.add(eyfel_kulesi)
        artList.add(kız_kulesi)
        artList.add(pisa_kulesi)


        artAdapter = ArtAdapter(this,artList)
       binding.recylerView.layoutManager = LinearLayoutManager(this)

       binding.recylerView.adapter = artAdapter












    }


}