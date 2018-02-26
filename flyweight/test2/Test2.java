package designpatterns.flyweight.test2;

import java.util.Random;

public class Test2 {
	private static final int WIDTH = 64;
	private static final int HEIGHT = 64;

	private final TerrainModel mountain;
	private final TerrainModel river;
	private final TerrainModel dirt;

	public Test2(){
		//Despite the large amount of tiles, we only use these 3 types of terrain
		this.mountain = new TerrainModel( TerrainType.MOUNTAIN );
		this.river = new TerrainModel( TerrainType.RIVER );
		this.dirt = new TerrainModel( TerrainType.DIRT );
	}

	public Terrain[][] worldGeneration(){
		Terrain[][] tiles = new Terrain[WIDTH][HEIGHT];

		//World generation
		for(int i = 0; i < WIDTH; i++){
			for(int j = 0; j < HEIGHT; j++){
				if(Math.random() <= 0.1){
					tiles[i][j] = new Terrain(i, j, mountain);
				}
				else{
					tiles[i][j] = new Terrain(i, j, dirt);
				}
			}
		}

		int x = new Random().nextInt(WIDTH);
		for(int i = 0; i < HEIGHT; i++){
			tiles[x][i] = new Terrain(x, i, river);
		}

		return tiles;
	}

	public static void main(String[] args) {
		Terrain[][] world = new Test2().worldGeneration();

		Test2.printMap( world );
	}

	public static void printMap(Terrain[][] world){
		for(int i = 0; i < WIDTH; i++){
			for(int j = 0; j < HEIGHT; j++){
				System.out.print( world[i][j].printTerrain() );
			}
			System.out.println();
		}
	}
}
