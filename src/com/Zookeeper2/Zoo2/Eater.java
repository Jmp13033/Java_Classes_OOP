package com.Zookeeper2.Zoo2;

public class Eater {
	 private int energyLevel = 300;

	    public Eater(){
	    }

	    public void setEnergy(int energyLevel){
	        this.energyLevel = energyLevel;
	    }

	    public int getEnergy(){
	        return energyLevel;
	    }

	    public int displayEnergy(){
	        System.out.println("The Bats's energy level is at: " + energyLevel);

	        return energyLevel;
	    }

}
