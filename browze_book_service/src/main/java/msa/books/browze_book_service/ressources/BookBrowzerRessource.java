//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package msa.books.browze_book_service.ressources;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import msa.books.browze_book_service.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping({"/browzer"})

public class BookBrowzerRessource {
        @Autowired
        private RestTemplate restTemplate;
        @Autowired
        public BookProxy bookProxy;
        @Autowired
        public RatingProxy ratingProxy;

        public BookBrowzerRessource() {
        }

        @RequestMapping({"/{bookId}"})
        public BookBrowzer getCatalog(@PathVariable("bookId") String bookId) {
                Rating rating = ratingProxy.getRating(bookId);
                //Book book = (Book)this.restTemplate.getForObject("http://localhost:8000/book/" + bookId, Book.class, new Object[0]);
                return bookProxy.getBookBrwoser(rating);
        }
        /*@HystrixCommand
        public BookBrowzer getFallBackBooks(@PathVariable("bookId") String bookId) {
                return new BookBrowzer("no books", "no books", "no books", "no books", "no books", "no books", "no books");
        }*/

        /* public BookBrowzer getCatalog(@PathVariable("bookId") String bookId) {
                 Rating rating = (Rating)this.restTemplate.getForObject("http://localhost:8022/book/" + bookId, Rating.class, new Object[0]);
                 System.out.println(rating.getBookID());
                 System.out.println(rating.getVolumeInfo().getAverageRating());
                 Book book = (Book)this.restTemplate.getForObject("http://localhost:8000/book/" + bookId, Book.class, new Object[0]);
                 return new BookBrowzer(book.getBookID(), book.getEtag(), book.getSelfLink(), rating.getVolumeInfo().getAverageRating(), book.getVolumeInfo().getTitle(), book.getVolumeInfo().getSubtitle(), book.getVolumeInfo().getPublisher());
         }*/
        /*
        public BookBrowzer getCatalog(@PathVariable("bookId") String bookId) {
                Rating rating = (Rating) this.restTemplate.getForObject("http://localhost:8022/book/" + bookId, Rating.class, new Object[0]);
                //Book book = (Book)this.restTemplate.getForObject("http://localhost:8000/book/" + bookId, Book.class, new Object[0]);
                return getBookBrwoser(rating);
        }*/
       /* @HystrixCommand(fallbackMethod ="getFallBackBookBrowser")
        public BookBrowzer getBookBrwoser(Rating rating){
                Book book = (Book)this.restTemplate.getForObject("http://localhost:8000/book/" + rating.getBookID(), Book.class, new Object[0]);
                return new BookBrowzer(book.getBookID(), book.getEtag(), book.getSelfLink(), rating.getVolumeInfo().getAverageRating(), book.getVolumeInfo().getTitle(), book.getVolumeInfo().getSubtitle(), book.getVolumeInfo().getPublisher());
        }
        public BookBrowzer getFallBackBookBrowser(Rating rating){
                return new BookBrowzer("no books", "no books", "no books", "no books", "no books", "no books", "no books");

        }*/

      /*  public BookBrowzer getCatalog(@PathVariable("bookId") String bookId) {
                Rating rating = (Rating) this.restTemplate.getForObject("http://localhost:8022/book/" + bookId, Rating.class, new Object[0]);
                //Book book = (Book)this.restTemplate.getForObject("http://localhost:8000/book/" + bookId, Book.class, new Object[0]);
                return bookProxy.getBookBrwoser(rating);
        }

       */




}