package telran.ashkelon2020.book.dto;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Singular;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BookDto {
	String isbn;
	String title;
	@Singular  // добавление по одному автору в Builder
	Set<AuthorDto> authors;
	String publisher;

}
