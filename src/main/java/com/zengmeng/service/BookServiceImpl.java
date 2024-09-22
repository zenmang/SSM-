package com.zengmeng.service;

import com.zengmeng.mapper.BookMapper;
import com.zengmeng.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class BookServiceImpl implements BookService{

    //@Autowired
    private BookMapper bookMapper;

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookId(int id) {
        return bookMapper.deleteBookId(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    @Override
    public Books queryBookByName(String name) {
        return bookMapper.queryBookByName(name);
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper=bookMapper;
    }
}
