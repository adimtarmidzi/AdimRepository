 package com.example.master;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.master.model.MasterModel;
import com.example.master.service.MasterService;

@RestController
@RequestMapping("/api/pelajaran")
public class MasterAPI {
	
	@Autowired
	private MasterService masterService;
	
	@PostMapping("/post")
	@ResponseStatus(code = HttpStatus.CREATED)
	
	public Map<String, Object>postMaping(@RequestBody MasterModel masterModel){
		
		this.masterService.create(masterModel);	
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("succes", Boolean.TRUE);
		map.put("Pesan", "datanya sudah masuk");
		return map;
	}
	
	@GetMapping("/get")
	@ResponseStatus(code= HttpStatus.OK)
	public List<MasterModel>getMapping(){
		
		List<MasterModel>masterModelList = new ArrayList<MasterModel>();
		masterModelList=this.masterService.readData();
		return masterModelList;
	}
	
}
