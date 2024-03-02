package com.ifrn.triangulos;

import com.ifrn.triangulos.Triangulo;
import java.util.Scanner;

/**
 * Software dos triangulos
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "TRIÂNGULOS" );
        Scanner sc = new Scanner( System.in );

        while( true )
        {
          Triangulo a = new Triangulo( sc.nextInt(), sc.nextInt(), sc.nextInt() );
          System.out.printf("triangulo=%b\n", a.eTriangulo() );
          System.out.printf("equilatero=%b\n", a.eEquilatero() );
          System.out.printf("isoceles=%b\n", a.eIsoceles() );
          System.out.printf("escaleno=%b\n", a.eEscaleno() );
        }
    }
}

