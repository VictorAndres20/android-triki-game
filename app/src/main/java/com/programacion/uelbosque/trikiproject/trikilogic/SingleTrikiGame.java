package com.programacion.uelbosque.trikiproject.trikilogic;

public class SingleTrikiGame extends TrikiGame{	



	public SingleTrikiGame(Player pPlayer) {
		super(pPlayer);


		
	}

	@Override
	public int markSpaceAndVerify(int space) {
		int win = 0;
		
		if(this.isGameOn())
		{
			boolean mark = this.getTable().mark(space, this.getTurn().getTurn());
			if(mark == true )
			{
				this.getTurn().change();
				win = this.verify();
			}
			
		}
		
		return win;
	}
	
	public int autoMark()
	{
		int win = 0;
		
		if(this.isGameOn())
		{
			int random = (int)(Math.random()*10);
			int type = 0;
			if(random < 5)
			{
				type = 1;
			}
			else
			{
				type = 1;
			}
			
			boolean mark = this.getTable().automark(type,this.getTurn().getTurn());
			if(mark)
			{
				win = this.verify();
			}
		}
		
		return win;
		
	}
	
	

	
}
