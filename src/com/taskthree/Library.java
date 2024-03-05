package com.taskthree;


class Library{
	
	private Book[] books;
	private int size = 0;
	
	//constructor
	public Library() {
		this .books = new Book[5];
	}
		
	//adding books	
	public void addBook(Book book) {
		if(size<books.length) {
		books[size]= book;
		size++;
		}
	}
	
	//removing books
	public void replaceBook(int bookId) {
		
		for(Book book:books) {
			if (book.getBookId()==bookId) {
				book.setAvailable(false);	
			}
		}
	}
	
	
	//search book
	public void searchBook(int bookId) {
		
		for(Book book:books) {
			if (book.getBookId()==bookId) {
				System.out.println("Book Found - " + " Title: "+book.getTitle());
			}
		}
		
	}
	
	//displaying book details
	public void displayBooks() {
		
		for(Book book:books) {
			System.out.println("BookID: " + book.getBookId()+ " Title: " + book.getTitle()+" AuthorName: " + book.getAuthor()+" IsAvailable: "+book.isAvailable());	
		}
		
	}	
}
