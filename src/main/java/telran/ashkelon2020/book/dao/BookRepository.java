package telran.ashkelon2020.book.dao;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import telran.ashkelon2020.book.model.Book;

public interface BookRepository extends JpaRepository<Book, String> {

	//@Query("select b from Book b where b.publisher.publisherName=?1")
	List<Book> findByPublisherPublisherName(String publisherName);
	
	//@Query("select b from Book b, IN (b.authors)authors where authors.name=?1")
	List<Book> findByAuthorsName(String authorName);
	
	@Query("select b.publisher.publisherName from Book b,"
			+ " IN (b.authors)authors where authors.name=?1")
	Set<String> findPublishersByAuthor(String authorName);

	void deleteByAuthorsName(String authorName);

}
