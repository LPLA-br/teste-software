import { Livro } from "./Livro";
import { Biblioteca } from "./Biblioteca";

class Usuario
{

  meusLivros: Livro[];
    
  constructor()
  {
    this.meusLivros = [];
  }

  //usuário não define estado de emprestimo do livro

  public solicitarEmprestimo( titulo: string ,biblioteca: Biblioteca ): void
  {
    let livro = biblioteca.atenderEmprestimo( titulo );
    if( typeof livro == "object" )
      this.meusLivros.push( livro );
  }

  public devolver( titulo: string, biblioteca: Biblioteca ): void
  {
    for ( let i = 0; i <= this.meusLivros.length; i++ )
    {
      if ( titulo == this.meusLivros[i].titulo )
      {
        if ( typeof this.meusLivros[i] == "object" )
        biblioteca.receberLivroEmprestado( this.meusLivros[i] );
      }
    }
  }

};

export { Usuario };

