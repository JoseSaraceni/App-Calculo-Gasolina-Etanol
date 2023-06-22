package devandroid.saraceni.appgaseta2.apoio;

import kotlin.contracts.Returns;


public class UtilGasEta {

    public void metodoNaoEstatico(){}

    public static void metodoEstatico(){}

    public static String mensagem(){
        return "Qualquer mensagem...";
    }

    public static double preco(){
        return 9.99;
    }

    public static String calcularMelhorOpcao(double gasolina, double etanol){

        double precoIdeal = gasolina * 0.70;
        String mensagemRetorno;

        if (etanol <= precoIdeal){
            mensagemRetorno = "Abasteça com Etanol";
        }
        else {
            mensagemRetorno = "Abasteça com Gasolina";
        }

        return mensagemRetorno;
    }


}
