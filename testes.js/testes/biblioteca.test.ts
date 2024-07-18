import { Biblioteca } from "../biblioteca-prova/Biblioteca";
import { Livro } from "../biblioteca-prova/Livro";
import { Usuario } from "../biblioteca-prova/Usuario";

/*
test("titulo",()=>{
  expect().not.toBe();
});
*/

test( "adicao de livro ao catalogo",()=>{
  const b = new Biblioteca();
  const titulo: string = "Gravitacao Universal de Newton";
  b.cadastrarLivro( new Livro(titulo) );
  expect(b.catalogo[0].titulo).toBe(titulo);
});

test( "emprestimo marca livro",()=>{
  const b = new Biblioteca();

  const titulo: string = "Luiz Programador: Uma história de luta";

  b.cadastrarLivro( new Livro(titulo) );
  b.atenderEmprestimo(titulo);

  expect(b.catalogo[0].get_emprestado()).toBe(true);
});

test( "emprestimo de livro ao usuário marca livro",()=>{
  const b = new Biblioteca();
  const u = new Usuario();

  const titulo: string = "Luiz Programador: minutos finais";

  b.cadastrarLivro( new Livro(titulo) );
  u.solicitarEmprestimo( titulo, b );

  expect(b.catalogo[0].get_emprestado()).toBe(true);
});



