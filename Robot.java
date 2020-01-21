import com.sun.org.apache.xpath.internal.objects.XObject;

public class Robot {
    int x;
    int y;
    String direction;
    Object position;

    public Robot(){
        x = 0;
        y = 0;
        direction = "up";
        position = "(" + this.x + ',' + this.y + ")";
    }

    public void getDirection() {
        System.out.println(this.direction);
    }

    public void getPosition(){
        System.out.println(this.position);
    }

    public void forward (){

        if (this.direction == "up"){
             this.y++;
            this.position = "(" + this.x + ',' + this.y + ")";
            System.out.println(this.position +"/" + this.direction);
        } else if( this.direction == "Left") {
            this.x--;
            this.position = "(" + this.x + ',' + this.y + ")";
            System.out.println(this.position +"/" + this.direction);
        } else if (this.direction == "down") {
            this.y--;
            this.position = "(" + this.x + ',' + this.y + ")";
            System.out.println(this.position +"/" + this.direction);

        }
    }

    public String rotateLeft(){
        if (this.direction == "up") {
                    this.direction = "Left";
        } else if (this.direction == "Left") {
            this.direction = "down";
        }
        return this.direction;
    }

    public String rotateRight (){
     if (this.direction == "down") {
         this.direction = "Left";
     } else if (this.direction == "Left") {
         this.direction = "up";
     }
     return this.direction;
    }
}

