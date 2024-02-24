/**
 * Dragon13
 */
public class Dragon13 {
        private int x;
        private int y;
        private int width;
        private int height;
    
        public Dragon13 (int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
    
        public void moveLeft() {
            x--;
            if (x < 0 || x >= width) {
                detectCollision();
            }
        }
    
        public void moveRight() {
            x++;
            if (x < 0 || x >= width) {
                detectCollision();
            }
        }
    
        public void moveUp() {
            y--;
            if (y < 0 || y >= height) {
                detectCollision();
            }
        }
    
        public void moveDown() {
            y++;
            if (y < 0 || y >= height) {
                detectCollision();
            }
        }
    
        public void detectCollision() {
            System.out.println("Game Over");
        }
    
        public void printPosition() {
            System.out.println("Dragon position: (" + x + ", " + y + ")");
        }
    
        public static void main(String[] args) {
            Dragon13 dragon = new Dragon13(3, 3, 10, 10); // Example instantiation
            dragon.moveLeft();
            dragon.printPosition();
            dragon.moveUp();
            dragon.printPosition();
            dragon.moveRight();
            dragon.printPosition();
            dragon.moveDown();
            dragon.printPosition();
            dragon.moveDown(); // This move should trigger a collision
        }
}