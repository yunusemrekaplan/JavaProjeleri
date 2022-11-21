public class MongoDatabase implements IDatabase{
    @Override
    public void add() {
        System.out.println("MongoDB Ekleme");
    }

    @Override
    public void delete() {
        System.out.println("MongoDB Silme");
    }

    @Override
    public void get() {
        System.out.println("MongoDB Elde Etme");
    }

    @Override
    public void update() {
        System.out.println("MongoDB Güncelleme");
    }
}
