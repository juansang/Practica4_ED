# Practica4_ED

## Objetivos
* Refactoring
* Git y GitHub
* Versionado semántico
* Markdown

## Pasos
1. Sube la Práctica3 a github como primera versión en la rama master.
2. Crea una rama nueva para desarrollo, y actualiza la versión.
3. Realiza 2 refactorizaciones.
4. Actualiza la rama master con la nueva versión estable.
5. Realiza 2 refactorizaciones más en la rama de desarrollo desde la
versión anterior.
6. Sube a máster lo anterior y actualiza la versión.

## Control de Versiones
- 1.0.0 : Proyecto inicial
- 1.1.0 : Copia de las clases de la Práctica 3
- 2.0.0 : Eliminación de la interfaz y sus dependencias
- 2.1.0 : Proyecto después de la primera refactorización ( Extract interfaz )
- 2.2.0 : Proyecto después de la segunda refactorización ( Move interfaz a nuevo paquete )
- 3.0.0 : Fusión de la rama master con la rama desarrollo
- 3.1.0 : Proyecto después de la tercera refactorización ( Rename edad de la clase Persona )
- 3.2.0 : Proyecto después de la cuarta refactorización ( Cambiar visibilidad atributos Mascota )
- 4.0.0 : Fusión de la rama master con la rama desarrollo

## Explicación
En un primer lugar, siguiendo la documentación aportada, el equipo ha hecho uso de Git para crear un repositorio de forma local en el cual ha añadido la Práctica 3, anteriormente realizada. Una vez configurado el repositorio de forma local, se ha creado otro repositorio en GitHub a partir de un push remoto.

Tras este primer paso y con el repositorio online listo, el equipo comenzó a realizar las acciones pertinentes, haciendo uso del versionado semántico para cada commit. Estas acciones consistieron en :

- Subir el proyecto al github.
- Copiar las clases del proyecto, de tal manera que se pueda acceder a ellas posteriormente.
- Eiminar la interfaz <<*iSonido*>> y todas sus dependencias ( Implements y @Override )
- Crear una nueva rama llamada desarrollo, que contiene una versión independiente de la rama master
- Se lleva a cabo la primera refactorización, que consiste en extraer la interfaz <<*iSonido*>> 
- A continuación se ha cerado un nuevo paquete "Interfaz" y se hace la segunda refactorización, donde se mueve la interfaz a este nuevo paquete.
- Volver a la rama master y fusionarlo con la rama desarrollo mediante merge, con lo que master se actualizará.
- De regreso en la rama desarrollo, se efectua la siguiente refactorización, donde se ha renombrado la variable edad de la clase Persona por la variable altura.
- La última refactorización, ha consistido en modificar la visibilidad de los atributos de la clase Mascota, cambiando esta visibilidad de private a public.
- Por último, se ha actualizado la rama master, con la última versión presente en la rama desarrollo despúes de llevar a cabo el merge.
