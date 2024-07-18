# TESTES DO SOFTWARE DOS TRIÂNGULOS COM JEST

<p>
    Contém os primeiros testes
    utilizando o que há de mais
    básico na biblioteca jest
    do javascript/nodejs
</p>

```
$ npm install
$ npm run test
```
Para realizar testes em projeto typescript instale as seguintes dependências:
<ul>
    <li> jest                    </li>
    <li> babel-jest             </li>
    <li> typescript             </li>
    <li> ts-jest                </li>
    <li> @types/jest            </li>
    <li> @babel/core             </li>
    <li> @babel/preset-env       </li>
    <li> @babel/preset-typescript</li>
</ul>

inicie o babel.config.js que indica quais presets para o babel transpilar para
o javascript ante EC6:

```js
module.exports = {
  presets: [
    ['@babel/preset-env', {targets: {node: 'current'}}],
    '@babel/preset-typescript'
  ],
};

```

gere o arquivo genesis de configuração do ts-jest através do terminal:

```bash
npx ts-jest config:init
```



<img src="https://www.google.com/url?sa=i&url=https%3A%2F%2Fmundoeducacao.uol.com.br%2Fmatematica%2Fpropriedades-triangulo-equilatero.htm&psig=AOvVaw3gf_O_1_ZRGCj2eSulszqu&ust=1710541666588000&source=images&cd=vfe&opi=89978449&ved=0CBMQjRxqFwoTCOCvrbXm9IQDFQAAAAAdAAAAABAI" alt="triangulos" />


