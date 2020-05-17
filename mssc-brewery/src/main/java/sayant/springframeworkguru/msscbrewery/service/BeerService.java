package sayant.springframeworkguru.msscbrewery.service;

import sayant.springframeworkguru.msscbrewery.model.BeerDto;

import java.util.UUID;

/**
 * Created by sayantjm on 16/5/20
 */
public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);

}
