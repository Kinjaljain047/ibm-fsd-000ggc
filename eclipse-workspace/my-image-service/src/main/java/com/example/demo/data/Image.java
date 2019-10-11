package com.example.demo.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class Image {
private long imageId;
private String description;
private String url;




public Image() {
	super();
}


public long getImageId() {
	return imageId;
}


public void setImageId(long imageId) {
	this.imageId = imageId;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public String getUrl() {
	return url;
}


public void setUrl(String url) {
	this.url = url;
}


public Image(long imageId, String description, String url) {
	super();
	this.imageId = imageId;
	this.description = description;
	this.url = url;
}


}
