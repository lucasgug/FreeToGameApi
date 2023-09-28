package com.lucasgugliuzza.freetogameapi.data


import com.lucasgugliuzza.freetogameapi.data.dto.GameDto
import com.lucasgugliuzza.freetogameapi.data.dto.SpecificGameDto
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GameService @Inject constructor(private val gameApi: GameApi) {

    suspend fun getGames(): List<GameDto> {

        return withContext(Dispatchers.IO) {
            val games = gameApi.getGames()
            games.body() ?: emptyList()
        }

    }

    suspend fun getGameById(id: Int): SpecificGameDto {

        return withContext(Dispatchers.IO) {
            val game = gameApi.getGameById(id)
            game.body()!!
        }

    }

}