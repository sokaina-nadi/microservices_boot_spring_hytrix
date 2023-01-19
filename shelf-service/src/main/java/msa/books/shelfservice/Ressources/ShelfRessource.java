package msa.books.shelfservice.Ressources;

import msa.books.shelfservice.Models.Shelf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class ShelfRessource {
    //External API
    @Value("${api-key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/{shelfid}")
    public Shelf getShelfinfo(@PathVariable("shelfid") String shelfId){

        Shelf shelf = restTemplate.getForObject("https://www.googleapis.com/books/v1/users/101041981839367168130/bookshelves/"+shelfId+"?key="+apiKey, Shelf.class);

        return new Shelf(shelfId, shelf.getTitle(), shelf.getAccess(), shelf.getVolumeCount());

    }
}
