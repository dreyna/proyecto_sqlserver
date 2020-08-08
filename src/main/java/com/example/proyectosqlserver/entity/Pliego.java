package com.example.proyectosqlserver.entity;

public class Pliego {
	private String id_pliego;
	private String pliego;
	public Pliego(String id_pliego, String pliego) {
		this.id_pliego = id_pliego;
		this.pliego = pliego;
	}
	public Pliego() {
	}
	public String getId_pliego() {
		return id_pliego;
	}
	public void setId_pliego(String id_pliego) {
		this.id_pliego = id_pliego;
	}
	public String getPliego() {
		return pliego;
	}
	public void setPliego(String pliego) {
		this.pliego = pliego;
	}
	
}
