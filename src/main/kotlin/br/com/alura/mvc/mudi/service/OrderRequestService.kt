package br.com.alura.mvc.mudi.service

import br.com.alura.mvc.mudi.model.OrderRequest
import br.com.alura.mvc.mudi.repository.OrderRequestRepository
import org.springframework.stereotype.Service

@Service
class OrderRequestService(
        val orderRequestRepository: OrderRequestRepository
) {

    fun findAllOrderRequests(): List<OrderRequest> = orderRequestRepository.findAll()

    fun saveOrderRequest(orderRequest: OrderRequest) = orderRequestRepository.save(orderRequest)
}