package io.brex.RestAPI.Client.Model;


import java.util.ArrayList;
import java.util.HashMap;

public class Company {
	protected String id,name,registrationNumber,country,status,dateOfIncorporation,legalForm;
	protected ArrayList<String> address,managingDirectors,sicNaceCodes;
	protected HashMap<String, String> extraData;

	
	public Company() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDateOfIncorporation() {
		return dateOfIncorporation;
	}
	public void setDateOfIncorporation(String dateOfIncorporation) {
		this.dateOfIncorporation = dateOfIncorporation;
	}
	public String getLegalForm() {
		return legalForm;
	}
	public void setLegalForm(String legalForm) {
		this.legalForm = legalForm;
	}
	public ArrayList<String> getAddress() {
		return address;
	}
	public void setAddress(ArrayList<String> address) {
		this.address = address;
	}
	public ArrayList<String> getManagingDirectors() {
		return managingDirectors;
	}
	public void setManagingDirectors(ArrayList<String> managingDirectors) {
		this.managingDirectors = managingDirectors;
	}
	public ArrayList<String> getSicNaceCodes() {
		return sicNaceCodes;
	}
	public void setSicNaceCodes(ArrayList<String> sicNaceCodes) {
		this.sicNaceCodes = sicNaceCodes;
	}
	
	public HashMap<String, String> getExtraData() {
		return extraData;
	}
	public void setExtraData(HashMap<String, String> extraData) {
		this.extraData = extraData;
	}

	
}
