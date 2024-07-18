
export default interface IConta
{
  sacar( quantia: number ): number;
  depositar( quanta: number ): void;
  transferir( quantia: number, outro: IConta ): void;
};

