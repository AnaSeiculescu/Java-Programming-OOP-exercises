public class Main {
	public static void main(String[] args) {
		LibraryCatalog catalog = new LibraryCatalog();

		Book book1 = new Novel("Enigma Otiliei", (short) 294, "realism");  //polimorfism - we use Book to create a Novel
		Book book2 = new Album("Modern Art", (short) 143, "high quality glossy papers");
		Book book3 = new Novel("Iliada", (short) 439, "mythology");

		// now, we just got these 3 books, and we want to add the in the library:
		catalog.addBook(book1);
		catalog.addBook(book2);
		catalog.addBook(book3);
		catalog.addBook(book2);

		catalog.listBooks();

		catalog.deleteBook("book3");
		catalog.listBooks();
		catalog.deleteBook("book5");
	}
}
