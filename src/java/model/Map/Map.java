package java.model.Map;

import java.model.Chef.Chef;
import java.util.List;

public class Map {
    private static final int width = 14;
    private static final int height = 10;
    private final Tile[][] tiles;
    private final MapType mapConfig;
    private final String[][] initialLayout = {}

    public Map(MapType mapConfig, List <Chef> chef) {
        this.mapConfig = mapConfig;
        this.tiles = mapConfig.getTiles();

        // Chef
    }

    // bisa throw exception kalau x tidak di rentang 1-width dan y tidak di rentang 1-height
    public Tile getTile(int x, int y) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            return tiles[y][x]; 
        }
        return null;
    }

    public boolean isWalkable(int x, int y) {
        
    }
}