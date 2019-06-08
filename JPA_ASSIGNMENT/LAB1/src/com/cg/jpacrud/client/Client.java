package com.cg.jpacrud.client;

import com.cg.jpacrud.entities.Author;
import com.cg.jpacrud.service.AuthorService;
import com.cg.jpacrud.service.AuthorServiceImp1;


public class Client {

	public static void main(String[] args) {

		//Debug this program as Debug -> Debug as Java Application
		
		AuthorService service = new  AuthorServiceImp1();
		
		Author author = new Author();
		author.setAuthorId(1);
		author.setFirstName("vasavi");
		author.setMiddleName("vasu");
		author.setLastName("kanigiri");
		author.setPhoneNo("98989898989");
		
		service.addAuthor(author);
		
        //at this breakpoint, we have added one record to table
		
		
		author = service.findAuthortById(1);
		
		System.out.print("ID:"+author.getAuthorId());
		System.out.println(" FistName:"+author.getFirstName());
		System.out.println(" MiddleName:"+author.getMiddleName());
		System.out.println(" LastName:"+author.getLastName());
		System.out.println(" PhoneNo:"+author.getPhoneNo());
		
		author.setFirstName("vaasu");
		service.updateAuthor(author);
		
		//at this breakpoint, we have updated record added in first section
		author = service.findAuthortById(1);
		
		System.out.print("ID:"+author.getAuthorId());
		System.out.println(" FistName:"+author.getFirstName());
		System.out.println(" MiddleName:"+author.getMiddleName());
		System.out.println(" LastName:"+author.getLastName());
		System.out.println(" PhoneNo:"+author.getPhoneNo());
		
		//at this breakpoint, record is removed from table
		service.removeAuthor(author);
		System.out.println("End of program...");
		
		
		

	}

	
}
