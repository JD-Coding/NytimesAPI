package com.example.demo.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NytimesJsonModel {
	
	private String status;
	
	private String copyright;
	
	private String num_results;
	
	private ArrayList<NytimesNews> results;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getNum_results() {
		return num_results;
	}

	public void setNum_results(String num_results) {
		this.num_results = num_results;
	}

	public ArrayList<NytimesNews> getResults() {
		return results;
	}

	public void setResults(ArrayList<NytimesNews> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "NytimesJsonModel [status=" + status + ", copyright=" + copyright + ", num_results=" + num_results
				+ ", results=" + results + "]";
	}

	
	
}
