package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class RegistroLog {
    private File log;


    public void escreveArq(String b, LocalDateTime ld,int n) throws IOException {
        FileWriter fw = new FileWriter(b,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(ld+"]"+"O usuário solicitou a inserção de produto em posição específica "+n+"\n");
        bw.close();
    }
}
