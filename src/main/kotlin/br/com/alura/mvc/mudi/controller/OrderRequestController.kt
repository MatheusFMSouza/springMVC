package br.com.alura.mvc.mudi.controller

import br.com.alura.mvc.mudi.dto.OrderRequestDTO
import br.com.alura.mvc.mudi.service.OrderRequestService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/pedido")
class OrderRequestController(
        val orderRequestService: OrderRequestService
) {


    @GetMapping("/formulario")
    fun formOrderRequest(): String{
        return "orderRequest/formOrderRequest"
    }

    @PostMapping("/novo")
    fun saveOrderRequest(orderRequestDTO: OrderRequestDTO): String{
        orderRequestService.saveOrderRequest(orderRequestDTO.fromDomain())

        return "orderRequest/formOrderRequest"
    }


}