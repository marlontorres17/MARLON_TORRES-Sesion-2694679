/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author USUARIO
 */
public class Class9 {
    public int num;
    
    public Class9(){
    }
    
    public int getNum(){
        return this.num;
    }
    
    public void setNum(int num){
        this.num = num;
    }
    
    public void Mostrar(){
        if (num %2 == 0 && num > 0) {
            System.out.println("El numero: "+num+ " es par y positivo :D");
        } else {
            System.out.println("El numero: "+num+ " es impar y negativo :D");
        }
    }
}
    
