public class MySqlDatabase extends AbstractDatabase{
    @Override
    void update() {
        System.out.println("MySql Güncelledi...");
    }

    @Override
    void get() {
        System.out.println("MySql Verileri Aldı...");
    }
}
