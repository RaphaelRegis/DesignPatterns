public class Repositorio {

    private static volatile Repositorio instancia;

    private String urlBanco;
    private String senhaBanco;

    private Repositorio(String urlBanco, String senhaBanco) {
        this.urlBanco = urlBanco;
        this.senhaBanco = senhaBanco;
    }

    public void persistirDados() {
        System.out.println("Persistindo dados no banco.\nUrl: " + urlBanco + "\nSenha: " + senhaBanco);
    }

    public static Repositorio getInstance(String urlBanco, String senhaBanco) {
        Repositorio repositorioSingleton = instancia;
        
        if (repositorioSingleton == null) {
            
            synchronized (Repositorio.class) {
                if (instancia == null) {
                    instancia = new Repositorio(urlBanco, senhaBanco);
                    repositorioSingleton = instancia;
                }
            }
        }

        return repositorioSingleton;
    }

}
