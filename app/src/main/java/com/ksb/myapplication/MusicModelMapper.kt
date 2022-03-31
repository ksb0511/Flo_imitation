package com.ksb.myapplication

import com.ksb.myapplication.Model.MusicModel
import com.ksb.myapplication.Model.PlayerModel


fun MusicEntity.mapper(id: Long): MusicModel =
    MusicModel(
        id = id,
        streamUrl = streamUrl,
        coverUrl = coverUrl,
        track = track,
        artist = artist
    )


fun MusicDto.mapper(): PlayerModel =
    PlayerModel(
        playMusicList = musics.mapIndexed { index, musicEntity ->
                musicEntity.mapper(index.toLong()) }
    )