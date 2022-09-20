package com.batuhanberkertekin.artbook.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.batuhanberkertekin.artbook.DetailsActivity
import com.batuhanberkertekin.artbook.R
import com.batuhanberkertekin.artbook.data.ArtData
import com.batuhanberkertekin.artbook.databinding.RecylerViewBinding
import kotlinx.android.synthetic.main.activity_details.view.*
import kotlinx.android.synthetic.main.recyler_view.view.*

class ArtAdapter(private val context : Context , private val artList : List<ArtData>) : RecyclerView.Adapter<ArtAdapter.Arts>() {




   inner   class  Arts(view : View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Arts {
        val layout = LayoutInflater.from(context).inflate(R.layout.recyler_view,parent,false)

        return  Arts(layout)
    }


    override fun onBindViewHolder(holder: Arts, position: Int) {

        holder.itemView.artsText.text = artList.get(position).name




        holder.itemView.setOnClickListener{

            var  intent = Intent(context,DetailsActivity::class.java)

            intent.putExtra("key",artList.get(position))




            holder.itemView.context.startActivity(intent)

        }



    }

    override fun getItemCount(): Int {
        return  artList.size
    }
}