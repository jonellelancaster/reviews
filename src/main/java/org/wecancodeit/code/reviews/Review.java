package org.wecancodeit.code.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Review {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String imageUrl;
	private String catagory;
	private String content;

	public String getName() {
		return name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	

	public String getCatagory() {
		return catagory;
	}

	public String getContent() {
		return content;
	
	}
	protected Review() {}


	public Review(String name, String imageUrl, String catagory, String content) {
		this.name = name;
		this.imageUrl = imageUrl;
		this.catagory = catagory;
		this.content = content;
		
		
		}

	@Override
	public String toString() {
		return "Review [name=" + name + ", imageUrl=" + imageUrl + ", catagory=" + catagory + ", content=" + content
				+ "]";
	}

}
	

