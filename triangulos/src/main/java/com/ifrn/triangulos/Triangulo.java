package com.ifrn.triangulos;

/**
 * Verifica Triangulo de acordo com
 * suas propriedades. 
 * */
public class Triangulo
{
  int la;
  int lb;
  int lc;

  Triangulo( int a, int b, int c )
  {
    this.la = a;
    this.lb = b;
    this.lc = c;
    if ( this.eTriangulo() == false )
      System.out.println( "ESTA PORRA NÃO É UM Triangulo" );
  }

  /* triângulos só são possíveis se todas
   * as retas componentes se alcancam pelas as pontas
   * a+b não pode ser <= c
   * c+a não pode ser <= b
   * b+c não pode ser <= a
   * */
  protected boolean eTriangulo()
  {
    if( (this.la + this.lb) <= this.lc ||
        (this.lc + this.la) <= this.lb ||
        (this.lb + this.lc) <= this.la
      )
    {
      return false;
    }
    return true;
  }

  //se a = b e c = b então a=b=c
  protected boolean eEquilatero()
  {
    this.eTriangulo();
    if ( this.la == this.lb && this.lc == this.lb )
    {
      System.out.println( "É equilátero" );
      return true;
    }
    System.out.println( "Não é equilátero" );
    return false;
  }

  /* Dois lados iguais e um diferente.
   *eq diff
    ab c
    ca b
    bc a
   */
  protected boolean eIsoceles()
  {
    this.eTriangulo();
    if      ( this.la == this.lb && (this.lc != this.la) )
    {
      System.out.println( "É isoceles" );
      return true;
    }
    else if ( this.lc == this.la && (this.lb != this.lc) )
    {
      System.out.println( "É isoceles" );
      return true;
    }
    else if ( this.lb == this.lc && (this.la != this.lb) )
    {
      System.out.println( "É isoceles" );
      return true;
    }
    System.out.println( "Não é isoceles" );
    return false;
  }

  /* ab,ba ac,ca bc,cb propriedade comutativa */
  protected boolean eEscaleno()
  {
    this.eTriangulo();
    if ( this.la != this.lb && this.la != this.lc && this.lb != this.lc )
    {
      System.out.println( "É escaleno" );
      return true;
    }
    System.out.println( "Não é escaleno" );
    return false;
  }

  public void verificarTipo( String tipo )
  {
    switch( tipo )
    {
      case "equilatero":
        this.eEquilatero();
        break;
      case "isoceles":
        this.eEscaleno();
        break;
      case "escaleno":
        this.eIsoceles();
        break;
      default:
        this.eEquilatero();
    }
  }
  
};


