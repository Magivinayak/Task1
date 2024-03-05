package com.taskthree;

import java.util.Scanner;

public class BookManagementSystem {

	public static void main(String[] args ) {
  	  
  	  //object
  	  Library libraryobj = new Library();
  	  //Input         
  	  Scanner userInput = new Scanner(System.in);
  	  int userSize = 5,bookId;
  	  String bookName,bookAuthor;
  	  for(int i = 0;i<userSize ; i++) {
  		  
  		  System.out.println("Enter the Book Id , Title , AuthorName ,");
  		  bookId = userInput.nextInt();
  		  bookName = userInput.next();
  		  bookAuthor = userInput.next();
  		  Book book=new Book(bookId ,bookName ,bookAuthor);
  		  libraryobj.addBook(book);  
  	  }
  	  
  	  System.out.println();
  	  System.out.println("Enter the BookId to remove");
  	  bookId = userInput.nextInt();
  	  libraryobj.replaceBook(bookId);
  	  
  	  System.out.println();
  	  System.out.println("Enter the BookId to search");
  	  bookId = userInput.nextInt();
  	  libraryobj.searchBook(bookId);
  	  
  	  
  	  System.out.println();
  	  System.out.println("All Book Details:-");
  	  libraryobj.displayBooks();//output
  	  userInput.close();

}

}

/*
 ---------------------------output--------------------------------------------------
 
 Enter the Book Id , Title , AuthorName ,
10
SunRise
SunGod
Enter the Book Id , Title , AuthorName ,
11
MoonShine
Magesh
Enter the Book Id , Title , AuthorName ,
12
CrossRoad
Kimura
Enter the Book Id , Title , AuthorName ,
13
PathFinder
Hitoshi
Enter the Book Id , Title , AuthorName ,
14
Demon
Toru

Enter the BookId to remove
12

Enter the BookId to search
11
Book Found -  Title: MoonShine

All Book Details:-
BookID: 10 Title: SunRise AuthorName: SunGod IsAvailable: true
BookID: 11 Title: MoonShine AuthorName: Magesh IsAvailable: true
BookID: 12 Title: CrossRoad AuthorName: Kimura IsAvailable: false
BookID: 13 Title: PathFinder AuthorName: Hitoshi IsAvailable: true
BookID: 14 Title: Demon AuthorName: Toru IsAvailable: true
 
 
 
 */





