package sayant.springframeworkguru.msscbrewery.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sayant.springframeworkguru.msscbrewery.model.BeerDto;
import sayant.springframeworkguru.msscbrewery.service.BeerService;

import java.util.UUID;

/**
 * Created by sayantjm on 16/5/20
 */

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Estrella Galicia 2")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName(beerDto.getBeerName())
                .beerStyle(beerDto.getBeerStyle())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //TODO impl - add real implementation to update beer
    }

    @Override
    public void deleteById(UUID beerId) {
        log.info("Deleted beer {}", beerId.toString());
    }
}
