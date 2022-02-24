/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keliling.balok;

/**
 *
 * @author ASUS
 */
public class Balok implements Operasi{
  double p,l,t;
    @Override
    public double Keliling() {
        return 4*(p+l+t);
    } //rumus keliling balok
}
