package guru.springframework.msscbeerservice.service.inventory;

import guru.springframework.msscbeerservice.bootstrap.BeerLoader;
import guru.springframework.msscbeerservice.services.inventory.BeerInventoryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Disabled
@SpringBootTest
public class BeerInventoryServiceRestTemplateImplTest {

    BeerInventoryService beerInventoryService;

    @BeforeEach
    void setUp() {

    }

    @Test
    void getOnHandInventory() {
//        Integer qoh = beerInventoryService.getOnHandInventory(BeerLoader.BEER_1_UPC);
//        System.out.println(qoh);
    }

}
