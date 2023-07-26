/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author USUARIO
 */
public class Class6 {
    public double num;
    
    public Class6() {
    }
    
    public double getNum() {
        return this.num;
    }
    
    public void setNum(double num) {
        this.num = num;
    }
    
    public void  Mostrar(){
       if (num > 200) {
           System.out.println("El numero "+num+" es mayor a 200 :D.");
       } else {
           System.out.println("El numero "+num+ " es menor a 200 :D.");
       }
     
    }
}