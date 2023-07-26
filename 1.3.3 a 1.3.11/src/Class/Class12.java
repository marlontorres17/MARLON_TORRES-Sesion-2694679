/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author USUARIO
 */
public class Class12 {
    public double num;
    
    public Class12(){
    }
    
    public double getNum(){
        return this.num;
    }
    
    public void setNum(double num){
        this.num = num;
    }
    
    public void Mostrar(){
        if (num %2 == 0){
            System.out.println("el numero: "+num+" es par :D");
        } else {
            System.out.println("el numero: "+num+" es impar :D");
        }
    }
}
