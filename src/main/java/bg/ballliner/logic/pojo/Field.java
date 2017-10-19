package bg.ballliner.logic.pojo;

import java.util.Objects;

public class Field {
    private final FieldPosition _position;
    private final int _color;
    
    public Field(int positionHorizontal,
                 int positionVertical,
                 int color) {
        
        _position = new FieldPosition(positionHorizontal, positionVertical);
        _color = color;
    }

    @Override
    public boolean equals(Object o) {
        boolean equality = false;
        
        if (o instanceof Field) {
            Field compared = (Field)o;
            boolean positionEqulaity = _position.equals(compared._position);
            boolean colorEquality = _color == compared._color;
            equality = positionEqulaity && colorEquality;
        }
        
        return equality;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this._position);
        hash = 41 * hash + this._color;
        return hash;
    }
    
    
}
