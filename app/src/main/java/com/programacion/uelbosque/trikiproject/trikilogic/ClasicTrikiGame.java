package com.programacion.uelbosque.trikiproject.trikilogic;

public class ClasicTrikiGame extends TrikiGame{
		
	public ClasicTrikiGame(Player pPlayer, Player player2) {
		super(pPlayer);
		this.setPlayer2(player2);
	}
	
	@Override
	public int markSpaceAndVerify(int space) 
	{
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
	

}
