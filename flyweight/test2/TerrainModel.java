package designpatterns.flyweight.test2;

public class TerrainModel {
	private TerrainType terrainType;

	public TerrainModel(TerrainType terrainType){
		this.terrainType = terrainType;
	}

	public int getMovementCost(){
		switch (terrainType){
			case DIRT: return 2;
			case ROAD: return 1;
			case MOUNTAIN:  return 3;
			case RIVER: return 5;
			default: return 2;
		}
	}

	public boolean isWater(){
		switch (terrainType){
			case DIRT: return false;
			case ROAD: return false;
			case MOUNTAIN:  return false;
			case RIVER: return true;
			default: return false;
		}
	}

	public TerrainType getTerrainType(){
		return this.getTerrainType();
	}

	public String printTerrain(){
		switch (terrainType){
			case DIRT: return "·";
			case ROAD: return "-";
			case MOUNTAIN:  return "^";
			case RIVER: return "=";
			default: return " ";
		}
	}

}
