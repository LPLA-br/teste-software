
class Conta
{
  constructor( id, saldoInicial )
  {
    this.id = id;
    this.saldo = saldoInicial;
  }

  sacar( quantia )
  {
    if ( quantia <= this.saldo )
    {
      this.saldo -= quantia;
      return quantia;
    }
  }

  depositar( quantia )
  {
    this.saldo += quantia;
  }

  transferir( quantia, outro )
  {
    if ( quantia <= this.saldo )
    {
      outro.depositar( quantia  );
      this.saldo -= quantia;
    }
  }

}

module.exports = Conta;
