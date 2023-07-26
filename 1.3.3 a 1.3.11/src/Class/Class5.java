/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author USUARIO
 */
public class Class5 {
    public double num;
    
    public Class5(){
}
    
    public double getNum(){
        return this.num;
    }
    
    public void setNum(double num){
        this.num = num;
    }
    
    public void Mostrar(){
        if (num > 1) {
            System.out.println("El numero es positivo");
         } else if (num == 0){
            System.out.println("El numero es cero");   
         }else {
             System.out.println("El numero es negativo");
}
    
}
}
