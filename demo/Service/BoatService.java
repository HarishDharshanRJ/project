package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.BoatRepository;
import com.example.demo.Model.BoatModel;
@Service

public class BoatService
{
	@Autowired
    public BoatRepository crepo;
	
	public BoatModel saveInfo(BoatModel c)
	{
		return crepo.save(c);
	}
	public List<BoatModel> getInfo()
	{
		return crepo.findAll();
	}
	public BoatModel updateInfo(BoatModel iu)
	{
		return crepo.saveAndFlush(iu);
		
	}
	public void deleteInfo(int id )
	{
		crepo.deleteById(id);
	}
}