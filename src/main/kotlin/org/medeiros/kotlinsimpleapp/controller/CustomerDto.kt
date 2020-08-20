package org.medeiros.kotlinsimpleapp.controller

import org.medeiros.kotlinsimpleapp.model.CustomerEntity
import javax.validation.constraints.NotBlank

class CustomerDto(
	@NotBlank
	val id: String,
	@NotBlank
	val name: String,
	@NotBlank
	val alias: String
) {
	fun toEntity(): CustomerEntity {
		return CustomerEntity(
			id = id,
			name = name,
			alias = alias
		)
	}

	companion object {
		fun toDto(entity: CustomerEntity): CustomerDto =
			CustomerDto(id = entity.id, name = entity.name, alias = entity.alias)
	}

}
