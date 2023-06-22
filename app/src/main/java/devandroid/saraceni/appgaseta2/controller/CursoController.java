package devandroid.saraceni.appgaseta2.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.saraceni.appgaseta2.model.Curso;

public class CursoController {

    private List listCursos;

    public List getListCursos(){

        listCursos = new ArrayList<Curso>();

        listCursos.add(new Curso("Java"));
        listCursos.add(new Curso("php"));
        listCursos.add(new Curso("Python"));
        listCursos.add(new Curso("C++"));
        listCursos.add(new Curso("HTML5"));
        listCursos.add(new Curso("CSS3"));

        return listCursos;

    }

    public ArrayList<String> dadosParaSpinner(){

        ArrayList<String> dados = new ArrayList<>();

        for (int i = 0; i < getListCursos().size(); i++){

            Curso objeto = (Curso) getListCursos().get(i);
            objeto.getCursoDesejado();
            dados.add(objeto.getCursoDesejado());
        }


        return dados;
    }
}
