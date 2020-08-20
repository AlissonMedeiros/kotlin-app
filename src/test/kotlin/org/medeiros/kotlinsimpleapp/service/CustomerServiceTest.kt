package org.medeiros.kotlinsimpleapp.service

import org.junit.jupiter.api.Test
import org.medeiros.kotlinsimpleapp.repository.CustomerRepository
import org.mockito.InjectMocks
import org.mockito.Mock

internal class CustomerServiceTest(
	@InjectMocks
	val service: CustomerService,
	@Mock
	val repository: CustomerRepository
) {


	@Test
	fun test1() {
		println("oi")
	}

}
