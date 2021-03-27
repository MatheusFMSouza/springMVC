package br.com.alura.mvc.mudi.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "pedido")
data class OrderRequest(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int? = null,
        val nameProduct: String? = null,
        val valueNegotiated: Double? = null,
        val dateDelivery: LocalDateTime? = null,
        val urlProduct: String? = null,
        val urlImage: String? = null,
        val description: String? = null
)

