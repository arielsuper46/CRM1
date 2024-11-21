package com.example.CRM.entity

import jakarta.persistence.*

@Entity
@Table(name = "customer_lead_activity_view")
data class CustomerLeadActivityView(
    @Id
    @Column(name = "activity_id")
    val activityId: Long? = null,

    @Column(name = "customer_id")
    val customerId: Long? = null,

    @Column(name = "customer_name")
    val customerName: String? = null,

    @Column(name = "customer_email")
    val customerEmail: String? = null,

    @Column(name = "customer_created_at")
    val customerCreatedAt: java.time.LocalDateTime? = null,

    @Column(name = "lead_id")
    val leadId: Long? = null,

    @Column(name = "lead_name")
    val leadName: String? = null,

    @Column(name = "lead_status")
    val leadStatus: String? = null,

    @Column(name = "lead_source")
    val leadSource: String? = null,

    @Column(name = "lead_created_at")
    val leadCreatedAt: java.time.LocalDateTime? = null,

    @Column(name = "activity_description")
    val activityDescription: String? = null,

    @Column(name = "activity_date")
    val activityDate: java.time.LocalDateTime? = null
)
