// conta
package com.ifrn.intro;

import java.util.Random;
import com.ifrn.intro.ContasUtil;

public class ContaCorrente
{

  String idCliente;
  float saldo;

  ContasUtil contasUtil;

  public ContaCorrente( ContaCorrente[] contas )
  {
    this.contasUtil = new ContasUtil();
    this.idCliente = this.contasUtil.gerarId( contas );
    this.saldo = 0;
  }
 
  public float sacar( float quantia )
  {
    if ( quantia <= this.saldo )
    {
      this.saldo -= quantia;
      System.out.printf("Sacaste %f\n", quantia );
      return quantia;
    }
    System.out.printf( "teu saldo é de %f, logo não podes sacar %f\n", this.saldo, quantia );
    return 0;
  }

  public void depositar( float quantia )
  {
    if ( quantia > 0 )
    {
      this.saldo += quantia;
      System.out.printf("Depositaste %f\n", quantia );
      return;
    }
    System.out.printf( "não podes depositar 0 reais ou valor negativo.\n" );
  }

  public void transferir( float quantia, ContaCorrente[] contas, String idAlvo )
  {
    String existe = this.contasUtil.buscaSequencial( contas, idAlvo );

    if ( existe == "-1" ) System.out.println( "Não foi possível encontrar a conta com id especificado" );

    if ( quantia <= this.saldo )
    {
      int alvo = this.contasUtil.retornarPosicaoDoAlvo( contas, idAlvo );

      if ( alvo == -1 )
      {
        System.out.printf("Não foi possível alcancar usuário solicitado");
        return;
      }

      contas[ alvo ].depositar( quantia );
      this.saldo -= quantia;
      System.out.printf( "Tranferiste %f para a conta %s\n", quantia, contas[ alvo ].idCliente );
      return;
    }
    System.out.printf( "A conta '%s' não foi encontrada. TRANSFERÊNCIA ABORTADA\n", idAlvo );
  }

  public void visualizar()
  {
    System.out.printf( "%f\n", this.saldo );
  }

};

