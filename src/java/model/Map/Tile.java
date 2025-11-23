package java.model.Map;

public class Tile {
    private final int x;
    private final int y;
    private final boolean isWall;
    private final Station stationContained; // Objek station
    private Item itemContained;     // Item yang diletakkan chef di suatu tile, bisa jadi null

    public Tile(int x, int y, char symbol) {
        this.x = x;
        this.y = y;

        if(symbol == 'X') {
            this.isWall = true;
            this.stationContained = null;
        } else if(isStationSymbol(symbol)) { // harus ada pengecekan apakah simbol termasuk di simbol untuk station
            this.isWall = false;
            this.stationContained = createStationObject(symbol);    // jika ya, isi stationContained dengan objek Station tersebut
        } else {
            this.isWall = false;
            this.stationContained = null;
        }
    }

    public boolean isWall() {
        return isWall;
    }

    public Station getStation() {
        return stationContained;
    }

    public Item getItem() {
        return itemContained;
    }

    public void setItem(Item item) {
        itemContained = item;
    }

    public Item removeItem() {
        Item removedItem = this.itemContained;
        this.itemContained = null;
        return removedItem;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
