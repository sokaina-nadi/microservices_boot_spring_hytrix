package msa.books.browze_book_service.models;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;
@Service
public class RatingProxy {
    @Autowired
    private RestTemplate restTemplate;



    @HystrixCommand(fallbackMethod ="getFallBackRating")
    public Rating getRating(@PathVariable("bookId") String bookId){
        Rating rating = (Rating) this.restTemplate.getForObject("http://localhost:8022/book/" + bookId, Rating.class, new Object[0]);

        return rating;
    }
    public Rating getFallBackRating(String bookID){
        return new Rating(bookID,new VolumeInfo("0"));

    }
}
