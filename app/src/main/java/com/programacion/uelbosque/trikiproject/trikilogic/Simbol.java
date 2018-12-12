package com.programacion.uelbosque.trikiproject.trikilogic;

public class Simbol {
	
	private String simbol;
	
	public Simbol(int player)
	{
		if(player == 1)
		{
			this.simbol = "X";
		}
		else if(player == 2)
		{
			this.simbol ="O";			
			
		}
		else
		{
			this.simbol = "N";
		}
	}
	
	public Simbol(String simb)
	{
		this.simbol = simb;
		
	}

	public String getSimbol() {
		return simbol;
	}

	public void setSimbol(String simbol) {
		this.simbol = simbol;
	}

	@Override
	public String toString() {
		return "Simbol [simbol=" + simbol + "]";
	}
	
	

}
