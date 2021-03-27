package br.com.alura.mvc.mudi.dto

import br.com.alura.mvc.mudi.model.OrderRequest

data class OrderRequestDTO(
        val nameProduct: String,
        val urlProduct: String,
        val urlImage: String,
        val description: String,
) {

    fun fromDomain(): OrderRequest {
        return OrderRequest(
                nameProduct = nameProduct,
                urlProduct = urlProduct,
                urlImage = urlImage,
                description = description,
        )

    }
}