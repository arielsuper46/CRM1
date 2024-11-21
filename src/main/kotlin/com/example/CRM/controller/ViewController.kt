package com.example.CRM.controller

import com.example.CRM.dto.CustomerLeadActivityViewDto
import com.example.CRM.service.CustomerLeadActivityViewService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/views")
class ViewController(
    private val service: CustomerLeadActivityViewService
) {
    @GetMapping("/customer-lead-activity")
    fun getAll(): List<CustomerLeadActivityViewDto> {
        return service.getAll()
    }
}
