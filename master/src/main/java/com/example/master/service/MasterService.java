package com.example.master.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.master.model.MasterModel;
import com.example.master.repository.MasterRepository;

@Service
@Transactional

public class MasterService {
	
	@Autowired
	
	private MasterRepository masterRepository;
	
	public void create(MasterModel masterModel) {
		this.masterRepository.save(masterModel);
	}
	
	public List<MasterModel>readData(){
		return this.masterRepository.findAll();
	}

}
