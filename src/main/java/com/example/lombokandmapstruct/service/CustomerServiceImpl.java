package com.example.lombokandmapstruct.service;

import com.example.lombokandmapstruct.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomer(UUID customerId) {
        return CustomerDto.builder()
                .customerId(customerId)
                .customerName("Rahul")
                .build();
    }
}
