package model;

public class Wall extends Static {
	
	int xWall;
	int yWall;
	//add wall sprite
	
	public void wallBlock(){
	//a character can't go on the same case that a wall
		
		if(xCharacter=xWall-1){
			//moveRight not allowed
		}
		
		else if (xCharacter=xWall+1){
			//moveLeft not allowed
		}
		
		else if (yCharacter=ywall-1){
			//moveUp not allowed
		}
		
		else if (yCharacter=ywall+1){
			//moveDown not allowed
		}
		
		else{
			//do nothing
		}
	}

}
