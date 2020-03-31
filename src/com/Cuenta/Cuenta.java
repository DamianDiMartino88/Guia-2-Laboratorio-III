package com.Cuenta;

public class Cuenta {
    private int CantidadDeCuentas=0;
    private String NombreTitular;
    private int NumeroDeCuenta;
    private float Saldo;

    public Cuenta(){
        this.CantidadDeCuentas++;
        this.NombreTitular=" ";
        this.NumeroDeCuenta=this.CantidadDeCuentas;
        this.Saldo=0;
    }

    public Cuenta(String nombreTitular, float saldo){
        this.CantidadDeCuentas++;
        this.NombreTitular=nombreTitular;
        this.NumeroDeCuenta=this.CantidadDeCuentas;
        this.Saldo=saldo;
    }

    public void ingresarSaldo(float ingresoSaldo){
        this.Saldo=this.Saldo+ingresoSaldo;
        System.out.println("El Saldo Actual es de:$"+this.Saldo);
    }

    public void extraerSaldo(float extraccionSaldo){
        if((this.Saldo-extraccionSaldo)<0){
            System.out.println("La Operacion No puede Realizarse");
        }else {
            this.Saldo = this.Saldo - extraccionSaldo;
        }
        System.out.println("El Saldo Actual es de:$"+this.Saldo);
    }

    public String getNombreTitular() {
        return NombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        NombreTitular = nombreTitular;
    }

    public int getNumeroDeCuenta() {
        return NumeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        NumeroDeCuenta = numeroDeCuenta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(float saldo) {
        Saldo = saldo;
    }
}
