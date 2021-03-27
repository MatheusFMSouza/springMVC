package br.com.alura.mvc.mudi.repository

import br.com.alura.mvc.mudi.model.OrderRequest
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderRequestRepository: JpaRepository<OrderRequest, Int> {

}