// conta
package com.ifrn.intro;

import java.util.Random;

public class ContaCorrente
{

  String idCliente;
  int saldo;

  public ContaCorrente( ContaCorrente[] contas )
  {
    this.idCliente = this.gerarId( contas );
    this.saldo = 0;
  }

  /*
   * @return idTextual da conta corrente alvo ou uma não conta na forma "-1"
   * */
  protected String buscaSequencial( ContaCorrente[] contas, String idCliente )
  {
    if ( contas.length == 0 ) return "-1";
    /*se a matriz de contas for ordenada alfabeticamente pelo idCliente
      será possível aplicar busca binária ao invés da busca sequêncial abaixo*/
    for( int i = 0; i < contas.length; i++ )
    {
      if ( contas[i] == null ) continue;
      else if ( contas[i].idCliente == idCliente ) return contas[i].idCliente;
    }
    return "-1";
  }

  /*
   * @return número de posição da conta alvo ou uma não conta -1
   * */
  protected int retornarPosicaoDoAlvo( ContaCorrente[] contas, String idAlvo )
  {
    int posicao = -1;
    for ( int i = 0; i< contas.length; i++ )
    {
      if ( contas[i].idCliente == idAlvo )
      {
        posicao = i;
        break;
      }
    }
    return posicao;
  }

  // gerarId para criação de conta aleatóriamente.
  protected String gerarId( ContaCorrente[] contas )
  {
    Random r = new Random();

    while( true )
    {
      int res = (r.nextInt(1,9999)+1);

      String jaExiste = this.buscaSequencial( contas, Integer.toString( res ) );

      if ( jaExiste == "-1" )
        return Integer.toString( res );
      else continue;
    }
  }

  public float sacar( float quantia )
  {
    if ( quantia <= this.saldo )
    {
      this.saldo -= quantia;
      return quantia;
    }
    System.out.printf( "\n teu saldo é de %f, logo não podes sacar %f", this.saldo, quantia );
    return 0;
  }

  public void depositar( float quantia )
  {
    if ( quantia > 0 )
    {
      this.saldo += quantia;
    }
    System.out.printf( "\n não podes depositar 0 reais ou valor negativo TROUXA!" );
  }

  public void transferir( float quantia, ContaCorrente[] contas, String idAlvo )
  {
    String existe = this.buscaSequencial( contas, idAlvo );

    if ( existe == "-1" ) System.out.println( "Não foi possível encontrar a conta com id especificado" );

    if ( quantia <= this.saldo )
    {
      int alvo = this.retornarPosicaoDoAlvo( contas, idAlvo );
      contas[ alvo ].depositar( quantia );
      this.saldo -= quantia;
      System.out.printf( "Tranferiste %f para a conta %s", quantia, contas[ alvo ].idCliente );
    }
    System.out.printf( "A conta '%s' não foi encontrada. TRANSFERÊNCIA ABORTADA", idAlvo );
  }
};

