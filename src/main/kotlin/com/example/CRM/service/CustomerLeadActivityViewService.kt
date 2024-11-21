package com.example.CRM.service

import com.example.CRM.dto.CustomerLeadActivityViewDto
import com.example.CRM.entity.CustomerLeadActivityView
import com.example.CRM.repository.CustomerLeadActivityViewRepository
import org.springframework.stereotype.Service

@Service
class CustomerLeadActivityViewService(
    private val repository: CustomerLeadActivityViewRepository
) {
    fun getAll(): List<CustomerLeadActivityViewDto> {
        return repository.findAll().map { entity ->
            CustomerLeadActivityViewDto(
                activityId = entity.activityId,
                customerId = entity.customerId,
                customerName = entity.customerName,
                customerEmail = entity.customerEmail,
                customerCreatedAt = entity.customerCreatedAt,
                leadId = entity.leadId,
                leadName = entity.leadName,
                leadStatus = entity.leadStatus,
                leadSource = entity.leadSource,
                leadCreatedAt = entity.leadCreatedAt,
                activityDescription = entity.activityDescription,
                activityDate = entity.activityDate
            )
        }
    }
}
