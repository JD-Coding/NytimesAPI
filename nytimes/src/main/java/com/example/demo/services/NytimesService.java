package com.example.demo.services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.NytimesJsonModel;
import com.example.demo.model.NytimesNews;

public class NytimesService {
	
	public ArrayList<NytimesNews> populateNytimesNews() {
		
		NytimesNews news = new NytimesNews();
		ArrayList<NytimesNews> al = new ArrayList();
		news.setId(1);
		news.setByline("Jeya");
		news.setPublished_date(new Date());
		news.setUrl("http://www.cnn.com");
		news.setTitle("todays News");
		al.add(news);
		
		news.setId(2);
		news.setByline("Jeya");
		news.setPublished_date(new Date());
		news.setUrl("http://www.cnn.com");
		news.setTitle("todays News");
		al.add(news);
		
		news.setId(3);
		news.setByline("Jeya");
		news.setPublished_date(new Date());
		news.setUrl("http://www.cnn.com");
		news.setTitle("todays News");
		al.add(news);
		
		System.out.println("size of the arraylist"+al.size());
		
		
		return al;
		
	}
	
	
	public String getTopStories() throws Exception {
		String apiKey = "";
        URL url = new URL("http://api.nytimes.com/svc/mostpopular/v2/mostviewed/all-sections/7.json?api-key=35c6ecd6639b487084deac95f88663cf");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int statusCode = connection.getResponseCode();
        if (statusCode != HttpStatus.OK.value()) {
            throw new Exception("NYT responded with:" + statusCode);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line+"\n");
        }
        bufferedReader.close();
        return stringBuilder.toString();
    }
	
	public NytimesJsonModel getNews(String section, String period) {
		  RestTemplate restTemplate = new RestTemplate();
		  String url = "http://api.nytimes.com/svc/mostpopular/v2/mostviewed/" + section +"/"+period+".json?api-key=35c6ecd6639b487084deac95f88663cf";
		  NytimesJsonModel news = restTemplate.getForObject(url, NytimesJsonModel.class);
	        System.out.println(news.toString());
	      return news; 
	}

}
