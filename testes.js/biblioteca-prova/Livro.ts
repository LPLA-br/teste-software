
class Livro
{

  public titulo: string;
  protected emprestado: boolean;

  constructor( titulo: string )
  {
    this.titulo = titulo;
    this.emprestado = false;
  }

  public definir_Emprestado()
  {
    this.emprestado = true;
  }

  public definir_Retornado()
  {
    this.emprestado = false;
  }

  public get_emprestado()
  {
    return this.emprestado;
  }

}

export { Livro };

