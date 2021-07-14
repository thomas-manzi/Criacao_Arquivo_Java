package com.company;

import java.util.ArrayList;

public class Lista {
    private String produto;
    private ArrayList<String> prod ;

    public Lista(){
        this.prod = new ArrayList<>();
    }

    public void addProduto(String p){
        prod.add(p);
    }

    public void addPosicao(String p,int n){
        prod.add(n,p);
    }
    public Boolean  consultaNome(String p){
        return prod.contains(p);
    }
    public String consultaPos(int n){
        return prod.get(n);
    }

    public void subProduto(int n, String p){
        prod.set(n,p);
    }
    public void rmvProduto(String p){
        prod.remove(p);
    }
    public void rmvPosicao(int n){
        prod.remove(n);
    }

    public ArrayList<String> getProd() {
        return prod;
    }

    @Override
    public String toString() {
        return "Lista{" +
                "prod=" + getProd() +
                '}';
    }
}
