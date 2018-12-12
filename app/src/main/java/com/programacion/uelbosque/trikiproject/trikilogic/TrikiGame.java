package com.programacion.uelbosque.trikiproject.trikilogic;

public abstract class TrikiGame implements Makable{
	
	private Player player2, player1;
	private Turn turn;
	private Table table;
	private boolean gameOn;
	private int marks;
	
	public TrikiGame(Player pPlayer)
	{
		this.player1 = pPlayer;
		this.player2 = new Player();
		this.table = new Table();
		this.gameOn = true;
		this.turn = new Turn(1);
		this.marks = 0;
		
	}
	
	

	public Turn getTurn() {
		return turn;
	}



	public void setTurn(Turn turn) {
		this.turn = turn;
	}



	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}
	
	

	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	@Override
	public String toString() {
		return "TrikiGame [player2=" + player2 + ", player1=" + player1
				+ ", table=" + table + ", gameOn=" + gameOn + "]";
	}

	public boolean isGameOn() {
		return gameOn;
	}

	public void setGameOn(boolean gameOn) {
		this.gameOn = gameOn;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}
	
	public int verify()
	{
		
		int winner = 0;
		winner = this.table.verifyRows();
		if(winner == 0)
		{
			winner = this.table.verifyColumns();
			if(winner == 0)
			{
				winner = this.table.verifyDiagonal1();
				if(winner ==0)
				{
					winner = this.table.verifyDiagonal2();
				}
			}
		}	
		this.marks++;
		
		if(winner != 0 || this.marks == 9)
		{
			this.gameOn = false;
			this.addStatistics(winner);
		}
		return winner;
	}
	
	public boolean newGame()
	{
		boolean game = false;
		this.table = new Table();
		this.gameOn = true;
		this.turn = new Turn(1);
		this.marks = 0;
		game = true;
		return game;
	}
	
	public void addStatistics(int winner)
	{
		if(this.player1.getNumber() == winner)
		{
			this.player1.setWinGames(this.player1.getWinGames() + 1);
			this.player2.setLoseGames(this.player2.getLoseGames() + 1);
		}
		else if(this.player2.getNumber() == winner)
		{
			this.player2.setWinGames(this.player2.getWinGames() + 1);
			this.player1.setLoseGames(this.player1.getLoseGames() + 1);
		}
		
		this.player1.setTotalGames(this.player1.getTotalGames() + 1);
		this.player2.setTotalGames(this.player2.getTotalGames() + 1);
	}
	
	public String getStatics()
	{
		String statics = "STATICS:\n\n";
		
		statics += this.getPlayer1().getName()+":\nWin games:"+
					String.valueOf(this.getPlayer1().getWinGames())+"\nLose games: "+
				    String.valueOf(this.getPlayer1().getLoseGames())+"\nTotal games: "+
					String.valueOf(this.getPlayer1().getTotalGames())+"\n\n";
		
		statics += this.getPlayer2().getName()+":\nWin games:"+
				String.valueOf(this.getPlayer2().getWinGames())+"\nLose games: "+
			    String.valueOf(this.getPlayer2().getLoseGames())+"\nTotal games: "+
				String.valueOf(this.getPlayer2().getTotalGames())+"\n\n";
	
		
		
		return statics;
	}

}
