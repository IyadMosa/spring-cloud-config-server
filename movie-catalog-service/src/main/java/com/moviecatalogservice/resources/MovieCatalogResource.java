package com.moviecatalogservice.resources;

import com.moviecatalogservice.models.UserCatalogItem;
import com.moviecatalogservice.models.UserCatalogItems;
import com.moviecatalogservice.services.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

//    @Autowired
//    private WebClient.Builder webClientBuilder;

    @Autowired
    CatalogService catalogService;


    @GetMapping("/{userId}")
    public UserCatalogItem getCatalogByUserId(@PathVariable("userId") String userId) {
        return catalogService.getCatalogByUserId(userId);
    }


    @GetMapping("/all")
    public UserCatalogItems getAllCatalogs() {
        return new UserCatalogItems(catalogService.getAllCatalogs());
    }






     /* Movie movie = webClientBuilder.build()
                    .get()
                    .uri("http://localhost:8082/movies/" + rating.getMoveId())
                    .retrieve()
                    .bodyToMono(Movie.class)
                    .block();*/
}
