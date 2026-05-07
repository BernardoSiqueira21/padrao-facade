package com.example.facade;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Carlos");

        LojaFacade facade = new LojaFacade();

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println(facade.finalizarCompra());
    }
}