package com.programacion.uelbosque.trikiproject.trikilogic;

public class Player {
	
	private boolean state;
	private String name;
	private int number;
	private Simbol simbol;
	private int winGames,loseGames,totalGames;
	
	public Player(String name, int number) 
	{
		this.state = false;
		this.name = name;
		this.number = number;
		this.simbol = new Simbol(number);
		this.winGames = 0;
		this.loseGames = 0;
		this.totalGames = 0;
	}
	
	public Player()
	{
		this.state = false;
		this.name = "CPU";
		this.number = 2;
		this.simbol = new Simbol(number);
		this.winGames = 0;
		this.loseGames = 0;
		this.totalGames = 0;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Player [state=" + state + ", name=" + name + ", number="
				+ number + ", simbol=" + simbol + ", winGames=" + winGames
				+ ", loseGames=" + loseGames + ", totalGames=" + totalGames
				+ "]";
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Simbol getSimbol() {
		return simbol;
	}

	public void setSimbol(Simbol simbol) {
		this.simbol = simbol;
	}

	public int getWinGames() {
		return winGames;
	}

	public void setWinGames(int winGames) {
		this.winGames = winGames;
	}

	public int getLoseGames() {
		return loseGames;
	}

	public void setLoseGames(int loseGames) {
		this.loseGames = loseGames;
	}

	public int getTotalGames() {
		return totalGames;
	}

	public void setTotalGames(int totalGames) {
		this.totalGames = totalGames;
	}
	
	public void changeState(int turn)
	{
		if(turn == this.number)
		{
			this.state = true;
		}
		else
		{
			this.state = false;
		}
		
	}
	
	
	
	

}
