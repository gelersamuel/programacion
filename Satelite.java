/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Satelite {
     private double meridiano;
    private double paralelo;
    private double distanciaTerra;

    public Satelite(){

    }

    public Satelite(double meridiano, double paralelo, double distanciaTerra) {
        this.meridiano = meridiano;
        this.paralelo = paralelo;
        this.distanciaTerra = distanciaTerra;
    }

    public void verPosicion(){
        System.out.println("O satelite atopase no paralelo" + paralelo + " meridiano" + meridiano + "A unha distancia da terra" + distanciaTerra);
    }
}
