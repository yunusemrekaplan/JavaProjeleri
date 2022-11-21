public class Main {
    public static void main(String[] args) {
        AbstractDatabase abstractDatabase1 = new MySqlDatabase();
        AbstractDatabase abstractDatabase2 = new MongoDatabase();

        abstractDatabase1.update();
        abstractDatabase2.update();
    }
}