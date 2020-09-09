package telran.ashkelon2020.book.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"name"})
@Entity
public class Author implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	String name;
	LocalDate birthDate;	
	@ManyToMany(mappedBy = "authors")  //какое поле в классе Book отвечает за автора
										//mappedBy устанавливается на стороне родительской сущности	
	Set<Book> books;  //инициализировать не надо, т.к. по аннотации создается автоматически при save() в репозитории
	
	
	public Author(String name, LocalDate birthDate) {
		super();
		this.name = name;
		this.birthDate = birthDate;
	}
	
	

}
