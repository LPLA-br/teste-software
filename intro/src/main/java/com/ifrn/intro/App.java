package com.ifrn.intro;

import java.util.Scanner;
import com.ifrn.intro.ContaCorrente;
import com.ifrn.intro.CaixaEletronico;

/**
 * Aplicação bancária fictícia para
 * introdução ao ambiente java.
 * @author LPLA-br
 */
public class App
{
  public static void main( String[] args )
  {
    CaixaEletronico a = new CaixaEletronico();
    a.executarCaixaEletronico();
  }
}
