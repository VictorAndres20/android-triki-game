package com.programacion.uelbosque.trikiproject.trikilogic;

public class Space {
	
	private int number;
	private Simbol simbol;
	
	public Space()
	{
		this.number = 0;
		this.simbol=new Simbol("N");
		
	}
	
	public Space(Player player)
	{
		this.number = player.getNumber();
		this.simbol=player.getSimbol();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
		this.simbol = new Simbol(number);
		
	}

	public Simbol getSimbol() {
		return simbol;
	}

	public void setSimbol(Simbol simbol) {
		this.simbol = simbol;
	}

	@Override
	public String toString() {
		return "Space [number=" + number + ", simbol=" + simbol + "]";
	}

	
	
	

}
