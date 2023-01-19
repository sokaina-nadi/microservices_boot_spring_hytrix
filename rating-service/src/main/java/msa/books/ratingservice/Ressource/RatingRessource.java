package msa.books.ratingservice.Ressource;

import msa.books.ratingservice.Models.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/book")
public class RatingRessource {
    @Value("${api-key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{id}")
    public Rating getRatingninfo(@PathVariable("id") String bookId){

        Rating rating = restTemplate.getForObject("https://www.googleapis.com/books/v1/volumes/"+bookId+"?key="+apiKey, Rating.class);
        //return new Book(bookId,book.getEtag(),book.getSelfLink());
        return new Rating(bookId,rating.getVolumeInfo());
    }
}
