package org.medeiros.kotlinsimpleapp.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "Customer")
class CustomerEntity(
	@Id
	val id: String,
	val name: String,
	val alias: String
)
