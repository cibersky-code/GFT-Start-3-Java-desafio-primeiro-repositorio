package com.dio.gftstart;

public class Main {

    public static void main(String[] args) {
        // Calcular 4 operações
        System.out.println("calculadora");
        Calculadora.soma(1.5, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Enviar mensagem
        System.out.println("mensagem");
        Mensagem.obterMensagem(6);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(20);

        // Empréstimo + taxas
        System.out.println("empréstimo");
        Emprestimo.calcular(1100, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1050, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1080, 4);
    }
}
