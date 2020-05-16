package sayant.springframeworkguru.msscbrewery.service.impl;

import org.springframework.stereotype.Service;
import sayant.springframeworkguru.msscbrewery.model.BeerDto;
import sayant.springframeworkguru.msscbrewery.service.BeerService;

import java.util.UUID;

/**
 * Created by sayantjm on 16/5/20
 */

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Estrella Galicia")
                .beerStyle("Pale Ale")
                .build();
    }
}
