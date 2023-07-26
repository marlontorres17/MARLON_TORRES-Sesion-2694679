/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author USUARIO
 */
public class Class10 {
    public int num;
    
    public Class10() {
    }
    
    public int getNum(){
        return this.num;
    }
    
    public void setNum (int num) {
        this.num = num;
    }
    
    public void Mostrar(){
        if (num > 200 && num < 300 && num %2 == 0) {
            System.out.println("El numero: "+num+ " esta en el intervalo de 200 a 300 y ademas es par :D");
        } else {
            System.out.println("El numero: "+num+ " no esta en el intervalo de 200 a 300 :D");
        }
    }
}
