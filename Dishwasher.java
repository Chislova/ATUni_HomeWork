
public class Dishwasher {

    private static final int maxLoad = 3;
    private String[] content = new String[maxLoad];

    String status;
    int numberOfDishes;

    public Dishwasher() {
        status = "empty";

    }

    public void getStatus() {
        System.out.println(status);
    }

    public void start() {
        switch (status) {
            case "empty":
                System.out.println("Can't start; add some dishes first!");
                break;
            case "dirty":
                status = "in progress";
                break;
        }
    }

    public void stop() {
        if ("in progress".equals(status)) {
            status = "clean";
        } else {
            System.out.println("Start the cleaning program first!");
        }

    }

    public void empty() {
        status = "empty";
        numberOfDishes = 0;
        content = new String[maxLoad];

    }

    public void getContent() {
        if (status.equals("empty") && numberOfDishes == 0) {
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


    public void addDishes(String dish) {
        if (status.equals("in progress")) {
            System.out.println("Can't add dish during cycle!");
        } else if (status.equals("clean")) {
            System.out.println("You can't add dirty dishes to the clean ones!");
        } else if (numberOfDishes < content.length) {
            content[numberOfDishes] = dish;
            numberOfDishes++;
            status = "dirty";
        } else {
            System.out.println("Can't add dishes; max dishes count is reached!");
        }

    }


}


