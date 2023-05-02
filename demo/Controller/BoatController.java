package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.BoatModel;
import com.example.demo.Service.BoatService;

@RestController

public class BoatController 
{
	@Autowired
	public BoatService cser;
		
	@PostMapping("/postm")
	public BoatModel addDetails(@RequestBody BoatModel cr)
	{
		return cser.saveInfo(cr);
	}
	@GetMapping("/getma")
	public List <BoatModel> getDetails()
	{
		return cser.getInfo();
	}
	
	@PutMapping("/updatem")
	public BoatModel updateDetails(@RequestBody BoatModel Boatnum)
	{
		return cser.updateInfo(Boatnum);
	}
	
	@DeleteMapping("delete/{cid}")
	public String deleteDetails (@PathVariable ("cid") int Boatnum)
	{
		cser.deleteInfo(Boatnum);
		return "Boat number "+Boatnum+" is deleted";
				
	}
	@DeleteMapping("/deleteReq")
	public String deleteByReq(@RequestParam ("cid") int Boatnum)
	{
		cser.deleteInfo(Boatnum);
		return "Boat number "+Boatnum+" is deleted";
	}
}