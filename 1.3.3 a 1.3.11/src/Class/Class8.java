/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author USUARIO
 */
public class Class8 {
    public double num;
    
    public Class8() {
    }
    
    public double getNum(){
        return this.num;
    }
    
    public void setNum(double num){
        this.num = num;
    }
    
    public void Mostrar(){
        if (num %2 == 0) {
            System.out.println("El numero: "+num+ " es par");
        } else {
            System.out.println("El numero: "+num+ " es impar");
        }
    }
}
