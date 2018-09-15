package com.example.demo.model;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NytimesNews {

	 private long id;
	 
	 private String title;
	 
	 private String byline;
	 
	 private String url;
	 
	 private Date published_date;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public String getByline() {
		return byline;
	}

	public void setByline(String byline) {
		this.byline = byline;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}



	public Date getPublished_date() {
		return published_date;
	}

	public void setPublished_date(Date published_date) {
		this.published_date = published_date;
	}

	@Override
	public String toString() {
		return "NytimesNews [id=" + id + ", title=" + title + ", byline=" + byline + ", url=" + url
				+ ", published_date=" + published_date + "]";
	}




	 
	 
	
}
