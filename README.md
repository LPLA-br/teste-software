# INTRODUÇÃO À JAVA & TESTE DE SOFTWARE

<p>
    Projetos java sob a tutoria do professor Jorge Chrystiann
    Guimaraes da Cunha Nunes.
</p>

<p>
    A estrutura das aplicações JAVA© foram geradas pela
    ferramenta cli maven com um comando semelhante a:
</p>

```bash

$ mvn \
    archetype:generate
    -DgroupId=com.tuacompania.app \
    -DartifactId=teu-app \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DarchetypeVersion=1.4 \
    -DinteractiveMode=true

#compilação manual
$ javac -d dir/ main.java a.java b.java

```

<p>
    ciclo de vida da construção do projeto com o maven
    FONTE: <a href="https://maven.apache.org/"> maven </a>
</p>

<ul>
    <li> validate - verifica correção do projeto </li>
    <li> compile - compila o código fonte </li>
    <li> test - testa código fonte compilado usando framework de teste </li>
    <li> package - fonte compilado para pacote distribuível </li>
    <li> verify - executa checagens nos resultados dos testes de integração </li>
    <li>
        install - instala pacote no repositório local para uso como dependência
        em outros projetos localmente.
    </li>
    <li> deploy - copia pacote final para o repositório remoto </li>
</ul>

<hr>

<p> Projetos javascript neste repositório: </p>

<p>
    Aplicações javascript nodejs foram incializadas
    pelo comando cli `npm init`.
    Posteriores instalações de bibliotecas e frameworks
    explicados em cada projeto javascript.
</p>

```
$ npm init
```

