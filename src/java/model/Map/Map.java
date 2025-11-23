package java.model.Map;

public class Map {
    private static final int width = 14;
    private static final int height = 10;
    private final Tile[][] tiles = new Tile[height][width];
    private final String[][] initialLayout = {}

    public final void Map(String[][] initialLayout, List <Chef> chef) {
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                Tile addTile = new Tile(i, j, "Station");
            }
        }
    }

    public Tile getTiles(int x, int y) {
        return tiles[x][y];
    }

    public boolean isWalkable(int x, int y) {

    }
}