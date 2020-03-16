public class Noticia {
	private String title;
	private String description;

	public Noticia() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
		return this.title + "\n \n \n" + this.description + "\n \n \n \n";
	}

}