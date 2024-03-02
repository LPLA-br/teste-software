package com.ifrn.triangulos;

/**
 * Classifica um triângulo de acordo com as
 * propriedades de tamanho das retas. 
 * */
public class Triangulo
{
  int la;
  int lb;
  int lc;

  Triangulo( int a, int b, int c )
  {
    this.la = Math.abs(a);
    this.lb = Math.abs(b);
    this.lc = Math.abs(c);
  }

  /* Retorna o maior lado de um triângulo */
  protected char maiorLado()
  {
    if( this.la > this.lb && this.la > this.lc ) return 'a';
    else if( this.lb > this.la && this.lb > this.lc ) return 'b';
    else if( this.lc > this.la && this.lc > this.lb ) return 'c';
    else return '*'; //todos os lados iguais (equilátero)
  }

  /* triângulos só são possíveis se todas
   * as retas componentes se alcancam pelas as pontas
   * a+b não pode ser <= c
   * c+a não pode ser <= b
   * b+c não pode ser <= a
   * */
  public boolean eTriangulo()
  {
    char ml = this.maiorLado();
    // descubra qual é o maior lado
    switch( ml )
    {
      case 'a':
        if ( (this.lb + this.lc) <= this.la )
          return false;
        break;
      case 'b':
        if ( (this.lc + this.la) <= this.lb )
          return false;
        break;
      case 'c':
        if ( (this.la + this.lb) <= this.lc )
          return false;
        break;
      case '*':
        return true;
    }
    return true;
  }

  //se a = b e c = b então a=b=c
  public boolean eEquilatero()
  {
    if ( this.eTriangulo() == false ) return false;

    if ( this.la == this.lb && this.lc == this.lb )
    {
      return true;
    }
    return false;
  }

  /* Dois lados iguais e um diferente.
   * (ab)c, (ca)b, (bc)a */
  public boolean eIsoceles()
  {
    if ( this.eTriangulo() == false ) return false;

    if      ( this.la == this.lb && (this.lc != this.la) )
    {
      return true;
    }
    else if ( this.lc == this.la && (this.lb != this.lc) )
    {
      return true;
    }
    else if ( this.lb == this.lc && (this.la != this.lb) )
    {
      return true;
    }
    return false;
  }

  /* ab,ba ac,ca bc,cb propriedade comutativa */
  public boolean eEscaleno()
  {
    if ( this.eTriangulo() == false ) return false;

    if ( this.la != this.lb && this.la != this.lc && this.lb != this.lc )
    {
      return true;
    }
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
        return;
    }
  }
};


