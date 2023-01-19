package msa.books.browze_book_service.models;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BookProxy {
    @Autowired
    private RestTemplate restTemplate;



    @HystrixCommand(fallbackMethod ="getFallBackBookBrowser")
    public BookBrowzer getBookBrwoser(Rating rating){
        Book book = (Book)this.restTemplate.getForObject("http://localhost:8000/book/" + rating.getBookID(), Book.class, new Object[0]);
        return new BookBrowzer(book.getBookID(), book.getEtag(), book.getSelfLink(), rating.getVolumeInfo().getAverageRating(), book.getVolumeInfo().getTitle(), book.getVolumeInfo().getSubtitle(), book.getVolumeInfo().getPublisher());
    }
    public BookBrowzer getFallBackBookBrowser(Rating rating){
        return new BookBrowzer(rating.getBookID(), "no etag", "no SelfLink", rating.getVolumeInfo().getAverageRating(), "no title", "no subtitle", "no publisher");

    }

}
