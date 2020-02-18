package br.com.controle;

public class Calculadora {
    private double valor1;
    private double valor2;
    
    public double getvalor1(){
        return valor1;
    }
    
    public double getvalor2(){
        return valor2;
    }
    
    public void setValor1(double valor1){
        this.valor1 = valor1;
    }
    
    public void setValor2(double valor2){
        this.valor2 = valor2;
    }
    
    public double Somar(){
        return this.valor1 + this.valor2;
    }
    
    public double Subtrair(){
        return this.valor1 - this.valor2;
    }
    
    public double Multiplicar(){
        return this.valor1 * this.valor2;
    }
    
    public double Dividir(){
        if(this.valor2 == 0){
        
            return 0;
            
        }else{ 
            return this.valor1 / this.valor2;
        }
    }
    
    public double Resto(){
        return this.valor2 % this.valor1;
    }
    
        
    
}
