public class LibraryCatalog {
	Book book1;  // agregation
	Book book2;
	Book book3;

	public void addBook(Book book) {
		if (book1 == null) {
			this.book1 = book;
			System.out.println("Added book1.");
			return;
		}
		if (book2 == null) {
			this.book2 = book;
			System.out.println("Added book2.");
			return;
		}
		if (book3 == null) {
			this.book3 = book;
			System.out.println("Added book3.");
			return;
		}
		System.out.println("Library is full at the moment.");

	}

	public void deleteBook(String book) {
		switch (book) {
			case "book1":
				this.book1 = null;
				break;
			case "book2":
				this.book2 = null;
				break;
			case "book3":
				this.book3 = null;
				break;
			default:
				System.out.println("Wrong requirement for deleting book. Book with name \"" + book + "\" not found.");
		}
	}

	public void listBooks() {
		System.out.println("\nListing all the books:");
		if (book1 != null) {
			System.out.println("book1: " + book1);
		} else {
			System.out.println("book1 is unavailable.");
		}
		if (book2 != null) {
			System.out.println("book2: " + book2);
		} else {
			System.out.println("book2 is unavailable.");
		}
		if (book3 != null) {
			System.out.println("book3: " + book3);
		} else {
			System.out.println("book3 is unavailable.");
		}
	}
}
