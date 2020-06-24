package com.example.master.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PELAJARAN")

public class MasterModel {
	
	@Id
	@Column (name="Kd_Pelajaran")
	private String KodePelajaran;
	
	@Column(name="Nm_Pelajaran")
	private String NamaPelajaran;
	
	@Column(name="Jam")
	private int JamAjar;
	
	public String getKodePelajaran() {
		return KodePelajaran;
	}

	public void setKodePelajaran(String kodePelajaran) {
		KodePelajaran = kodePelajaran;
	}

	public String getNamaPelajaran() {
		return NamaPelajaran;
	}

	public void setNamaPelajaran(String namaPelajaran) {
		NamaPelajaran = namaPelajaran;
	}

	public int getJamAjar() {
		return JamAjar;
	}

	public void setJamAjar(int jamAjar) {
		JamAjar = jamAjar;
	}

	public String getTingkat() {
		return Tingkat;
	}

	public void setTingkat(String tingkat) {
		Tingkat = tingkat;
	}

	public String getKeterangan() {
		return Keterangan;
	}

	public void setKeterangan(String keterangan) {
		Keterangan = keterangan;
	}

	@Column(name="Tingkat")
	private String Tingkat;
	
	@Column(name="Keterangan")
	private String Keterangan;

	
	
}
