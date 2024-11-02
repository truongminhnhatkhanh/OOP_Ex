package chuong3.bai7;
public class Maini {
    public static void main(String[] args) {
        // Create a Ball object at position (5.0, 3.0, 1.0)
        Ball ball = new Ball(5.0f, 3.0f, 1.0f);
        System.out.println("Initial ball position: " + ball.toString());

        // Create a Player object with number 10 at position (2.0, 3.0)
        Player player = new Player(10, 2.0f, 3.0f);

        // Move the player by (3.0, 2.0)
        player.move(3.0f, 2.0f);

        // Make the player jump by 2.5 on the z-axis
        player.jump(2.5f);

        // Check if the player is near the ball
        boolean isNear = player.near(ball);
        System.out.println("Is player near the ball? " + isNear);

        // Kick the ball (if near)
        if (isNear) {
            player.kick(ball);
            System.out.println("Ball position after kick: " + ball.toString());
        } else {
            System.out.println("Player is not close enough to kick the ball.");
        }
    }
}
