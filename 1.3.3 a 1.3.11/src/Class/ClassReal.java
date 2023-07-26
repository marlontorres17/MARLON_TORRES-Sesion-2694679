/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author USUARIO
 */
public class ClassReal {
    private double num;
    
    public ClassReal() {
}
     public double getNum(){
        return this.num;
    }
    
    public void setNum(double num) {
        this.num = num;
    }
    
    public void  Mostrar(){
       if (num > 5) {
           System.out.println("El numero es mayor a 5 :D.");
       } else {
           System.out.println("El numero es menor a 5 :D.");
       }
     
    }
}
    
