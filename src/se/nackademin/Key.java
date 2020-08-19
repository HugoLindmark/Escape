package se.nackademin;

public class Key {

    private Position position;
    private boolean visible;

    public Key(Position position) {
        this.position = position;
        this.visible = true;
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
