package com.lucasgugliuzza.freetogameapi.domain.usecase


import com.lucasgugliuzza.freetogameapi.domain.modelo.GameItem
import com.lucasgugliuzza.freetogameapi.domain.repository.GameRepository
import javax.inject.Inject

class GetGamesUseCase @Inject constructor(private val gameRepository: GameRepository) {

    suspend operator fun invoke(): List<GameItem> {

        return gameRepository.getGames().shuffled()

    }

}