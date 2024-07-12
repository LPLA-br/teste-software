package com.ifrn.intro;

import java.util.Random;
import com.ifrn.intro.IContasUtil;

public class ContasUtil implements IContasUtil
{

  ContasUtil()
  {}

  /*
   * @return idTextual da conta corrente alvo ou uma não conta na forma "-1"
   * */
  public String buscaSequencial( ContaCorrente[] contas, String idCliente )
  {
    if ( contas.length == 0 ) return "-1";
    /*se a matriz de contas for ordenada alfabeticamente pelo idCliente
      será possível aplicar busca binária ao invés da busca sequêncial abaixo*/
    for( int i = 0; i < contas.length; i++ )
    {
      if ( contas[i] == null ) continue;
      else if ( contas[i].idCliente.equals( idCliente ) ) return contas[i].idCliente;
    }
    return "-1";
  }

  /*
   * @return número de posição da conta alvo ou uma não conta -1
   * */
  public int retornarPosicaoDoAlvo( ContaCorrente[] contas, String idAlvo )
  {
    int posicao = -1;
    for ( int i = 0; i< contas.length; i++ )
    {
      if ( contas[i].idCliente.equals( idAlvo ) )
      {
        posicao = i;
        break;
      }
    }
    return posicao;
  }

  // gerarId para criação de conta aleatóriamente.
  public String gerarId( ContaCorrente[] contas )
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
}

