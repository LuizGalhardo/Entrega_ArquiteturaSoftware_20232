package PdObserver;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 *
 * @author Luiz Galhardo
 */


public class Main {
    
    
    public static void main(String[] args) {
        // Lendo o arquivo JSON externo
        String json = readExternalJSONFile("C:\\Users\\User\\Desktop\\Arquitetura_Software_2\\src\\data\\cidades.json");

        // Criando o objeto observavel
        CidadesSubject cidadesSubject = new CidadesSubject();

        // Criando os observadores
        Observer txtObserver = new TxtCidadesObserver();
        Observer htmlObserver = new HtmlCidadesObserver();

        // Registrando os observadores
        cidadesSubject.addObserver(txtObserver);
        cidadesSubject.addObserver(htmlObserver);

        // Carregando as cidades a partir do JSON
        cidadesSubject.loadCidadesFromJSON(json);
    }

    private static String readExternalJSONFile(String filePath) {
        try {
            File file = new File(filePath);
            byte[] bytes = Files.readAllBytes(file.toPath());
            return new String(bytes);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
