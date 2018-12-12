package com.programacion.uelbosque.trikiproject.trikilogic;

public class Turn {
	
	private int turn;
	
	public Turn(int player)
	{
		this.turn = player;
		
	}
	
	public Turn()
	{
		this.turn = 1;
	}

	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}
	
	public void change()
	{
		if(this.turn == 1)
		{
			this.turn = 2;
		}
		else
		{
			this.turn = 1;
		}
	}

	@Override
	public String toString() {
		return "Turn [turn=" + turn + "]";
	}
	
	

}
