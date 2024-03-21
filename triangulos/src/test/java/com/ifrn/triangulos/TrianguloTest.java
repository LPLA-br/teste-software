package com.ifrn.triangulos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*import da classe testátura*/
import com.ifrn.triangulos.Triangulo;


/**
 * Teste de unidade
 * Métodos da classe Triangulo.
 */
public class TrianguloTest
{
    protected Triangulo t;

    public TrianguloTest()
    {
      this.t = new Triangulo( 10,10,10 );
    }

    /**
     * Testando a capacidade de
     * correta identificação de triângulos.
     */
    @Test
    public void triangulo()
    {
      // triângulos corretos
      assertEquals( true ,this.t.eTriangulo() );
      this.t.setLados( 10,10,10 );
      assertEquals( true ,this.t.eTriangulo() );
      this.t.setLados( 8,9,10 );
      assertEquals( true ,this.t.eTriangulo() );
      this.t.setLados( -8,-9,10 );
      assertEquals( true ,this.t.eTriangulo() );

      // não alcançe entre dois lados.
      this.t.setLados( 5,5,10 );
      assertEquals( false ,this.t.eTriangulo() );
      this.t.setLados( 5,5,11 );
      assertEquals( false ,this.t.eTriangulo() );
      this.t.setLados( 1,2,3 );
      assertEquals( false ,this.t.eTriangulo() );
      this.t.setLados( 2,5,10 );
      assertEquals( false ,this.t.eTriangulo() );

      // lado de dimensão nula
      this.t.setLados( 2,5,0 );
      assertEquals( false ,this.t.eTriangulo() );

      // comutatividade dos lados
      this.t.setLados( 1,2,4 );
      assertEquals( false ,this.t.eTriangulo() );
      this.t.setLados( 4,1,2 );
      assertEquals( false ,this.t.eTriangulo() );
      this.t.setLados( 2,4,1 );
      assertEquals( false ,this.t.eTriangulo() );
      this.t.setLados( 12, 15, 30 );
      assertEquals( false ,this.t.eTriangulo() );
      this.t.setLados( 30, 12, 15 );
      assertEquals( false ,this.t.eTriangulo() );
      this.t.setLados( 15, 30, 12 );
      assertEquals( false ,this.t.eTriangulo() );

      // lados nulos
      this.t.setLados( 0,0,0 );
      assertEquals( false ,this.t.eTriangulo() );

    }

    /**
     * Testando a capacidade
     * de distinguir o maior lado de
     * um verdadeiro triângulo.
     * */
    @Test
    public void maiorLado()
    {
      // lados iguais
      this.t.setLados( 10,10,10 );
      assertEquals( '*' , this.t.maiorLado() );

      // testando comutatividade
      this.t.setLados(10,9,8);
      assertEquals( 'a' , this.t.maiorLado() );
      this.t.setLados(8,10,9);
      assertEquals( 'b' , this.t.maiorLado() );
      this.t.setLados(9,8,10);
      assertEquals( 'c' , this.t.maiorLado() );
    }

    /**
     * Testando a capacidade de identificar
     * corretamente triângulos equiláteros.
     * */
    @Test
    public void equilatero()
   {
      // equiláteros certos
      this.t.setLados( 10,10,10 );
      assertEquals( true ,this.t.eEquilatero() );
      //mesmo que sejam negativos.
      this.t.setLados( 10,10,-10 );
      assertEquals( true ,this.t.eEquilatero() );

      // não equiláteros.
      this.t.setLados( 9,10,10 ); //isoceles
      assertEquals( false ,this.t.eEquilatero() );
      this.t.setLados( 9,10,8 ); //escaleno
      assertEquals( false ,this.t.eEquilatero() );
    }

    /**
     * Testando a capacidade de identificar
     * corretamente triângulos isoceles.
     * */
    @Test
    public void isoceles()
    {
      // isoceles correto e comutativo
      this.t.setLados( 9,10,10 );
      assertEquals( true ,this.t.eIsoceles() );
      this.t.setLados( 10,9,10 );
      assertEquals( true ,this.t.eIsoceles() );
      this.t.setLados( 10,10,9 );
      assertEquals( true ,this.t.eIsoceles() );
      
      // comutatividade de lados 2
      this.t.setLados( 2,2,4 );
      assertEquals( false ,this.t.eIsoceles() );
      this.t.setLados( 2,4,2 );
      assertEquals( false ,this.t.eIsoceles() );
      this.t.setLados( 4,2,2 );
      assertEquals( false ,this.t.eIsoceles() );
    }

    /**
     * Testando a capacidade de identificar
     * corretamente triângulos escalenos.
     * */
    @Test
    public void escaleno()
    {
      // comutatividade
      this.t.setLados( 1,2,3 );
      assertEquals( false ,this.t.eEscaleno() );
      this.t.setLados( 3,2,1 );
      assertEquals( false ,this.t.eEscaleno() );
      this.t.setLados( 2,3,1 );
      assertEquals( false ,this.t.eEscaleno() );

      // impossíveis
      this.t.setLados( 2,5,10 );
      assertEquals( false ,this.t.eEscaleno() );
    }
}
