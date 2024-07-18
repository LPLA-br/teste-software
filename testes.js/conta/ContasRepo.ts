import { Conta } from "./conta";
import IConta from "./IConta";

class ContasRepo
{

  contas: IConta[];

  constructor( contas: IConta[] )
  {
    this.contas = contas;
  }

};

