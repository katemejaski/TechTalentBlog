package com.techtalentsouth.TechTalentBlog.repository;
import com.techtalentsouth.TechTalentBlog.model.BlogPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.Optional;

@Repository
public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {

    Optional<BlogPost> findByAuthor(String author);
    Iterable<Book> findByOrderByTitleAsc();

}