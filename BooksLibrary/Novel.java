public class Novel extends Book {  // inheritance
	public String type;

	public Novel(String name, short numberOfPages, String type) {
		this.name = name;
		this.numberOfPages = numberOfPages;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Novel{" +
				"name='" + name + '\'' + ", " +
				"number of pages='" + numberOfPages + '\'' + ", " +
				"type='" + type + '\'' +
				'}';
	}
}
