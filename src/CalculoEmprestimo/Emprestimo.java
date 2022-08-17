package CalculoEmprestimo;

public class Emprestimo {

    public static int getDuasParcelas() {
        return 2;
    }
    public static int getTresParcelas() {
        return 3;
    }

    public static int getQuatroParcelas() {
        return 4;
    }


    public static double getTaxaDuasParcelas() {
        return 0.3;
    }

    public static double getTaxaTresParcelas() {
        return 0.45;
    }

    public static double getTaxaQuatroParcelas() {
        return 0.55;
    }


    // Calcular valor final:

    public static void Calcular(double valor, int parcelas) {

        if (parcelas == 2) {
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
        }
        else if (parcelas == 3) {
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
        }
        else if (parcelas == 4) {
            double valorFinal = valor + (valor * getTaxaQuatroParcelas());
            System.out.println("Valor final do empréstimo para 4 parcelas: R$ " + valorFinal);
        }
        else {
            System.out.println("Quantidade de parcelas não aceita.");
        }

    }
}
