package com.example.proyectosqlserver.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectosqlserver.dao.PliegoDao;
import com.example.proyectosqlserver.entity.Pliego;
import com.example.proyectosqlserver.service.PliegoService;
@Service
public class PliegoServiceImpl implements PliegoService{
@Autowired
private PliegoDao pliegoDao;
	@Override
	public List<Pliego> readAll() {
		// TODO Auto-generated method stub
		return pliegoDao.readAll();
	}

}
