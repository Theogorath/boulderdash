package model;

public class Dirt extends Static {
	
	boolean dirtIsVisible;
	int xDirt;
	int yDirt;
	//add dirt sprite
	

	//when player position = dirt position, dirt remove
	public void dirtRemove(){
		
		if (xPlayer == xDirt){ //TO DO: recover playerPosition\
			
			if (yPlayer == yDirt){
				dirtIsVisible = false;
			}
			
			else {
				dirtIsVisible = true;
			}
			
		}
		
		else{
			dirtIsVisible = true;
		}
		
	}
	
	//TO DO: add the dirt sprite
	
}
