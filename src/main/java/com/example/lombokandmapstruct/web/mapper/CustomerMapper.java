package com.example.lombokandmapstruct.web.mapper;

import com.example.lombokandmapstruct.domain.Customer;
import com.example.lombokandmapstruct.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto customerDto);

    CustomerDto customerToCustomerDto(Customer customer);
}
