const Telescopio = require("../Telescopio/Telescopio");

/* DECOMPOSIÇÃO ESTRUTURAL DO CÓDIGO PARA ANÁLISE
 * alterarAzimute :: number -> void
 * |
 * |\_number  input_type_check
 * |_number   underflow_avoidance
 * |_number   overflow_avoidance
 * |_number   nominal_attribute_change
 *
 * alterarAtitude :: number -> void
 * |
 * |\_number  input_type_check
 * |_number   underflow_avoidance
 * |_number   overflow_avoidance
 * |_number   nominal_attribute_change
 *
 * Após decomposição estrutural
 * documental de cada função da
 * classe inicia-se testes:
 * */

test( "instânciação", ()=>
{
  const t = new Telescopio(0, 0);

  expect( t.azimute ).toBe( 0 );
  expect( t.atitude ).toBe( 0 );

  const t2 = new Telescopio( 45, 45 );

  expect( t2.azimute ).toBe( 45 );
  expect( t2.atitude ).toBe( 0 );

});

//javascript como linguagem de tipos dinâmicos.
test( "seguranca de tipos", ()=>
{

  let t = new Telescopio( 0, 0 );

  t.alterarAtitude( "45" );
  expect( t.azimute ).toBe( 0 );

  t = new Telescopio(0,0);

  t.alterarAtitude( "quarenta_e_cinco" );
  expect( t.azimute ).toBe( 0 );

  t = new Telescopio(0,0);

  t.alterarAtitude( false );
  expect( t.azimute ).toBe( 0 );

  t = new Telescopio(0,0);

  t.alterarAtitude( {atitude:45} );
  expect( t.azimute ).toBe( 0 );

  t = new Telescopio(0,0);

  t.alterarAzimute( [45,0] );
  expect( t.azimute ).toBe( 0 );

  //------------------------------

  t = new Telescopio(0,0);

  t.alterarAtitude( "45" );
  expect( t.atitude ).toBe( 0 );

  t = new Telescopio(0,0);

  t.alterarAtitude( "quarenta_e_cinco" );
  expect( t.atitude ).toBe( 0 );

  t = new Telescopio(0,0);

  t.alterarAtitude( false );
  expect( t.atitude ).toBe( 0 );

  t = new Telescopio(0,0);

  t.alterarAtitude( {atitude:45} );
  expect( t.atitude ).toBe( 0 );

  t = new Telescopio(0,0);

  t.alterarAzimute( [45,0] );
  expect( t.atitude ).toBe( 0 );
  
});

test( "alteração de azimute", ()=>
{
  let t = new Telescopio( 0, 0 );

  t.alterarAzimute( 45 );
  expect( t.azimute ).toBe( 45 );

  t = new Telescopio( 0, 0 );

  t.alterarAzimute( 368 );
  expect( t.azimute ).toBeGreaterThanOrEqual( 0 );
  expect( t.azimute ).toBeLessThanOrEqual( 360 );
  expect( t.azimute ).toBe( 360 );

  t = new Telescopio( 0, 0 );

  t.alterarAzimute( -8 );
  expect( t.azimute ).toBeGreaterThanOrEqual( 0 );
  expect( t.azimute ).toBeLessThanOrEqual( 360 );
  expect( t.azimute ).toBe( 0 );

  t = new Telescopio( 0, 0 );

  t.alterarAzimute( "quarenta_e_5" );
  expect( t.azimute ).toBe( 0 );

});

test( "alteracao de atitude", ()=>
{
  let t = new Telescopio( 0, 0 );

  t.alterarAtitude( 45 );
  expect( t.azimute ).toBe( 45 );

  t = new Telescopio( 0, 0 );

  t.alterarAtitude( 92 );
  expect( t.azimute ).toBeGreaterThanOrEqual( 0 );
  expect( t.azimute ).toBeLessThanOrEqual( 90 );
  expect( t.azimute ).toBe( 90 );

  t = new Telescopio( 0, 0 );

  t.alterarAtitude( -8 );
  expect( t.azimute ).toBeGreaterThanOrEqual( 0 );
  expect( t.azimute ).toBeLessThanOrEqual( 90 );
  expect( t.azimute ).toBe( 0 );

  t = new Telescopio( 0, 0 );

  t.alterarAtitude( "quarenta_e_5" );
  expect( t.azimute ).toBe( 0 );

});

