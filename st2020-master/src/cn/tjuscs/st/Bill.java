package cn.tjuscs.st;

public class Bill {
	public boolean cash(int x){
		if(x >= 50) 
			x -= 50;
		if(x >= 20) 
			x -= 20;
		if(x >= 10) 
			x -= 10;
		if(x >= 5) 
			x -= 5;
		if(x >= 5) 
			x -= 5;
		if(x >= 1) 
			x -= 1;
		if(x >= 1) 
			x -= 1;
		if(x >= 1) 
			x -= 1;
		if(x == 0) 
			return true;
		else 
			return false;
	}
}
