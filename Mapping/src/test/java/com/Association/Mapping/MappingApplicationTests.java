package com.Association.Mapping;

import com.Association.Mapping.ManyToMany.AuthorMany;
import com.Association.Mapping.ManyToMany.AuthorManyRepo;
import com.Association.Mapping.ManyToMany.BookMany;
import com.Association.Mapping.ManyToMany.BookManyRepo;
import com.Association.Mapping.OneToMany.Author;
import com.Association.Mapping.OneToMany.AuthorRepo;
import com.Association.Mapping.OneToMany.Book;
import com.Association.Mapping.OneToMany.BookRepo;
import com.Association.Mapping.OneToOne.AuthorOne;
import com.Association.Mapping.OneToOne.AuthorOneRepo;
import com.Association.Mapping.OneToOne.BookOne;
import com.Association.Mapping.OneToOne.BookOneRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.Authenticator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootTest
class MappingApplicationTests {
	@Autowired
	AuthorRepositoryy authorRepositoryy;
@Autowired
	AuthorRepo authorRepo;
@Autowired
	BookRepo bookRepo;
@Autowired
	BookOneRepo bookOneRepo;
@Autowired
	BookManyRepo bookManyRepo;
@Autowired
	AuthorManyRepo authorManyRepo;
@Autowired
	AuthorOneRepo authorOneRepo;
	@Test
	void contextLoads() {
	}

		@Test
	public void testCreateAuthor(){
		List<Subject> subject=new ArrayList<>();
		Subject sub1=new Subject();
		sub1.setName("Economic");
		sub1.setAid(1);
		Subject sub2=new Subject();
		sub2.setName("Mathematics");
		sub2.setAid(2);
		AuthorQ1 author1=new AuthorQ1();
		author1.setId(1);
		author1.setName("Ramakrina");
		Address add=new Address();
		add.setLocation("India");
		add.setState("Delhi");
		add.setStreetNumber(21);
		author1.setAdd(add);
		subject.add(sub1);
		sub1.setAuthor(author1);
		subject.add(sub2);
		sub2.setAuthor(author1);
		author1.setSubjects(subject);
		authorRepositoryy.save(author1);
	}
	@Test
	public void createOneToMany(){
		HashSet<Book> books=new HashSet<>();
		Author author=new Author();
		Book book1=new Book();
		author.setId(101);
		author.setName("Surya");
		book1.setId(001);
		book1.setName("English");
		book1.setAuthor(author);
		books.add(book1);
		author.setBook(books);
		authorRepo.save(author);
	}
	@Test
	public void createOneToOne(){
		AuthorOne authorOne= new AuthorOne();
		BookOne bookOne= new BookOne();
		authorOne.setName("Surya");
		bookOne.setName("English");
		bookOne.setAuthor(authorOne);
		authorOne.setBook(bookOne);
		authorOneRepo.save(authorOne);
	}

	@Test
	public void testCreateAuthorManyBookMany(){
		AuthorMany authorMany = new AuthorMany();
		authorMany.setName("Pranshu");

		HashSet<BookMany> bookManyHashSet = new HashSet<>();
		BookMany bookMany = new BookMany();
		bookMany.setName("Spring");
		bookManyHashSet.add(bookMany);

		authorMany.setBook(bookManyHashSet);

		HashSet<AuthorMany> authorManyHashSet = new HashSet<>();
		authorManyHashSet.add(authorMany);

		bookMany.setAuthor(authorManyHashSet);

		authorManyRepo.save(authorMany);
	}

}
