# TP4 VLille

Jean Debout Gatari  

## Objectif du TP

Ce TP a pour but:  
* Programmation de Jeu Pierre_Feuille-Ciseau
* Avec un ensemble de classes à placer dans la
* paquetage ```PFC``` et son sous packetage ```strategy```

Pour cela nous allons travailler sur les classes shape,Player,Game et interface Strategy avec classes strategies

## Compilation

#### Compilation des fichiers du Jeu Bataille Navale

On compiler afin de lancer le jeu;

pour compiler une classe qui se trouve dans un paquetage, il faut tenir compte du fait qu’a ce paquetage correspond un dossier.  Le nom du fichier à compiler reprend donc ce nom de dossier.  Le fichier à compiler n’est donc pas Une Classe.java mais MainPFC.java

La  classe MainPFC test  alors  compilée  ainsi  que  les  classes  dont  elle  dépend  et  le  résultat  de  lacompilation est rang ́ee dans le dossier classes que vous auriez creé,

```sh
$ javac pfc/MainPFC.java -d ../classes 
```
#### Compilation et executer les tests de bataille navale

Compilez toutes les classes de fichiers (classes shape,Player,Game et interface Strategy avec classes strategies ET tests  (en vous plaçant à la racine du projet et en upposant l’existence du dossier classes)

par example

```sh
$ javac -classpath test-1.7.jar tests/PlayerTest.java
```

## Exécution du programme

Avec  l’option-classpath de la commande java (cette option existe aussi pour javac et a le meme effet), on peut lancer le Jeu par la
commande dessous:

```sh
$ java -classpath classes pfc.MainPFC

```
#### g ́en ́erer le fichier.jar(sans les sources ni les docs)

Placez vous dans le dossierclasses.  Exécutez la commande :
```sh
$ jar cvf ../appli.jar example
```

#### Exécution des fichiers jar


Avec facilitation le lancement d’une application Java.  Pourcela il faut rajouter des informations à l’archive, ces informations sont définies dans un fichier particulier appele manifest.

Placez vous dans le dossier classes,  exécutez la commande 
x
```sh
$ jar cvfm ../appli.jar ../manifest-example
```
