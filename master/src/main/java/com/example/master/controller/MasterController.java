package com.example.master.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.master.model.MasterModel;
import com.example.master.service.MasterService;


@Controller
public class MasterController {
	
	@Autowired
	private MasterService masterService;
	
	
	@RequestMapping("/insert")
	
	public String insert () {
		String html ="insert";
		return html;
	}
	
	@RequestMapping("/Pelajaran/create")
	
	public String masterCreate(HttpServletRequest request, Model model ) {
		
		String kodePelajaran = request.getParameter("kdpealjaran");
		String namaPelajaran = request.getParameter("nmpelajaran");
		int jamAjar = Integer.parseInt(request.getParameter("jam" ));
		String tingkat = request.getParameter("tingkat");
		String keterangan = request.getParameter("keterangan" );
		
		
		MasterModel masterModel = new MasterModel();
	
		
		
		masterModel.setKodePelajaran(kodePelajaran);
		masterModel.setNamaPelajaran(namaPelajaran);
		masterModel.setJamAjar(jamAjar);
		masterModel.setTingkat(tingkat);
		masterModel.setKeterangan(keterangan);
		
		
		//save
		this.masterService.create(masterModel);
		
		
		//List
		this.ListMaster(model);
	
		String html = "/Pelajaran/list";
		
		return html;
		
		
	}
	//@RequestMapping ("/Pelajaran/list")
		//void krn ga return apapun
		//model buat ambil data dari backend ke frontend
	
	
	
	public void ListMaster (Model model) { 
		//kalo datanya banyak, instance pake list
		//klo 1, pake new biasa.
		  
		  
		  List<MasterModel> masterModelList = new ArrayList<MasterModel>(); 
		//disini data udah kebaca
		  
		  
		masterModelList = masterService.readData();
	  model.addAttribute("masterModelList",masterModelList);
	  
	  }
	 
	
		
	}

