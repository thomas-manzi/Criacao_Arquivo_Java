package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        String produto ="";
        int posicao=0,cont=0;
        boolean t = true;
        Lista l = new Lista();
        String caminho = "C:\\Users\\tmsma\\OneDrive\\Área de Trabalho\\ifsp\\LP1\\Aula8_ThomasManzi\\src\\com\\company\\registro-log.txt";
        File arq = new File(caminho);
        LocalDateTime ld = LocalDateTime.now();
        ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        try {
            if (arq.createNewFile()) {
                System.out.println("arquivo cirado");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


        RegistroLog rl = new RegistroLog();
        while (t){
            System.out.println("1) Inserir produto, 2) Inserir produto em posição específica, 3) Consultar produto (pelo nome), 4) Consultar produto (pela posição), 5) Substituir produto, 6) Remover produto (pelo nome),7) Remover produto (pela posição) 8- mostrar td 0- sair");
            int n = 99;
            n = leia.nextInt();
            if (n == 1) {
                produto = leia.next();
                l.addProduto(produto);
                rl.escreveArq(caminho,ld,cont);
            }
            if (n == 2) {
                posicao =leia.nextInt();
                produto= leia.next();
                l.addPosicao(produto,posicao);
                rl.escreveArq(caminho,ld,posicao);
            }
            if (n == 3) {
                produto = leia.next();
                if (l.consultaNome(produto)){
                    System.out.println("produto existe");
                }else {
                    System.out.println("Produto n existe");
                }
            }
            if (n == 4) {
                posicao = leia.nextInt();
                System.out.println(l.consultaPos(posicao));
            }
            if (n == 5) {
                posicao= leia.nextInt();
                produto = leia.next();
                l.subProduto(posicao,produto);
            }
            if (n == 6) {
                produto =leia.next();
                l.rmvProduto(produto);
            }
            if (n == 7) {
                posicao = leia.nextInt();
                l.rmvPosicao(posicao);
            }
            if (n == 8) {
                System.out.println(l.getProd());
            }
            if (n == 0) {
                t= false;
            }
            cont++;
        }
    }
}
