package com.company;

public class Main {

    public static void main(String[] args) {

        String romano = "MMMCDLI"; // 3463
        int acumula = gimmeNumber(romano.charAt(0), false);

        /*
        *
        * La mayor cantidad de pares seguidos que podemos tener es 3 :'D
        * No se pueden repetir impares
        * Al tener minimo dos pares encadenados, ya no puedes meter medios
        *
        * */


        for(int i = 1, j = acumula; i < romano.length(); i++){
            int focused = gimmeNumber(romano.charAt(i), false);
            if(focused <= j){
                acumula+=focused;
            }else if(focused > j){
                acumula+=gimmeNumber(romano.charAt(i),true);
            }
            j = focused;
        }

        System.out.println(acumula);

    }

    public static int gimmeNumber(char Indentifier, boolean process){
        int response = 0;
        switch (Indentifier){
            case 'M':{
                response = (process)?800:1000;//CM
                break;
            }
            case 'D':{
                response = (process)?300:500;//CD
                break;
            }
            case 'C':{
                response = (process)?80:100;//XC
                break;
            }
            case 'L':{
                response = (process)?30:50;//XL
                break;
            }
            case 'X':{
                response = (process)?8:10;//IX
                break;
            }
            case 'V':{
                response = (process)?3:5;//IV
                break;
            }
            case 'I':{
                response = 1;
                break;
            }
        }
        return response;
    }
}
