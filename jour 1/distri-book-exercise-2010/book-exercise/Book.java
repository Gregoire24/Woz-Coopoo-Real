/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int numberOfPages;
    private String refNumber;
    private int numbBorrowings;
    private boolean registered = false;
    private boolean borrowed = false;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
        numberOfPages = 0;
        this.refNumber = "";
    }

    // Add the methods here ...
    
    public String getAuthor()
    {
      return author;  
    }
    
    public String getTitle()
    {
      return title;  
    }
    
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    public void printTitle()
    {
        System.out.println(title);
    }
    
    public void setPages(int numberOfPages)
    {
        this.numberOfPages = numberOfPages;
    }
    
    public int getPages()
    {
        return numberOfPages;
    }
    
    public void printDetails()
    {
        System.out.println("##################");
        System.out.println("# Author");
        System.out.println(author);
        System.out.println("# Title");
        System.out.println(title);
        System.out.println("# Pages");
        System.out.println(numberOfPages);
        System.out.println("##################");
    }
    
    public String getRefNumber() {
        return refNumber;
    }
    
    public void setRefNumber(String refNumber) {
    if (refNumber.length() >= 3) {
        this.refNumber = refNumber;
        this.registered = true;
    } else {
        System.out.println("Error: refNumber must be at least 3 characters long.");
    }
}
    
    public boolean borrow() {
    if (registered == false) {
        System.out.println("Error: The book is not registered. You can't borrow it.");
        return false;  
    }
    if (borrowed == true) {
        System.out.println("Error: The book is already borrowed.");
        return false;  
    }
    borrowed = true;
    System.out.println("You have successfully borrowed the book.");
    return true;  
}
    
  //  public int countOfBorrowings (int numbBorrowings)
    //{
      //  if (borrowed == true)
        
  //  }
    
    public int getcountOfBorrowings()
    {
        return numbBorrowings;
    }
    
    public boolean getRegistered()
    {
        return registered;
    }
    
    public boolean getBorrowed()
    {
        return borrowed;
    }
}
