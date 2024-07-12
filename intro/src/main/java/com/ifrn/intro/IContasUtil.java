package com.ifrn.intro;

public interface IContasUtil
{
  public String buscaSequencial( ContaCorrente[] contas, String idCliente );
  public int retornarPosicaoDoAlvo( ContaCorrente[] contas, String idAlvo );
  public String gerarId( ContaCorrente[] contas );
};

