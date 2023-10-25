package PdObserver;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Luiz Galhardo
 */

class HtmlCidadesObserver implements Observer {
    
    @Override
    public void update(List<String> cidades) {
        try {
            FileWriter fileWriter = new FileWriter("cidades.html");
            fileWriter.write("<html><body><ul>");
            for (String cidade : cidades) {
                fileWriter.write("<li>" + cidade + "</li>");
            }
            fileWriter.write("</ul></body></html>");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
