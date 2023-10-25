package PdObserver;

import org.json.JSONArray;
import org.json.JSONObject;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luiz Galhardo
 */


public class CidadesSubject {
    private List<Observer> observers = new ArrayList<>();
    private List<String> cidades = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void loadCidadesFromJSON(String json) {
        cidades.clear();
        JSONObject jsonObject = new JSONObject(json);
        JSONArray estadosArray = jsonObject.getJSONArray("estados");
        
        for (int i = 0; i < estadosArray.length(); i++) {
            JSONObject estado = estadosArray.getJSONObject(i);
            JSONArray cidadesArray = estado.getJSONArray("cidades");
            
             for (int j = 0; j < cidadesArray.length(); j++) {
                String cidade = cidadesArray.getString(j);
                System.out.println("Cidade: " + cidade);
                cidades.add(cidade);
            }            
        }
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(cidades);
        }
    }
}
