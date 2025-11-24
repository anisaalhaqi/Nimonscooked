package java.model.Map;

import java.model.Chef.Chef;
import java.util.List;

public class Map {
    private static final int width = 14;
    private static final int height = 10;
    private final Tile[][] tiles;
    private final MapType mapConfig;

    public Map(MapType mapConfig, List <Chef> chef) {
        this.mapConfig = mapConfig;
        this.tiles = mapConfig.getTiles();

        // Chef
    }

    // bisa throw exception kalau x tidak di rentang 0 sampai (width-1) dan y tidak di rentang 0 sampai (height-1)
    public Tile getTile(int x, int y) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            return tiles[y][x]; 
        }
        return null;
    }

    public boolean isWalkable(int x, int y) {
        
    }
}