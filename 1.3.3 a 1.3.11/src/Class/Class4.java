/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author USUARIO
 */
public class Class4 {
    public double num;
    
    public Class4(){ 
    }
    
    public double getNum(){
       return this.num;
    }
    
    public void setNum(double num){
        this.num = num;
    }
    
    public void  Mostrar(){
        this.setNum(Math.abs(this.getNum()));
        System.out.println("El valor absoluto del numero es: "+num);
}
}

