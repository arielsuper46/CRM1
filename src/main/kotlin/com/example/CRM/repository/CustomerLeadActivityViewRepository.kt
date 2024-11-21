package com.example.CRM.repository

import com.example.CRM.entity.CustomerLeadActivityView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerLeadActivityViewRepository : JpaRepository<CustomerLeadActivityView, Long> {
    // Métodos personalizados si los necesitas
}
