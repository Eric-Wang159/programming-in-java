package agh.ii.prinjava.lab04.lst04_01;

class BoxForObject {
    private Object x;

    public BoxForObject(Object x) {
        this.x = x;
    }

    public Object getX() {
        return x;
    }

    public void setX(Object x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "BoxForObject{" + "x=" + x + '}';
    }
}
