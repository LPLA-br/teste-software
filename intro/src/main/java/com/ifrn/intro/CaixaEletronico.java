// caixa eletrónico
package com.ifrn.intro;

import java.util.Scanner;
import com.ifrn.intro.ContaCorrente;
import com.ifrn.intro.ContasUtil;

public class CaixaEletronico
{
  
  ContaCorrente[] contas;
  Scanner sc;

  public CaixaEletronico( int numDeContas )
  {
    this.contas = new ContaCorrente[numDeContas];
    this.sc = new Scanner( System.in );
    this.instanciarContasAleatoriasEmMatriz();
  }

  public CaixaEletronico()
  {
    this.contas = new ContaCorrente[10];
    this.sc = new Scanner( System.in );
    this.instanciarContasAleatoriasEmMatriz();
  }

  protected void exibirListaDeContas()
  {
    for( int i = 0; i < this.contas.length; i++ )
    {
      System.out.println( this.contas[i].idCliente );
    }
  }

  protected void opcoesDoUsuario( String credencialAcesso )
  {
    System.out.println( "****** SOFTWARE BANCÁRIO JAVEIRO ******\n\n" );
      System.out.println( "===================" );
      System.out.println( " 1.Sacar" );
      System.out.println( " 2.Depositar" );
      System.out.println( " 3.Transferir" );
      System.out.println( " 4.Visualizar" );
      System.out.println( "===================" );
    
  }

  /* Instância 10 "ContaCorrente" aleatórias em uma matriz de "ContaCorrente" */
  protected void instanciarContasAleatoriasEmMatriz()
  {
    //instanciação de objeto para cada posição da matriz alocada pelo java.
    for( int i = 0; i < this.contas.length; i++ )
    {
      this.contas[i] = new ContaCorrente( this.contas, new ContasUtil() );
    }
  }

  /*retorna a posição do objeto que usuário logou-se ou retorna -1 */
  protected int login()
  {
    this.exibirListaDeContas();
    String id = this.sc.next();
    
    for( int i = 0; i < this.contas.length; i++ )
    {
      if( this.contas[i].idCliente.equals( id ) )
      {
        return i;
      }
    }
    return -1;
  }

  public void executarCaixaEletronico()
  {
    int credencialAcesso = this.login();

    if( credencialAcesso == -1 )
    {
      System.out.println( "login falho: id não existente. ABORTADO" );
      System.exit( 0 );
    }

    while( true )
    {
      float quantia = 0;
      String alvo = "";

      String opt = this.sc.nextLine();

      this.opcoesDoUsuario( Integer.toString(credencialAcesso) );

      opt = this.sc.nextLine();
      switch( opt )
      {
        case "1":
          System.out.println( "quantia>" );
          quantia = this.sc.nextFloat();
          contas[credencialAcesso].sacar( quantia );
          break;
        case "2":
          System.out.println( "quantia>" );
          quantia = this.sc.nextFloat();
          contas[credencialAcesso].depositar( quantia );
          break;
        case "3":
          System.out.println( "quantia>" );
          quantia = this.sc.nextFloat();
          System.out.println( "alvo>" );
          alvo = this.sc.next();
          contas[credencialAcesso].transferir( quantia, this.contas, alvo );
          break;
        case "4":
          contas[credencialAcesso].visualizar();
          break;
        default:
          System.out.println( "NOP" );
          break;
      }
    }
    
  }

};

