package com.lucasgugliuzza.freetogameapi.domain.repository

import com.lucasgugliuzza.freetogameapi.data.GameService
import com.lucasgugliuzza.freetogameapi.domain.modelo.GameItem
import com.lucasgugliuzza.freetogameapi.domain.modelo.SpecificGameItem
import com.lucasgugliuzza.freetogameapi.domain.modelo.toGameItem
import com.lucasgugliuzza.freetogameapi.domain.modelo.toSpecificGameItem
import javax.inject.Inject

class GameRepository @Inject constructor(private val gameService: GameService) {

    suspend fun getGames(): List<GameItem> {

        return gameService.getGames().map {
            it.toGameItem()
        }

    }

    suspend fun getGameById(id: Int): SpecificGameItem {

        return gameService.getGameById(id).toSpecificGameItem()

    }

}