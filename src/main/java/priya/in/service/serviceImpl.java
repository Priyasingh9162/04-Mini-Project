package priya.in.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import priya.in.entity.Details;
import priya.in.entity.repo;

@Service
public class serviceImpl implements service {
	@Autowired
	private repo repo;
	
	@Override
	public String resister(Details dtls) {
		String url ="http://localhost:8080/ssl/{code}";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> entity = rt.getForEntity(url, String.class, dtls.getSsl());
		String body = entity.getBody();
		if(body.equalsIgnoreCase("New Jersey")) {
			Details details = repo.save(dtls);
			return "resistration successfull with "+ details.getId();
			
		}
		return "Invalid State";
			
	}

	@Override
	public List<Details> getdata() {
		System.out.println(repo.findAll());
		return repo.findAll();
	}

}
