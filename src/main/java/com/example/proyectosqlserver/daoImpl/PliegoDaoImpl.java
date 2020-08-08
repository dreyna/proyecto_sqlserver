package com.example.proyectosqlserver.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.proyectosqlserver.dao.PliegoDao;
import com.example.proyectosqlserver.entity.Pliego;

@Repository
public class PliegoDaoImpl implements PliegoDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Pliego> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select *from dbo.pliego", BeanPropertyRowMapper.newInstance(Pliego.class));
	}

}
