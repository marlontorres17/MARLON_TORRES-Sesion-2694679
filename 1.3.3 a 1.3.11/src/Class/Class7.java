/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author USUARIO
 */
public class Class7 {
    public double num;
    
    public Class7() {
    }
    
    public double getNum() {
        return this.num;
    }
    
    public void setNum(double num) {
        this.num = num;
    }
    
    public void  Mostrar(){
       if (num >50 && num <100) {
           System.out.println("El numero: "+num+ " esta en el rango de  50 y 100 :D.");
       } else {
           System.out.println("El numero: "+num+" no esta en el rango de 50 y 100 :D.");
       }
     
    }
}
