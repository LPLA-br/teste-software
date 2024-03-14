// LPLA-br

function entradaEstaInvalida( la, lb, lc )
{
  if ( typeof la == 'undefined' ||
       typeof lb == 'undefined' ||
       typeof lc == 'undefined'
  )
  {
    return true;
  }
  return false;
}

/** retorna o maior lado de um triângulo generico
 * @returns 'a'|'b'|'c'|'*'
 * */
function maiorLado( la, lb, lc )
{
  if( entradaEstaInvalida(la,lb,lc) == true ) return '-';

  if( la == 0 || lb == 0 || lc == 0 ) return '-';

  la = Math.abs(la);
  lb = Math.abs(lb);
  lc = Math.abs(lc);

  if( la > lb && la > lc ) return 'a';
  else if( lb > la && lb > lc ) return 'b';
  else if( lc > la && lc > lb ) return 'c';
  else return '*'; //todos os lados iguais (equilátero)
}

/* Triângulos só são possíveis se todas
 * as retas componentes se alcancam
 * pelas as pontas
 * a+b não pode ser <= c
 * c+a não pode ser <= b
 * b+c não pode ser <= a
 * */
function eTriangulo( la, lb, lc )
{
  if( entradaEstaInvalida(la,lb,lc) == true ) return false;

  la = Math.abs(la);
  lb = Math.abs(lb);
  lc = Math.abs(lc);

  let ml = maiorLado( la, lb, lc );

  // descubra qual é o maior lado
  switch( ml )
  {
    case 'a':
      if ( (lb + lc) <= la )
        return false;
      break;
    case 'b':
      if ( (lc + la) <= lb )
        return false;
      break;
    case 'c':
      if ( (la + lb) <= lc )
        return false;
      break;
    case '-':
      return false;
    case '*':
      return true;
  }
  return true;
}


//se a = b e c = b então a=b=c
function eEquilatero( la, lb, lc )
{
  if( entradaEstaInvalida(la,lb,lc) == true ) return false;

  la = Math.abs(la);
  lb = Math.abs(lb);
  lc = Math.abs(lc);

  if ( eTriangulo( la, lb, lc ) == false ) return false;

  if ( la == lb && lc == lb )
  {
    return true;
  }
  return false;
}

/* Dois lados iguais e um diferente.
 * (ab)c, (ca)b, (bc)a comutativa*/
function eIsoceles( la, lb, lc )
{
  if( entradaEstaInvalida(la,lb,lc) == true ) return false;

  la = Math.abs(la);
  lb = Math.abs(lb);
  lc = Math.abs(lc);

  console.log( la, lb, lc );

  if ( eTriangulo( la, lb, lc ) == false ) return false;

  if      ( la == lb && (lc != la) )
  {
    return true;
  }
  else if ( lc == la && (lb != lc) )
  {
    return true;
  }
  else if ( lb == lc && (la != lb) )
  {
    return true;
  }
  return false;
}

/* ab,ba ac,ca bc,cb propriedade comutativa */
function eEscaleno( la, lb, lc )
{
  if( entradaEstaInvalida(la,lb,lc) == true ) return false;

  la = Math.abs(la);
  lb = Math.abs(lb);
  lc = Math.abs(lc);

  if ( eTriangulo( la, lb, lc ) == false ) return false;

  if ( la != lb && la != lc && lb != lc )
  {
    return true;
  }
  return false;
}

module.exports = { eEscaleno, eIsoceles, eEquilatero, eTriangulo, maiorLado, entradaEstaInvalida };
