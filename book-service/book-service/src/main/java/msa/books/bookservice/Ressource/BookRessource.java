package msa.books.bookservice.Ressource;

import msa.books.bookservice.Models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/book")
public class BookRessource {

    //External API
    @Value("${api-key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{id}")
    public Book getBookninfo(@PathVariable("id") String bookId){

        Book book = restTemplate.getForObject("https://www.googleapis.com/books/v1/volumes/"+bookId+"?key="+apiKey, Book.class);
        //return new Book(bookId,book.getEtag(),book.getSelfLink());
        return new Book(bookId, book.getEtag(), book.getSelfLink(), book.getVolumeInfo());
    }
}
