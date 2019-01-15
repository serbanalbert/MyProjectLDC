package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Books {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String bookName;

    private String bookAuthor;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getbookName() {
		return bookName;
	}

	public void setbookName(String bookname) {
		this.bookName = bookname;
	}

	public String getbookAuthor() {
		return bookAuthor;
	}

	public void setbookAuthor(String Author) {
		this.bookAuthor = Author;
	}
    
	@Override
    public String toString() {
        return "\nBook {" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                '}' + "\n";
    }
    
	/*
	 * mydbforproject - database name
	   test_albert user test123 pw
	 * 
	 * /
	 */
}

