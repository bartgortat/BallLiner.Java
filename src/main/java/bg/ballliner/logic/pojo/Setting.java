package bg.ballliner.logic.pojo;

import java.util.Objects;

public class Setting {
    private final BoardDimension _boardDimension;
    private final int _colorCount;
    private final int _newBallCount;
    
    public Setting(int boardHeight,
                    int boardWidth,
                    int colorCount,
                    int newBallCount) {
        _boardDimension = new BoardDimension(boardHeight, boardWidth);
        _colorCount = colorCount;
        _newBallCount = newBallCount;
    }

    /**
     * @return the board dimension
     */
    public BoardDimension getBoardDimension() {
        return _boardDimension;
    }

    /**
     * @return the color count
     */
    public int getColorCount() {
        return _colorCount;
    }

    /**
     * @return the new ball count
     */
    public int getNewBallCount() {
        return _newBallCount;
    }

    @Override
    public boolean equals(Object o) {
        boolean equality = false;
        
        if (o instanceof Setting) {
            Setting compared = (Setting)o;
            boolean boardDimensionEquality = _boardDimension.equals(compared._boardDimension);
            boolean colorCountEquality = _colorCount == compared._colorCount;
            boolean newBallCountEquality = _newBallCount == compared._newBallCount;
            equality = boardDimensionEquality
                    && colorCountEquality
                    && newBallCountEquality;
        }
        
        return equality;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this._boardDimension);
        hash = 17 * hash + this._colorCount;
        hash = 17 * hash + this._newBallCount;
        return hash;
    }
}
