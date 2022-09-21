package stomas.andres;

import java.util.Arrays;

public class Nacional extends Cedula{
    public String getRut(){
        return super.getRun();
    }
    public void setRut(String run){
        if(validRun(run)){
            System.out.println("run valido "+ run);
            super.setRun(run);
        }
    }
    public boolean validRun(String run){
        if(run.length() < 9){
            System.out.println("El run tiene el formato incorrecto (12.345.678-0)");
            return false;
        }
        if(run.contains(".")){
            run.replace(".", "");
        }
        String rut = run.split("-")[0];
        String dv = run.split("-")[1];
        int[] numeros = {2, 3, 4, 5, 6, 7};
        int[] validadores = new int[rut.length()];
        int j = 0;
        for(int i = 0; i < validadores.length; i++){
            if(j==numeros.length) j = 0;
            validadores[i] = numeros[j];
            j++;
            //System.out.print(validadores[i] + ", ");
        }
        //System.out.println("");
        String reversed = "";
        for(int i = rut.length()-1; i >= 0; i--){
            reversed += rut.charAt(i);
        }
        //System.out.println(reversed);
        int suma = 0;
        for(int i = 0; i < rut.length(); i++){
            suma += validadores[i] * Integer.parseInt(String.valueOf(reversed.charAt(i)));
        }
        //System.out.println(suma);
        double A = suma / 11;
        //System.out.println(A);
        int B = ((int) A) * 11;
        //System.out.println(B);
        int C = Math.abs(suma - B);
        //System.out.println(C);
        int DV = 11 - C;
        String fdv = "";
        if(DV == 10){
            fdv = "k";
        }else if (DV == 11){
            fdv = String.valueOf(0);
        }else{
            fdv = String.valueOf(DV);
        }
        //System.out.println("DV calculado: " + finalDV);
        //System.out.println(dv);
        if( fdv.contentEquals(dv.toLowerCase()) ) return true;
        return false;
    }
}
