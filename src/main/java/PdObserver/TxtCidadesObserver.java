package PdObserver;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Luiz Galhardo
 */
public class  TxtCidadesObserver implements Observer {
    
    @Override
    public void update(List<String> cidades) {
        try {
            FileWriter fileWriter = new FileWriter("cidades.txt");
            for (String cidade : cidades) {
                fileWriter.write(cidade + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}