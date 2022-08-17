package CalculoEmprestimo;

public class Main {

    public static void main(String[] args) {

        double valor;
        int parcelas;

        Emprestimo.Calcular( valor= 1000, Emprestimo.getDuasParcelas());
        Emprestimo.Calcular( valor= 1000, Emprestimo.getTresParcelas());
        Emprestimo.Calcular( valor= 1000, Emprestimo.getQuatroParcelas());
        Emprestimo.Calcular( valor= 1000, parcelas= 5);

    }

}
