package com.ksb.myapplication.FragmentPage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ksb.myapplication.R
import com.ksb.myapplication.Adapter.TodayAdapter
import com.ksb.myapplication.TodayDummy

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment() {

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var rv: RecyclerView
    private lateinit var rv1: RecyclerView
    private lateinit var my_adapter: TodayAdapter // 본인이 만든 어댑터
    private val repository= TodayDummy() // 아이템 데이터를 생성한 파일

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }




    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_first, container, false)

        rv = view.findViewById(R.id.view1)
        rv1 = view.findViewById(R.id.view2)

        my_adapter = TodayAdapter(view, this.context)
        rv.adapter = my_adapter // 리사이클러뷰 어댑터를 본인이 만든 어댑터로 설정
        rv1.adapter = my_adapter

//        rv.layoutManager = LinearLayoutManager(activity)
        my_adapter.data=repository.getRepoList() // 데이터 받아오기

        my_adapter.notifyDataSetChanged()




        return view // inflater.inflate(R.layout.fragment_first, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FirstFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic fun newInstance(param1: String, param2: String) =
                FirstFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}