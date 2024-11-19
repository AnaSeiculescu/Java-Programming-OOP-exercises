public class Album extends Book {  // inheritance
	public String paperQuality;

	public Album(String name, short numberOfPages, String paperQuality) {
		this.name = name;
		this.numberOfPages = numberOfPages;
		this.paperQuality = paperQuality;
	}

	@Override
	public String toString() {
		return "Album{" +
				"name='" + name + '\'' + ", " +
				"number of pages='" + numberOfPages + '\'' + ", " +
				"paper quality='" + paperQuality + '\'' +
				'}';
	}
}
