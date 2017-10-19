package bg.ballliner.logic.pojo;

public class FieldPosition {
    private final int _horizontal;
    private final int _vertical;
    
    public FieldPosition(int horizontal, int vertical) {
        _horizontal = horizontal;
        _vertical = vertical;
    }

    /**
     * @return the _horizontal
     */
    public int getHorizontal() {
        return _horizontal;
    }

    /**
     * @return the _vertical
     */
    public int getVertical() {
        return _vertical;
    }

    @Override
    public boolean equals(Object o) {
        boolean equality = false;
        
        if (o instanceof FieldPosition) {
            FieldPosition compared = (FieldPosition)o;
            boolean horizontalEquality = _horizontal == compared._horizontal;
            boolean verticalEquality = _vertical == compared._vertical;
            equality = horizontalEquality && verticalEquality;
        }
        
        return equality;
    }    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this._horizontal;
        hash = 41 * hash + this._vertical;
        return hash;
    }
    
}
