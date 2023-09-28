package com.lucasgugliuzza.freetogameapi.data

import com.lucasgugliuzza.freetogameapi.data.dto.GameDto
import com.lucasgugliuzza.freetogameapi.data.dto.SpecificGameDto
import com.lucasgugliuzza.freetogameapi.util.Constants.Companion.GAMES_ENDPOINT
import com.lucasgugliuzza.freetogameapi.util.Constants.Companion.GAME_ID_ENDPOINT
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GameApi {



        @GET(GAMES_ENDPOINT)
        suspend fun getGames() :Response<List<GameDto>>

        @GET(GAME_ID_ENDPOINT)
        suspend fun getGameById(@Query("id") id:Int) : Response<SpecificGameDto>



}