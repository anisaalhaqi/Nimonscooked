package java.model.Map;

public class PizzaMap extends MapType {
    private static final String[] PIZZA_LAYOUT = {
        "XATACAAACAAAXX",
        "X...........XX",
        "X.....A.V...SX",
        "X...........SX",
        "XWWAIAIAIAIAPX",
        "X............X",
        "XXXX..A...XXXX",
        "XR...V......RX",
        "XXXX......XXXX",
        "XXXXAAIAAAXXXX",
    };

    @Override
    protected String[] getLayoutData() {
        return PIZZA_LAYOUT;
    }

    @Override
    protected String getMapName() {
        return "Pizza Map";
    }

    @Override
    protected void initialLayout() {
        for(int i = 1; i <= getHeight(); i++) {
            for(int j = 1; j <= getWidth(); j++) {
                tiles[i][j].setSymbol(PIZZA_LAYOUT[j-1]);
                tiles[i][j].setState(PIZZA_LAYOUT[j-1]);
            }
        }
    }
}
