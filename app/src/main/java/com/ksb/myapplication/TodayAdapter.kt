package com.ksb.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class TodayAdapter(private val context: View, private val real_con: Context?) : RecyclerView.Adapter<ViewHolder>(){

    //데이터 저장할 아이템리스트
    var data= listOf<TodayData>()

    //해당 아이템을 뷰홀더로 만드는 법
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //리스트 아이템 인플레이터
//        var view = inflater.inflate(R.layout.fragment_first, container, false)

        val view = LayoutInflater.from(real_con).inflate(R.layout.today_item,parent,false)
        return ViewHolder(view)
    }

    //아이템 전체 갯수 파악
    override fun getItemCount(): Int {
        return data.size
    }

    //바인드뷰홀더 생성
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }
}