### les noms des membres du binômes
-------------------------------

Jean Debout Gatari

### Description du TP et ses objectifs
--------------------------------------
L'objectif de ce TP est d'implémenter le programme pour la gestion des locations des véhicules.


De plus on creation de certains classe doit integrer la notion d'heritage au but d'optimiser les codes.

#### N.B:

Pour compiler le programme et exécution de notre programme, vous devez d’abord vous assurer que vous vous trouvez dans le répertoire principal du travail.

Pour commancer recupérer le projet par la commande suivante placez vous dans le dossier jean_poo/TP7

```console
git clone https://https://gitlab-etu.fil.univ-lille1.fr/gatari/jean_poo.git
```

### Comment génerer et consulter la documentation
-------------------------------------------------

Pour générer la documentation, nous utilisons la commande javadoc suivi par la classe pour la quelle on veut générer la documentation et on ajoute l'argument -d suivi du nom du dossier pour préciser ou on va mettre notre documentation

#### Commande utiliser pour génerer la doc :
```console
make docs
```

#### Pour la consultation de la documentation

pour consulter la documentation, il suffit d'ouvrir dans le navigateur le fichier index.html du dossier de docs généré par javadoc.

```console
xdg-open docs/index.html
```

Ouvrir la doc avec firefox:
```console
firefox docs/index.html
```

Ouvrir la doc avec Google Chrome:
```console
google-chrome docs/index.html
```

### Comment compiler les classes du projet
------------------------------------------

##### Compilation de tous les classes
Pour compiler les différentes classes on réalise la commande

```console
make classes
```


### Comment compiler et exécuter les tests
------------------------------------------
Pour compiler les classes de tests et exécuter les tests JUnit4 avec une fenêtre graphique, on utilise la commande :

```console
make tests
```


### Comment  exécuter le programme (avec les exemples)
------------------------------------------------------

Pour commencer notre programme, vous devez d'abord vous assurer que tous les fichiers nécessaires sont compilés.

##### Compilation et création du fichier jar
```console
make classes
```

et puis création du fichier jar
```console
make jar
```

### Exemples du lancement du programme:

```console
java -jar rental.jar
```

### Nettoyer le répertoire de travail

Pour nettoyer le répertoire de travail rental on utilise la commande :
`make clean`

Elle a pour effet de supprimer les fichiers temporaires, les fichiers compilés .class, l(es) archive(s) jar (de ce projet, on conserve test-1.7.jar pour les tests) et la documentation qui peuvent être générés comme vu précedemment.

