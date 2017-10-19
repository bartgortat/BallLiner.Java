package bg.ballliner.logic.pojo;

public class BoardDimension {
    private final int _height;
    private final int _width;
    
    public BoardDimension(int height, int width)
    {
        _height = height;
        _width = width;
    }

    /**
     * @return the board height
     */
    public int getHeight() {
        return _height;
    }

    /**
     * @return the board width
     */
    public int getWidth() {
        return _width;
    }

    @Override
    public boolean equals(Object o) {
        boolean equality = false;
        
        if (o instanceof BoardDimension) {
            BoardDimension compared = (BoardDimension)o;
            boolean heightEquality = _height == compared._height;
            boolean widthEquality = _width == compared._width;
            equality = heightEquality && widthEquality;
        }
        
        return equality;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + _height;
        hash = 37 * hash + _width;
        return hash;
    }
    
}
