package Bazy_danych.Aplikacja.Bezpieczenstwo;

import java.util.ArrayList;

import Bazy_danych.Aplikacja.mariadb.Mariadb;
import Bazy_danych.Aplikacja.mariadb.MariadbService;

public class Sign_in_Proxy extends Mariadb{
	private MariadbService service;
	private UI_Proxy proxy;
	
	public Sign_in_Proxy(String x, String y) {
		this.login =x;
		this.password = y;
		this.service = new MariadbService(x,y);
		this.IDs = new ArrayList<Integer>();
		this.acceses = new ArrayList<Acces>();
	}
	
	@Override
	public int sign_in() {
		service.estabilish_connection("BazyUser","123");
		int x = service.sign_in();
		setAcces();
		setIDs("");
		setUI();
		service.close_connection();
		service = null;
		return x;
	}
	
	@Override
	public ArrayList<Acces> getAcces() {
		return acceses;
	}

	@Override
	public void estabilish_connection(String x, String y) {
		
		
	}

	@Override
	public void close_connection() {
		service.close_connection();
		
	}

	@Override
	protected void setAcces() {
		acceses = service.getAcces();
		
	}

	@Override
	public ArrayList<Integer> getIDs() {
		return IDs;
	}

	@Override
	protected void setIDs(String x) {
		IDs = service.getIDs();
		
	}

	@Override
	protected void setUI() {
		proxy = new UI_Proxy(service.getAcces(),service.getIDs());
		
	}

	@Override
	public UI_Proxy getUI() {
		return proxy;
	}

}