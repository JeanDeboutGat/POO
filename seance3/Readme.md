# TP3 

Jean Debout GATARI


## Objectif du TP

Ce TP a pour but:  
* d'apprendre à écrire une classe
* d'apprendre à rédiger une documentation  
*  d'utiliser une méthodologie rigoureuse basée sur les tests unitaires

Pour cela nous allons étudier le cas de la gestion de velos au sein d'une station  
## Javadoc

Se placer à la racine du tp, puis exécuter la commande:

```sh
$ javadoc src/*.java -d docs
```

Ouvrir un navigateur et consulter le fichier docs/index.html

## Compilation

#### Compilation des fichiers de tests

Ces fichiers correspondent aux fichiers permettants de tester le code produit lors du tp.  
Il s'agit de tests unitaires, une représentation graphique de ces tests est rendue possible grace au fichier __test-1.7.jar__  
Se placer à la racine du tp, puis exécuter:

```sh
$ javac -classpath test-1.7.jar test/BikeTest.java
$ javac -classpath test-1.7.jar test/BikeStationTest.java
```
#### Compilation des fichiers du tp

Se placer à la racine du tp, puis exécuter:  
```sh
$ javac -d ./classes  src/*.java
```


## Exécution

#### Exécution des fichiers de tests

Pour tester Bike.java, se placer à la racine du projet, puis exécuter:
```sh
$ java -jar test-1.7.jar BikeTest
```

Pour tester BikeStation.java, se placer à la racine du projet, puis exécuter:
```sh
$ java -jar test-1.7.jar BikeStationTest
```

#### Exécution des fichiers du tp

Pour exécuter le fichier BikeStationMain:

```sh
$ cd classes
$ java BikeStationMain 1
```
Grace a cette commande, BikeStationMain est appelé avec l'argument 1 (ce qui a pour effet de renvoyer la représentation sous forme de chaine de caractère du velo a l'index 1)
