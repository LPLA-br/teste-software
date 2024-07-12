#!/bin/sh

DEST=./build

#limpar conteudo de build
if [[ $1 == "-c" ]]; then
  rm -rf $DEST/com;
  exit;
fi

echo    "PROJETO COMPILADO PARA DENTRO DE $DEST "
echo -e "ATENÇÃO: execute o projeto com o seguinte comando dentro de $DEST \n\$ java com.ifrn.intro"
javac -d $DEST ./*.java


