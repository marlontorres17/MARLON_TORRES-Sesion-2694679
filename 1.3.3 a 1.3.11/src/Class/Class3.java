/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author USUARIO
 */
public class Class3 {
    public double num;
    
    public Class3() {
    }
    
    public double getNum() {
        return this.num;
    }
    
    public void setNum(double num) {
        this.num = num;
    }
    
    public void  Mostrar(){
        this.setNum((this.getNum() *  this.getNum()));
       if (num > 5000) {
           System.out.println("El cuadrado del  numero: "+num+" es mayor a 5000 :D.");
       } else {
           System.out.println("El cuadrado del numero: "+num+" es menor a 5000 :D.");
       }
     
    }
}
