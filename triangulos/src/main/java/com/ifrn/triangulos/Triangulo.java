package com.ifrn.triangulos;

/**
 * Classifica um triângulo de acordo com as
 * propriedades de tamanho das retas. 
 * */
public class Triangulo
{
  protected int la;
  protected int lb;
  protected int lc;

  Triangulo( int a, int b, int c )
  {
    this.la = Math.abs(a);
    this.lb = Math.abs(b);
    this.lc = Math.abs(c);
  }

  /** Retorna o maior lado de um triângulo real.
   * @return  lado  caractere indicador de lado.
   * */
  protected char maiorLado()
  {
    if( this.la > this.lb && this.la > this.lc ) return 'a';
    else if( this.lb > this.la && this.lb > this.lc ) return 'b';
    else if( this.lc > this.la && this.lc > this.lb ) return 'c';
    else return '*'; //todos os lados iguais (equilátero)
  }

  /**
   * Verifica se os valores apontam para um triângulo possível
   * onde a soma de dois lados não é menor que ou igual ao do
   * terceiro.
   * @return  identidade  booleano se é ou não triângulo.
   * */
  public boolean eTriangulo()
  {
    if ( this.la == 0 && this.lb == 0 && this.lc == 0 ) return false;

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

  /**
   * Verifica se triângulo tem os três lados iguais de forma
   * que seja equilátero.
   * @return identidade booleano se é ou não equilatero.
   * */
  public boolean eEquilatero()
  {
    if ( this.eTriangulo() == false ) return false;

    if ( this.la == this.lb && this.lc == this.lb )
    {
      return true;
    }
    return false;
  }

  /**
   * Verifica se se dois lados tem valores iguais e um diferente
   * independentemente da posição do maior lado.
   * @return  identidade  booleano se é ou não isoceles.
   * */
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

  /**
   * Verifica se os três lados do triâgulo têm diferentes valores
   * não violando codições anteriores e indicando escalenidade.
   * @return  identidade  booleano se é ou não escaleno.
  */
  public boolean eEscaleno()
  {
    if ( this.eTriangulo() == false ) return false;

    if ( this.la != this.lb && this.la != this.lc && this.lb != this.lc )
    {
      return true;
    }
    return false;
  }

  /** Altera valores dos lados do objeto.
   * */
  public void setLados( int a, int b, int c )
  {
    this.la = Math.abs(a);
    this.lb = Math.abs(b);
    this.lc = Math.abs(c);
  }

  // Método verificar tipo removido.
};


