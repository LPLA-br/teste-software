import IConta from "./IConta";

class Conta implements IConta
{

  public id: number;
  public saldo: number;

  constructor( id: number, saldoInicial: number )
  {
    this.id = id;
    this.saldo = saldoInicial;
  }

  sacar( quantia: number ): number
  {
    if ( quantia <= this.saldo && quantia > 0 )
    {
      this.saldo -= quantia;
      return quantia;
    }
    return 0;
  }

  depositar( quantia: number ): void
  {
    if ( quantia > 0 )
      this.saldo += quantia;
  }

  transferir( quantia: number, outro: Conta ): void
  {
    if ( quantia <= this.saldo && quantia > 0 )
    {
      outro.depositar( quantia  );
      this.saldo -= quantia;
    }
  }

}

export { Conta };
