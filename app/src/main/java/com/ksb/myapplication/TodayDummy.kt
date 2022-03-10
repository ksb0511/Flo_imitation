package com.ksb.myapplication

class TodayDummy {
    fun getRepoList(): List<TodayData> {
        return listOf(
            TodayData(
                name = "홍길동",
                age = "33",
                img = R.drawable.album1
            ),
            TodayData(
                name = "홍길동",
                age = "22" ,
                img = R.drawable.album2
            ),
            TodayData(
                name = "홍길동",
                age = "11",
                img = R.drawable.album3
            )
        )
    }
}
