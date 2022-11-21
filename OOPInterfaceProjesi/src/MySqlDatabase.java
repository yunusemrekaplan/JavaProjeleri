public class MySqlDatabase implements IDatabase{
    @Override
    public void add() {
        System.out.println("MySql Ekleme");
    }

    @Override
    public void delete() {
        System.out.println("MySql Silme");
    }

    @Override
    public void get() {
        System.out.println("MySql Elde Etme");
    }

    @Override
    public void update() {
        System.out.println("MySql Güncelleme");
    }
}
