## Description

Projet jeu vidéo de type "runner" (Mario Bros, Sonic...).

## Structure

Le dossier de travail contient différents dossiers :

- `src`: contient les sources (runner : codes, pictures : ressources externes type image)
- `lib`: contient les librairies JavaFX nécessaires à l'execution du code
- `bin`: contient les sorties des fichiers java
- `.vscode`: contient les fichiers de configurations. 

## A noter

il faut ajouter la ligne suivante dans le fichier .vscode/launch.json :
"vmArgs": "--module-path <path/to/javafx/lib> --add-modules javafx.controls,javafx.fxml"

