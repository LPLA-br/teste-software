// TESTES UNITÁRIOS MODO CAIXA PRETA.
import { Conta } from "../conta/conta";
import { test, expect, jest } from "@jest/globals";

test('saque não adiciona valores e retorna quantia sacada', ()=>{
  const alpha = new Conta(1,100);

  let valorAnterior = alpha.saldo;

  expect(alpha.sacar(50)).toBe(50);
  expect(alpha.saldo).toBeLessThan(valorAnterior);
});

test('saque rejeita valores negativos e nulos',()=>{
  const alpha = new Conta(1,100);

  expect(alpha.sacar(0)).toBe(0);
  expect(alpha.sacar(-50)).toBe(0);
  expect(alpha.sacar(-101)).toBe(0);
});

test('saque não maior que valor corrente na conta',()=>{
  const alpha = new Conta(1,100);

  expect(alpha.sacar(101)).toBe(0);
  expect(alpha.saldo).toBe(100);
});

//--------------------------

test( 'deposito não nulo ou negativo', ()=>{
  const alpha = new Conta(1,100);
  alpha.depositar(0);
  expect(alpha.saldo).toBe(100);
  alpha.depositar(-100);
  expect(alpha.saldo).toBe(100);
});

//--------------------------
// TESTE DE INTEGRAÇÃO
// TROCA DE MENSAGEM INTER OBJETOS

test( 'transferencia normal inter-conta', ()=>{
  const alpha = new Conta(1,100);
  const beta  = new Conta(1,100);

  alpha.transferir(50,beta);

  expect(alpha.saldo).toBe(50);
  expect(beta.saldo).toBe(150);
});

test( 'transferencia de valor negativo', ()=>{
  const alpha = new Conta(1,100);
  const beta  = new Conta(1,100);

  alpha.transferir(-50,beta);

  expect(alpha.saldo).toBe(100);
  expect(beta.saldo).toBe(100);
} );

test( 'transferencia de valor nulo', ()=>{
  const alpha = new Conta(1,100);
  const beta  = new Conta(1,100);

  alpha.transferir(0,beta);

  expect(alpha.saldo).toBe(100);
  expect(beta.saldo).toBe(100);
} );

test( 'transferencia de valor maior que disponivel', ()=>{
  const alpha = new Conta(1,100);
  const beta  = new Conta(1,100);

  alpha.transferir(101,beta);

  expect(alpha.saldo).toBe(100);
  expect(beta.saldo).toBe(100);
} );

