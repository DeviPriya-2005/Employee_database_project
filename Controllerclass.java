package com.example.DeviDB.ControllerDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DeviDB.EntityDB.Entityclass;
import com.example.DeviDB.ServiceDB.Serviceclass;
import java.util.*;

@RequestMapping("/home")
@RestController("/welcome")
public class Controllerclass {
	@Autowired
	Serviceclass sc;
	@PostMapping("/post")
	public Entityclass display(@RequestBody Entityclass es) {
      return sc.method1(es);
	}
	@GetMapping("/get")
	public List<Entityclass> dispaly2(){
		return sc.method2();
	}
	@GetMapping("get/{emp_id}")
	public Optional<Entityclass> display3(@PathVariable("emp_id")int emp_id){
		return sc.method3(emp_id);
	}
	@GetMapping("/delete/{del}")
	public String display4(@PathVariable(value="del" )int id) {
		return sc.method4(id);
	}
	
	@PutMapping("update/{data}")
	public Entityclass display4(@RequestBody Entityclass edd,@PathVariable(value="data") int emp_id) {
		return sc.method4(edd,emp_id);
	}
}
