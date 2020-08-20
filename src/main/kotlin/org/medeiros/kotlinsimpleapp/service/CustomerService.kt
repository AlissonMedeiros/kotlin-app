package org.medeiros.kotlinsimpleapp.service

import org.medeiros.kotlinsimpleapp.model.CustomerEntity
import org.medeiros.kotlinsimpleapp.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(private val repository: CustomerRepository) {

	fun save(entity: CustomerEntity): CustomerEntity =
		repository.save(entity)

	fun get(id: String): CustomerEntity =
		repository.getOne(id)

	fun getAll(): MutableIterable<CustomerEntity> =
		repository.findAll()

}
