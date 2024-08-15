/* Telescopio.js */

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
 * */

class Telescopio
{
  constructor( azimute=0, atitude=0 )
  {
    this.azimute = 0;
    this.atitude = 0;

    this.alterarAzimute( azimute );
    this.alterarAtitude( atitude );
  }

  alterarAzimute( graus )
  {
    if ( typeof graus != "number" )
    {
      this.azimute = 0;
    }

    if ( graus < 0 )
    {
      this.azimute = 0;
    }
    else if ( graus >= 360 )
    {
      this.azimute = 360;
    }
    else
    {
      this.azimute = graus;
    }
  }
 
  alterarAtitude( graus )
  {
    if ( typeof graus != "number" )
    {
      return 0;
    }

    if ( graus < 0 )
    {
      return 0;
    }
    else if ( graus >= 90 )
    {
      return 90;
    }
    else
    {
      return graus;
    }
  }
};

module.exports = Telescopio;

