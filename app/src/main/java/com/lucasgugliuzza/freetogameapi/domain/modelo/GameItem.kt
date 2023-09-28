package com.lucasgugliuzza.freetogameapi.domain.modelo

import com.lucasgugliuzza.freetogameapi.data.dto.GameDto

data class GameItem(

    val id: Int,
    val title: String,
    val thumbnail: String,
    val short_description: String

)

//Mappeo de GameDto a GameItem
fun GameDto.toGameItem() = GameItem(id, title, thumbnail, short_description)
