public class Dishwasher_Main {

    public static void main(String[] args) {
	Dishwasher dishwasher = new Dishwasher();
    dishwasher.start();
    dishwasher.addDishes("plate");
    dishwasher.addDishes("fork");
    dishwasher.addDishes("spoon");
    dishwasher.addDishes("bowl");
    dishwasher.getContent();
    dishwasher.getStatus();
    dishwasher.start();
    dishwasher.getStatus();
    dishwasher.addDishes("bowl");
    dishwasher.stop();
    dishwasher.getStatus();
    dishwasher.addDishes("bowl");
    dishwasher.empty();
    dishwasher.getContent();
    dishwasher.addDishes("bowl");
    }
}
