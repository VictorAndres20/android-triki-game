package com.programacion.uelbosque.trikiproject.trikilogic;

import java.util.Arrays;

public class Table {

	public static final int ROWS=3;
	public static final int COLUMNS=3;
	
	private Space[][] spaces = new Space[ROWS][COLUMNS];
	private int space;
	
	public Table()
	{
		space = 0;
		emptyTable();
	}

	public int getSpace()
	{
		return this.space;
	}
	
	public void emptyTable()
	{
		for(int x=0;x<ROWS;x++)
		{
			for(int y=0;y<COLUMNS;y++)
			{
				Space sp = new Space();
				spaces[x][y] = sp;
				
			}
		}
		
	}
	
	public void showTableInConsole()
	{
		System.out.println("NUMBERED TABLE");
		for(int x=0;x<ROWS;x++)
		{
			for(int y=0;y<COLUMNS;y++)
			{
				
				System.out.print(spaces[x][y].getNumber());
				
			}
			System.out.print("\n");
		}
		
		System.out.println("SIMBOL TABLE");
		for(int x=0;x<ROWS;x++)
		{
			for(int y=0;y<COLUMNS;y++)
			{
				
				System.out.print(spaces[x][y].getSimbol());
				
			}
			System.out.print("\n");
		}
		
	}

	public Space[][] getSpaces() {
		return spaces;
	}

	public void setSpaces(Space[][] spaces) {
		this.spaces = spaces;
	}
	
	public int verifyRows()
	{
		int winner = 0;
		
		//ACROSS
		for(int x=0;x<ROWS;x++)
		{
			int counter = 0;
			for(int y=0;y<COLUMNS-1;y++)
			{
				
				if(spaces[x][y].getNumber() == spaces[x][y+1].getNumber())
				{
					counter++;
					winner = spaces[x][y].getNumber();				
				}				
			}
			if(counter == 2 && winner != 0)
			{
				
					break;
				
				
			}
			else if(counter != 2)
			{
				winner=0;
			}
			
		}
		
		return winner;
	}
	
	public int verifyColumns()
	{
		int winner = 0;
		
		//ACROSS
		for(int x=0;x<COLUMNS;x++)
		{
			int counter = 0;
			for(int y=0;y<ROWS-1;y++)
			{
				
				if(spaces[y][x].getNumber() == spaces[y+1][x].getNumber())
				{
					counter++;
					winner = spaces[y][x].getNumber();				
				}				
			}
			if(counter == 2 && winner != 0)
			{
				
					break;
				
			}
			else if(counter != 2)
			{
				winner = 0;
			}
			
		}
		
		return winner;
	}
	
	public int verifyDiagonal1()
	{
		int winner = 0;
		int counter = 0;
		
		for(int x=0;x<spaces.length-1;x++)
		{
			
				
			if(spaces[x][x].getNumber() == spaces[x+1][x+1].getNumber())
			{
				counter++;
				winner = spaces[x][x].getNumber();				
			}				
			
			if(counter == 2 && winner!=0)
			{
				
				break;
			}
			else if(counter != 2)
			{
				winner = 0;
			}
			
		}
		
		
		return winner;
	}
	
	public int verifyDiagonal2()
	{
		int winner = 0;
		int counter = 0;
		int y=0;
		
		for(int x=spaces.length;x>1;x--)
		{
			
				
			if(spaces[y][x-1].getNumber() == spaces[y+1][x-2].getNumber())
			{
				counter++;
				winner = spaces[y][x-1].getNumber();				
			}				
			
			if(counter == 2 && winner!=0)
			{
				
				break;
			}
			else if(counter != 2)
			{
				winner = 0;
			}
			y++;
		}
		return winner;
	}
	
	public boolean mark(int space, int turn)
	{
		boolean success = false;
		int count = 1;
		
		for(int x=0;x<ROWS;x++)
		{
			for(int y=0;y<COLUMNS;y++)
			{
				if(count == space)
				{
					if(spaces[x][y].getNumber()!=0)
					{
						x += ROWS;
						y += COLUMNS;
					}
					else if(spaces[x][y].getNumber()==0)
					{
						spaces[x][y].setNumber(turn);
						success = true;
					}					
				}
				count++;			
			}
			
		}
		return success;
	}
	
	public boolean automark(int random,int turn)
	{
		boolean success = false;
		
		switch(random)
		{
		case 1:
			int count = 1;
			for(int x=0;x<ROWS;x++)
			{
				for(int y=0;y<COLUMNS;y++)
				{
					if(spaces[x][y].getNumber() == 0)
					{
						spaces[x][y].setNumber(turn);
						success = true;
						space = count;

						x += ROWS;
						y += COLUMNS;
					}
					count++;
												
				}
				
			}
		break;
		
		case 2:
			
			for(int x=0;x<ROWS;x++)
			{
				for(int y=0;y<COLUMNS;y++)
				{
					if(spaces[y][x].getNumber() == 0)
					{
						spaces[y][x].setNumber(turn);
						success = true;
						x += ROWS;
						y += COLUMNS;
					}
												
				}
				
			}
			
		break;
		
		}
			
		
		return success;
	}
	


	@Override
	public String toString() {
		return "Table [spaces=" + Arrays.toString(spaces) + "]";
	}
	
	
	
}
