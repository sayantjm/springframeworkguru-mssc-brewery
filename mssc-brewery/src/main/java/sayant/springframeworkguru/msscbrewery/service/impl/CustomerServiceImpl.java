package sayant.springframeworkguru.msscbrewery.service.impl;

import org.springframework.stereotype.Service;
import sayant.springframeworkguru.msscbrewery.model.CustomerDto;
import sayant.springframeworkguru.msscbrewery.service.CustomerService;

import java.util.UUID;

/**
 * Created by sayantjm on 17/5/20
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(customerId)
                .name("Customer One")
                .build();
    }
}
