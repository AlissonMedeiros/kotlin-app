package org.medeiros.kotlinsimpleapp.repository

import org.medeiros.kotlinsimpleapp.model.CustomerEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import javax.transaction.Transactional

@Repository
@Transactional(Transactional.TxType.MANDATORY)
interface CustomerRepository : JpaRepository<CustomerEntity, String>
