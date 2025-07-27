public class App {
    public static void main(String[] args) throws Exception {
        Repositorio repositorio = Repositorio.getInstance("MySQL/url", "1234");

        repositorio.persistirDados();
    }
}
