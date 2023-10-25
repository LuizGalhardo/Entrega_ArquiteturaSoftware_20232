package PdChain;

/**
 *
 * @author Luiz Galhardo
 */

class HtmlCidade extends Cidade {
    @Override
    public void escrever(String formato) {
        if (formato.equals("HTML")) {
            System.out.println("Lista de cidades em formato HTML:");
            StringBuilder htmlData = new StringBuilder("<ul>");
            for (String cidade : listaDeCidades) {
                htmlData.append("<li>").append(cidade).append("</li>");
            }
            htmlData.append("</ul>");
            System.out.println(htmlData.toString());
        } else {
            super.escrever(formato);
        }
    }
}