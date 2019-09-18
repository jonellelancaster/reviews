package org.wecancodeit.code.reviews;

public class Review {

	private Long id;
	private String name;
	private String image;
	private String catagory;
	private String content;

	public String getName() {
		return name;
	}

	public String getImage() {
		return image;
	}

	public String getCatagory() {
		return catagory;
	}

	public String getContent() {
		return content;
	}

	public Long getId() {
		return id;
	}

	public Review(long id, String name, String image, String catagory, String content) {
		this.id = id;
		this.name = name;
		this.image = image;
		this.catagory = catagory;
		this.content = content;
	}
}
