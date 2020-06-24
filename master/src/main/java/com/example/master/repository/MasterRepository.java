package com.example.master.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.master.model.MasterModel;

public interface MasterRepository extends JpaRepository<MasterModel, String> {
	
	//@Query("select m from masterModel m")List<MasterModel>bacaData();
	
	//@Query("select m from masterModel m where m.NamaPelajaran like %?1%")
	//List<MasterModel>cariNama(String NamaPelajaran);

}
