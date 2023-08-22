package main;

import java.util.Random;

public class Calculos {
    private int nivel;
    private int valor1;
    private int valor2;
    private int operacao;
    private int result;

    public Calculos(int nivel) {
        Random random = new Random();
        this.operacao = random.nextInt(3);
        this.nivel = nivel;

        //nivel easy
        if (nivel == 1){
            this.valor1 = random.nextInt(10);
            this.valor2 = random.nextInt(50);
        }else {
            this.valor1 = random.nextInt(100);
            this.valor2 = random.nextInt(150);
        }
    }

    public int getNivel() {
        return nivel;
    }

    public int getValor1() {
        return valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public int getOperacao() {
        return operacao;
    }

    public int getResult() {
        return result;
    }

    public String toString(){
        String opcao;
        if (this.getOperacao() == 0){
            opcao = " Somar ";
        } else if(this.getOperacao() == 1){
            opcao = " Subtrair ";
        } else if (this.getOperacao() == 2){
            opcao = " Multiplicar ";
        } else {
            opcao = " Opção Inválida ";
        }
        return "Valor 1: " + this.getValor1()
                + "\nValor 2: " + this.getValor2()
                + "\nOperação: " + opcao
                + "\nDificuldade: " + this.getNivel();
    }
    public boolean somar(int valor) {
        this.result = this.getValor1() + this.getValor2();
        boolean acerto = false;

        if (valor == this.getResult()) {
            System.out.println(" Resposta correta!");
            acerto = true;
        } else {
            System.out.println(" Estude mais! ");
        }
        System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResult());
        return acerto;

    }

    public boolean subtrair(int valor){
        this.result = this.getValor1() - this.getValor2();
        boolean acerto = false;

        if (valor == this.getResult()) {
            System.out.println(" Resposta correta! ");
            acerto = true;
        } else {
            System.out.println(" Estude mais! ");
        }
        System.out.println(this.getValor1() + " - " + this.getValor2() + " = " + this.getResult());
        return acerto;
    }
    public boolean multiplicar(int valor){
        this.result = this.getValor1() * this.getValor2();
        boolean acerto = false;

        if (valor == this.getResult()) {
            System.out.println(" Resposta correta! ");
            acerto = true;
        } else {
            System.out.println(" Estude mais!");
        }
        System.out.println(this.getValor1() + " x " + this.getValor2() + " = " + this.getResult());
        return acerto;
    }
}
