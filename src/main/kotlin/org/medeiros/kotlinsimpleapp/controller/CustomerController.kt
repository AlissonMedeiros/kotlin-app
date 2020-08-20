package org.medeiros.kotlinsimpleapp.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.ArraySchema
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.medeiros.kotlinsimpleapp.service.CustomerService
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customers")
class CustomerController(private val service: CustomerService) {

	@Operation(summary = "Get all customers")
	@ApiResponses(value = [
		ApiResponse(responseCode = "200", description = "Found Customers", content = [
			(Content(mediaType = "application/json", array = (
				ArraySchema(schema = Schema(implementation = CustomerDto::class)))))]),
		ApiResponse(responseCode = "400", description = "Bad request", content = [Content()]),
		ApiResponse(responseCode = "404", description = "Did not find any Customers", content = [Content()])]
	)
	@GetMapping
	fun get(): List<CustomerDto> = service.getAll().map { c ->
		CustomerDto(id = c.id, alias = c.alias, name = c.name)
	}

	@GetMapping("/{id}")
	fun getById(@PathVariable("id" )id :String): CustomerDto = CustomerDto.toDto(service.get(id));


	@PostMapping
	fun create(@Validated @RequestBody customer: CustomerDto) =
		service.save(customer.toEntity())

}
