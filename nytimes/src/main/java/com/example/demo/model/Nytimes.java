package com.example.demo.model;

import java.util.Date;
import java.util.List;

public class Nytimes {



	 
	 private String section;
	 
	 private String period;
	 
	 private NytimesJsonModel nytimesNews;



	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}



	public NytimesJsonModel getNytimesNews() {
		return nytimesNews;
	}

	public void setNytimesNews(NytimesJsonModel nytimesNews) {
		this.nytimesNews = nytimesNews;
	}

	@Override
	public String toString() {
		return "Nytimes [section=" + section + ", period=" + period + ", nytimesNews=" + nytimesNews + "]";
	}





	 
	 
	
}
