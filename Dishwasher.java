
public class Dishwasher {

    public static final int maxLoad = 3;
    public String[] content = new String[maxLoad];

    String status;
    int numberOfDishes;

    public Dishwasher() {
        this.status = "empty";

    }

    public void getStatus (){
        System.out.println(this.status);
    }

    public void start() {
        if (this.status == "empty") {
            System.out.println("Can't start; add some dishes first!");
        } else if (this.status == "dirty") {
            this.status = "in progress"; }
        }

    public void stop(){
        if (this.status == "in progress"){
            this.status = "clean";
        } else {
            System.out.println("Start the cleaning program first!");
            }

    }
    public void empty() {
    this.status = "empty";
    this.numberOfDishes = 0;
    this.content = new String[maxLoad];

    }

    public void getContent() {
        if ( this.status =="empty" && this.numberOfDishes == 0) {
            System.out.println("[ ]");
        } else {
            for (int i = 0; i < content.length; i++) {
                String message = content[i] + " ";

                if (i == (content.length - 1)) {
                    System.out.println(message);
                } else {
                    System.out.print(message + ", ");
                }
            }
        }
       }


    public void addDishes(String dish){
        if (this.status == "in progress"){
            System.out.println("Can't add dish during cycle!");
        } else if (this.status == "clean") {
            System.out.println("You can't add dirty dishes to the clean ones!");
        } else if (numberOfDishes < content.length){
           content[numberOfDishes] = dish;
           numberOfDishes++;
           this.status = "dirty";
           } else {
           System.out.println("Can't add dishes; max dishes count is reached!");
       }

               }


}

