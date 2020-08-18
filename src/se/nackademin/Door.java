package se.nackademin;

public class Door {

    private Position position;
    private boolean visible;

    public Door(Position position) {
        this.position = position;
        this.visible = false;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
