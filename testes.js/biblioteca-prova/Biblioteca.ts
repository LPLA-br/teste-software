import { Livro } from "./Livro";

class Biblioteca
{

  catalogo: Livro[];

  constructor()
  {
    this.catalogo = [];
  }

  // único que altera o catálogo
  public cadastrarLivro( livro: Livro ): void
  {
    this.catalogo.push( livro );
  }

  public atenderEmprestimo( titulo: string ): Livro | undefined
  {
    for ( let i = 0; i <= this.catalogo.length; i++ )
    {
      if ( titulo == this.catalogo[i].titulo )
      {
        this.catalogo[i].definir_Emprestado();
        return this.catalogo[i];
      }
      else
        return undefined;
    }
  }

  public receberLivroEmprestado( livro: Livro ): void
  {
    for ( let i = 0; i <= this.catalogo.length; i++ )
    {
      if ( livro.titulo == this.catalogo[i].titulo )
      {
        this.catalogo[i].definir_Retornado()
      }
    }
  }

}

export { Biblioteca };
