package model;

public class Dirt extends Static {
	
	char dirtPosition;
	boolean dirtIsVisible;
	

	//when player position = dirt position, dirt remove
	public void dirtRemove(){
		
		if (playerPosition = dirtPosition){ //TO DO: recover playerPosition
			dirtIsVisible = false;
		}
		
		else{
			dirtIsVisible = true;
		}
		
	}
	
	//TO DO: add the dirt sprite
	
}
