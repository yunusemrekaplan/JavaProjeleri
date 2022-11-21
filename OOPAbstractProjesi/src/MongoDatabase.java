public class MongoDatabase extends AbstractDatabase{
    @Override
    void update() {
        System.out.println("Mongo Güncelledi...");
    }

    @Override
    void get() {
        System.out.println("MySql Verileri Aldı...");
    }
}
