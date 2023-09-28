package com.lucasgugliuzza.freetogameapi.domain.modelo

import com.lucasgugliuzza.freetogameapi.data.dto.SpecificGameDto

data class SpecificGameItem(

    val id: Int,
    val title: String,
    val thumbnail: String,
    val description: String

)

fun SpecificGameDto.toSpecificGameItem() = SpecificGameItem(id, title, thumbnail, description)
