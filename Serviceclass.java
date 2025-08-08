package com.example.DeviDB.ServiceDB;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DeviDB.EntityDB.Entityclass;
import com.example.DeviDB.RepoDB.Repointerface;

@Service
public class Serviceclass {
	@Autowired
	Repointerface rp;
	
	public Entityclass method1(Entityclass es) {
		return rp.save(es);
	}
	
	public List<Entityclass> method2() {
		return rp.findAll();
	}
	
	public Optional<Entityclass> method3(int emp_id){
		return rp.findById(emp_id);
		
	}
	
	public Entityclass method4(Entityclass newdata,int emp_id) {
		Entityclass olddata=rp.findById(emp_id).orElseThrow()->new NullPointerException("ID not found"));
		olddata.setname(newdata.getname());
		olddata.setlocation(newdata.getlocation());
		olddata.setrole(newdata.getrole());
		return rp.save(olddata);
		
	}
	
	public String method5(int emp_id) {
		if(rp.exitsById(emp_id)) {
			rp.deleteById(emp_id){
				return "Deleted successfully";
			}
			else {
				return "Id is not found";
			}
		}
	}

