/* INTRODUÇÃO AO TESTE DE SOFTWARE
 * caso clássico de simples funções
 * com poucas intrachamadas de outras
 * funções.
 * NOTA: números negativos são convertidos em números positivos.
 * */

const tri = require( './index' );

//testes a parte.

//testes essenciais.
test('é triangulo', ()=>
{
  expect( tri.eTriangulo(1,2,3)           ).toBe(false);
  expect( tri.eTriangulo(2,5,10)          ).toBe(false);
  expect( tri.eTriangulo(10,10,0)         ).toBe(false);
  expect( tri.eTriangulo(10,10,-10)       ).toBe(true);
  expect( tri.eTriangulo(12,15,30)        ).toBe(false);
  expect( tri.eTriangulo(1,2,4)           ).toBe(false);
  expect( tri.eTriangulo(0,0,0)           ).toBe(false);
  expect( tri.eTriangulo('0','dez','10')  ).toBe(false);
  expect( tri.eTriangulo(1,2,undefined)   ).toBe(false);
});


test('é equilátero', ()=>
{
  expect( tri.eEquilatero(10,10,10)       ).toBe(true);
  expect( tri.eEquilatero(12,15,30)       ).toBe(false);
  expect( tri.eEquilatero(1,2,4)          ).toBe(false);
  expect( tri.eEquilatero(1,2,undefined)  ).toBe(false);
});

test('é isóceles', ()=>
{
  expect( tri.eIsoceles(11,10,10)       ).toBe(true);
  expect( tri.eIsoceles(2,2,4)          ).toBe(false);
  expect( tri.eIsoceles(3,3,4)          ).toBe(true);
  expect( tri.eIsoceles(3,4,3)          ).toBe(true);
  expect( tri.eIsoceles(4,3,3)          ).toBe(true);
  expect( tri.eIsoceles(0,3,3)          ).toBe(false);
  expect( tri.eIsoceles(-4,3,3)         ).toBe(true);
  expect( tri.eIsoceles(12,15,30)       ).toBe(false);
  expect( tri.eIsoceles(1,2,4)          ).toBe(false);
  expect( tri.eIsoceles(1,2,undefined)  ).toBe(false);
});

test('é escaleno', ()=>
{
  expect( tri.eEscaleno(1,2,3)         ).toBe(false);
  expect( tri.eEscaleno(3,1,2)         ).toBe(false);
  expect( tri.eEscaleno(2,3,1)         ).toBe(false);
  expect( tri.eEscaleno(10,11,12)      ).toBe(true);
  expect( tri.eEscaleno(12,15,30)      ).toBe(false);
  expect( tri.eEscaleno(1,2,4)         ).toBe(false);
  expect( tri.eEscaleno(1,2,undefined) ).toBe(false);
});



