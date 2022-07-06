package priya.in.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import priya.in.entity.Details;
import priya.in.service.service;

@RestController
public class rest {
	@Autowired
	private service service;
	
	@PostMapping("/resister")
	public String resister(@RequestBody Details dtls) {
		return service.resister(dtls);
	}
	@GetMapping("/get-data")
	public List<Details> getDetails(){
		return service.getdata();
	}
	
}
