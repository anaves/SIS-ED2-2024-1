import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cliente {
    private String nome;
    private String cpf;
    private double saldo; 
  
    public Cliente(String cpf){
        //this.cpf = cpf;
        this.setCpf(cpf);
    }
    
    // metodos modificadores e de acesso
    // set -> modificador (parametros e nao retorna nada)
    // get -> acesso (nao tem parametro e retorna valor do atributo)
    private void setCpf(String cpf){       
        if (Util.validarCpf(cpf)){
            this.cpf = cpf;
        }else{
            System.out.println("CPF Invalido: " + cpf);
            String novoCPF = JOptionPane.showInputDialog("Digite novo CPF");
            this.setCpf(novoCPF);
        }
    }

    public String getCpf(){
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString(){
        return "CPF: " + getCpf() + "|Nome: " + getNome() + "|Saldo: R$" + getSaldo(); 
    }
    
    
}
