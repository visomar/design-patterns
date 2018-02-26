package designpatterns.flyweight.test2;

public class Terrain {

	//extrinsic data 
	private int x;
	private int y;
	//intrinsic data
	private TerrainModel terrainModel;

	public Terrain(int x, int y, TerrainModel terrainModel){
		//X and Y are redundant, since this info will be on its actual position inside the matrix
		this.x = x;
		this.y = y;
		this.terrainModel = terrainModel;
	}

	public int getMovementCost(){
		return this.terrainModel.getMovementCost();
	}

	public boolean isWater(){
		return this.terrainModel.isWater();
	}

	public TerrainModel TerrainModel(){
		return this.terrainModel;
	}

	public String printTerrain(){
		return this.terrainModel.printTerrain();
	}
}
