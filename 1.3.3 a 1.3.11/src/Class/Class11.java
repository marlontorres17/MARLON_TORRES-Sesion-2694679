/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author USUARIO
 */
public class Class11 {
    public double num;
    public double num2;
    
    public Class11(){
    }
    
    public double getNum() {
        return this.num;
    }
    
    public void setNum(double num) {
        this.num = num;
    }
    
    public double getNum2() {
        return this.num2;
    }
    
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public void Mostrar(){
        if (num > num2) {
            System.out.println("El numero: "+num+ " es mayor a: "+num2+" :D");
        } else {
            System.out.println("El numero: "+num2+ " es mayor a: "+num+" :D");
        }
    }
    
}
