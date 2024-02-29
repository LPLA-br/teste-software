package com.ifrn.triangulos;

import com.ifrn.triangulos.Triangulo;

/**
 * Software dos triangulos
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "TRIÂNGULOS" );

        Triangulo ax = new Triangulo( 10,10,10 );
        Triangulo aa = new Triangulo( 20, 5, 5 );
        Triangulo ab = new Triangulo( 10, 11, 12 );
        Triangulo ba = new Triangulo( 10, 10, 5 );
        Triangulo bb = new Triangulo( 10, 10, 10 );
        Triangulo ca = new Triangulo( 10, 10,10 );
        Triangulo cc = new Triangulo( 10, 11, 12 );

        ax.verificarTipo( "equilatero" );
        aa.verificarTipo( "equilatero" );
        ab.verificarTipo( "equilatero" );
        ba.verificarTipo( "isoceles" );
        bb.verificarTipo( "isoceles" );
        ca.verificarTipo( "escaleno" );
        cc.verificarTipo( "escaleno" );
    }
}
/*ESTA PORRA NÃO É UM Triangulo
É equilátero
Não é equilátero
Não é equilátero
Não é escaleno
Não é escaleno
Não é isoceles
Não é isoceles*/
