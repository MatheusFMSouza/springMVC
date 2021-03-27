package br.com.alura.mvc.mudi.controller

import br.com.alura.mvc.mudi.model.OrderRequest
import br.com.alura.mvc.mudi.service.OrderRequestService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import java.time.LocalDateTime

@Controller
class HomeController(
        val orderRequestService: OrderRequestService
) {


    @GetMapping("/home")
    fun home(model: Model): String {

        model.addAttribute("orderRequests", orderRequestService.findAllOrderRequests())

        return "home"
    }
}