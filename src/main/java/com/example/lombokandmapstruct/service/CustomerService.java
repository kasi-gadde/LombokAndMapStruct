package com.example.lombokandmapstruct.service;

import com.example.lombokandmapstruct.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;


public interface CustomerService {
    CustomerDto getCustomer(UUID customerId);
}
