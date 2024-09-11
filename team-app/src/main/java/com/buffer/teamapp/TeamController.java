package com.buffer.teamapp;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class TeamController {
	
	@GetMapping("/")
	public List<String> getPlayersForTeam(){
		System.out.println("Running on "+Thread.currentThread());
		RestClient restClient = RestClient.builder()
				.baseUrl("http://localhost:8081")
				.build();
		return restClient.get().uri("/players").retrieve()
				.toEntity(List.class).getBody();
	}

}
