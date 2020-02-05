public class Robot {
    int x;
    int y;
    String direction;
    String position;

    public Robot() {
        x = 0;
        y = 0;
        direction = "up";
        position = "(" + x + ',' + y + ")";

    }

    public void getDirection() {
        System.out.println(direction);
    }

    public void getPosition() {
        System.out.println(position);
    }

    public void forward() {
        switch (direction) {
            case "up":
                y++;
                position = "(" + x + ',' + y + ")";
                System.out.println(position + "/" + direction);
                break;
            case "Left":
                x--;
                position = "(" + x + ',' + y + ")";
                System.out.println(position + "/" + direction);
                break;
            case "down":
                y--;
                position = "(" + x + ',' + y + ")";
                System.out.println(position + "/" + direction);
                break;
            case "Right":
                x++;
                position = "(" + x + ',' + y + ")";
                System.out.println(position + "/" + direction);
                break;

        }
    }

    public void rotateLeft() {
        if (direction.equals("up")) {
            direction = "Left";
        } else if (direction.equals("Left")) {
            direction = "down";
        }

    }

    public void rotateRight() {
        if (direction.equals("down")) {
            direction = "Left";
        } else if (direction.equals("Left")) {
            direction = "up";
        }

    }
}



