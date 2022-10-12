package com.java11.assignments;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Version;
import java.net.http.HttpResponse.BodyHandlers;

public class Sixth {

	public static void main(String[] args) {
		
		String uri="https://httpbin.org/get";
		
		HttpRequest req=(HttpRequest) HttpRequest.newBuilder()
				.uri(URI.create(uri))
				.GET()
				.version(Version.HTTP_2)
				.build();
		
        HttpClient client=HttpClient.newBuilder()
        		.build();
		
		try {
			
			HttpResponse<String> res=client.send(req, BodyHandlers.ofString());
			System.out.println(res.statusCode());
			System.out.println(res.body());
			
		}
		
		catch(IOException  | InterruptedException e) {
			e.toString();
		}
		
	}

}
