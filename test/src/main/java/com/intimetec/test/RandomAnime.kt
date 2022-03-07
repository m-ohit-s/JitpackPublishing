package com.intimetec.test

class RandomAnime {
    private val anime = arrayListOf<String>("One Piece", "Naruto", "Dragon Ball Z", "Hunter X Hunter", "Gintama")

    public fun getanime(): String = anime.random()
}