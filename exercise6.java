interface Movable {
    void moveUp();

    void moveDown();

    void moveLeft();

    void moveRight();
}

class Point implements Movable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUp() {
        y++;
    }

    public void moveDown() {
        y--;
    }

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Circle implements Movable {
    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }

    public String toString() {
        return "Circle[center=" + center + ", radius=" + radius + "]";
    }
}

public class exercise6 {
    public static void main(String[] args) {
        Point p = new Point(4, 5);
        System.out.println("Original point: " + p);

        p.moveUp();
        System.out.println("After moveUp: " + p);

        p.moveDown();
        System.out.println("After moveDown: " + p);

        p.moveLeft();
        System.out.println("After moveLeft: " + p);

        p.moveRight();
        System.out.println("After moveRight: " + p);

        System.out.println();

        Circle c = new Circle(new Point(13, 10), 3);
        System.out.println("Original circle: " + c);

        c.moveUp();
        System.out.println("After moveUp: " + c);

        c.moveLeft();
        System.out.println("After moveLeft: " + c);
    }
}