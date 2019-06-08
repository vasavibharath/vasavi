package com.cg.jpacrud.service;


import com.cg.jpacrud.dao.AuthorDao;
import com.cg.jpacrud.dao.AuthorDaoImp1;

import com.cg.jpacrud.entities.Author;


public class AuthorServiceImp1 implements AuthorService {
	private  AuthorDao dao;

	public AuthorServiceImp1() {
		dao = new AuthorDaoImp1();
	}
	@Override
	public void addAuthor(Author author) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addAuthor(author);
		dao.commitTransaction();
		
	}

	@Override
	public void updateAuthor(Author author) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateAuthor(author);
		dao.commitTransaction();
		
	}

	@Override
	public void removeAuthor(Author author) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeAuthor(author);
		dao.commitTransaction();
		
	}

	@Override
	public Author findAuthortById(int id) {
		// TODO Auto-generated method stub
		Author author  = dao.getAuthorById(id);
		return author;
	}
	
}
