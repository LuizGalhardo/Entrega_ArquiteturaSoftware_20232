
package PdChain;

/**
 *
 * @author Luiz Galhardo
 */

class XmlCidade extends Cidade {
    @Override
    public void escrever(String formato) {
        if (formato.equals("XML")) {
            System.out.println("Lista de cidades em formato XML:");
            for (String cidade : listaDeCidades) {
                System.out.println("<cidade>" + cidade + "</cidade>");
            }
        } else {
            super.escrever(formato);
        }
    }
}