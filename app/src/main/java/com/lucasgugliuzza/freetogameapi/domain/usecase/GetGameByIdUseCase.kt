package com.lucasgugliuzza.freetogameapi.domain.usecase


import com.lucasgugliuzza.freetogameapi.domain.modelo.SpecificGameItem
import com.lucasgugliuzza.freetogameapi.domain.repository.GameRepository
import javax.inject.Inject

class GetGameByIdUseCase @Inject constructor(private val gameRepository: GameRepository) {

    suspend operator fun invoke(id: Int): SpecificGameItem {

        return gameRepository.getGameById(id)

    }

}