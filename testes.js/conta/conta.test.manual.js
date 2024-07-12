/* Testes unitários manuais sem jest */

const conta = require('./conta');
let contas = [];

console.log("criando 3 contas com 100");
for ( let i = 0; i < 3; i++ )
{
  //todas contas com 100 conto
  contas.push( new conta(i,100) );
}

contas[0].depositar(100);
if ( contas[0].saldo == 200 ) console.log("depositar OK", contas);
else console.log("depositar FALHOU saldo conta a =", contas[0].saldo );

contas[0].sacar(100);
if ( contas[0].saldo == 100 ) console.log("sacar OK", contas);
else console.log("sacar FALOU saldo conta a =", contas[0].saldo );

contas[0].transferir( 100, contas[1] );
if ( contas[0].saldo == 0 && contas[1].saldo == 200 ) console.log("sacar OK", contas);
else console.log("transferir FALHOU.", contas);

