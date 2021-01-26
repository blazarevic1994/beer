package com.example.beer;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BeerApplication.class)
@AutoConfigureMockMvc
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JunitTestPlan {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void a1_postBeer() throws Exception {


        String beer = "{\"id\":1,\"name\":\"Netar\",\"tagline\":\"Japanese Citrus Berliner Weisse.\",\"first_brewed\":\"11/2015\",\"description\":\"Japanese citrus fruit intensifies the sour nature of this German classic.\",\"image_url\":\"https://images.punkapi.com/v2/keg.png\",\"abv\":4.2,\"ibu\":8,\"target_fg\":1007,\"target_og\":1040,\"ebc\":8,\"srm\":4,\"ph\":3.2,\"attenuation_level\":83,\"volume\":{\"value\":20,\"unit\":\"litres\"},\"boil_volume\":{\"value\":25,\"unit\":\"litres\"},\"method\":{\"mash_temp\":[{\"temp\":{\"value\":60,\"unit\":\"celsius\"},\"duration\":10},{\"temp\":{\"value\":65,\"unit\":\"celsius\"},\"duration\":30},{\"temp\":{\"value\":72,\"unit\":\"celsius\"},\"duration\":10},{\"temp\":{\"value\":78,\"unit\":\"celsius\"},\"duration\":5}],\"fermentation\":{\"temp\":{\"value\":21,\"unit\":\"celsius\"}},\"twist\":\"Soured naturally using the kettle souring technique, Yuzu fruit: 50g at middle, Yuzu juice: 200ml at FV\"},\"ingredients\":{\"malt\":[{\"name\":\"Propino Pale Malt\",\"amount\":{\"value\":1.63,\"unit\":\"kilograms\"}},{\"name\":\"Wheat Malt\",\"amount\":{\"value\":1.63,\"unit\":\"kilograms\"}},{\"name\":\"Propino Pale Malt for kettle souring\",\"amount\":{\"value\":0.03,\"unit\":\"kilograms\"}},{\"name\":\"Acidulated Malt for kettle souring\",\"amount\":{\"value\":0.03,\"unit\":\"kilograms\"}}],\"hops\":[{\"name\":\"Bramling Cross\",\"amount\":{\"value\":10,\"unit\":\"grams\"},\"add\":\"middle\",\"attribute\":\"bitter\"}],\"yeast\":\"Wyeast 1056 - American Ale™\"},\"food_pairing\":[\"Smoked chicken wings\",\"Miso ramen\",\"Yuzu cheesecake\"],\"brewers_tips\":\"Clean everything twice. All you want is the clean sourness of lactobacillus.\",\"contributed_by\":\"Sam Mason <samjbmason>\"}";

        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/fillUpBeer")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(beer))
                .andDo(print())
                .andExpect(status().isCreated()).andReturn();
    }
    @Test
    public void a2_postBeerAgain() throws Exception {


        String beer = "{\"id\":1,\"name\":\"Netar\",\"tagline\":\"Japanese Citrus Berliner Weisse.\",\"first_brewed\":\"11/2015\",\"description\":\"Japanese citrus fruit intensifies the sour nature of this German classic.\",\"image_url\":\"https://images.punkapi.com/v2/keg.png\",\"abv\":4.2,\"ibu\":8,\"target_fg\":1007,\"target_og\":1040,\"ebc\":8,\"srm\":4,\"ph\":3.2,\"attenuation_level\":83,\"volume\":{\"value\":20,\"unit\":\"litres\"},\"boil_volume\":{\"value\":25,\"unit\":\"litres\"},\"method\":{\"mash_temp\":[{\"temp\":{\"value\":60,\"unit\":\"celsius\"},\"duration\":10},{\"temp\":{\"value\":65,\"unit\":\"celsius\"},\"duration\":30},{\"temp\":{\"value\":72,\"unit\":\"celsius\"},\"duration\":10},{\"temp\":{\"value\":78,\"unit\":\"celsius\"},\"duration\":5}],\"fermentation\":{\"temp\":{\"value\":21,\"unit\":\"celsius\"}},\"twist\":\"Soured naturally using the kettle souring technique, Yuzu fruit: 50g at middle, Yuzu juice: 200ml at FV\"},\"ingredients\":{\"malt\":[{\"name\":\"Propino Pale Malt\",\"amount\":{\"value\":1.63,\"unit\":\"kilograms\"}},{\"name\":\"Wheat Malt\",\"amount\":{\"value\":1.63,\"unit\":\"kilograms\"}},{\"name\":\"Propino Pale Malt for kettle souring\",\"amount\":{\"value\":0.03,\"unit\":\"kilograms\"}},{\"name\":\"Acidulated Malt for kettle souring\",\"amount\":{\"value\":0.03,\"unit\":\"kilograms\"}}],\"hops\":[{\"name\":\"Bramling Cross\",\"amount\":{\"value\":10,\"unit\":\"grams\"},\"add\":\"middle\",\"attribute\":\"bitter\"}],\"yeast\":\"Wyeast 1056 - American Ale™\"},\"food_pairing\":[\"Smoked chicken wings\",\"Miso ramen\",\"Yuzu cheesecake\"],\"brewers_tips\":\"Clean everything twice. All you want is the clean sourness of lactobacillus.\",\"contributed_by\":\"Sam Mason <samjbmason>\"}";

        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/fillUpBeer")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(beer))
                .andDo(print())
                .andExpect(status().isConflict()).andReturn();
    }
    @Test
    public void a3_getBeers() throws Exception {

        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders
                        .get("/beers/1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk()).andReturn();

    }
    @Test
    public void a4_getBeersNotExist() throws Exception {

        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders
                        .get("/beers/200")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isNotFound()).andReturn();

    }
    @Test
    public void a5_delete() throws Exception {

        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders
                        .delete("/beers/1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk()).andReturn();

    }
    @Test
    public void a6_getBeersNotExist() throws Exception {

        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders
                        .get("/beers/1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isNotFound()).andReturn();

    }


}
