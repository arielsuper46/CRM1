package com.example.CRM.dto

import java.time.LocalDateTime

data class CustomerLeadActivityViewDto(
    val activityId: Long?,
    val customerId: Long?,
    val customerName: String?,
    val customerEmail: String?,
    val customerCreatedAt: LocalDateTime?,
    val leadId: Long?,
    val leadName: String?,
    val leadStatus: String?,
    val leadSource: String?,
    val leadCreatedAt: LocalDateTime?,
    val activityDescription: String?,
    val activityDate: LocalDateTime?
)
