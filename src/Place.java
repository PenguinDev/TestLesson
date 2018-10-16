public class Place {

    private Coordinate coordinate;
    private String title;

    public int getX() {
        return
        coordinate.getX();
    }

    public int getY() {
        return
        coordinate.getY();
    }

    public void setX(int x) {
        coordinate.setX(89);
    }

    public void setY(int y) {
        coordinate.setY(1);
    }

    public String getTitle() {
        return title;
    }

    public Place(String title, Coordinate coordinate) {
        this.coordinate = coordinate;
        this.title = title;
    }

    Place(String title){
        this(title,-1,-1);
    }
    Place(String title, int x, int y){
        this.title = title;
        this.coordinate = new Coordinate(x,y);


    }


    @Override
    public String toString() {
        return title + coordinate.toString();
    }
    class Coordinate{
        private int x,y;


        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + getX() + ";" + getY() + ")";
        }

    }
}
