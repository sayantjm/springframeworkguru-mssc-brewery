package sayant.springframeworkguru.msscbrewery.service;

import sayant.springframeworkguru.msscbrewery.model.CustomerDto;

import java.util.UUID;

/**
 * Created by sayantjm on 17/5/20
 */
public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);
}
