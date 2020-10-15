# WHITE COLLAR 

## Botiga de Quadres

### Objectius
- Aprendre a utilitzar Spring Data / JPA per a accés a diferents orígens de
  dades
  
### Descripció
Tenim una franquicia de botiga de quadres il·legals que fa veure que ven collarets blancs, per
això es diu “white collar”.  

Aquesta franquicia té varies botigues, cadascuna amb un nom i una capacitat màxima de
quadres (o collars^^). Hi ha quadres que tenen un nom d’autor i d’altres que són anònims.  

Això sí, tots tenen un nom, un preu i una data d’entrada (és la data del moment en el que
entra a la botiga).   

El client ens demana implementar una API amb Spring amb les següents
funcionalitats: 

- **Crear botiga**: li direm el nom i la capacitat 
```
POST /shops/
```
- **Llistar botigues**: retorna la llista de botigues amb el seu nom i la capacitat 
```
GET /shops/
```

- **Afegir quadre**: li donarem el nom del quadre i el del autor 
```
POST /shops/{ID}/pictures
```
- **Llistar els quadres de la botiga**   

```
GET /shops/{ID}/pictures
```
- **Incendiar quadres**: per si ve la policia, es poden eliminar tots els quadres de la botiga
sense deixar rastre 
```
DELETE /shops/{ID}/pictures
```

### NOTES
Has de tindre en compte els següents detalls de construcció:
- Dissenya la base de dades com a primer pas. Utilitza JPA per accedir-hi.
- Inclogu els scripts sql de creació de taules en el projecte, o, si ho prefereixes,
configura JPA per crear automàticament les taules a l'arrencar el microservicio
- Inclou en un directori de el projecte la col·lecció Postman per a les invocacions http
- Pot utilitzar el projecte SpringBootInitialDemo com a exemple d'estructura
- La configuració del projecte ha d'estar en un fitxer application.properties
- Per a consultes a mysql, utilitzeu MysqlWorkbench. Si ho prefereixes, també pots
utilitzar DataGrip, Dbeaver o altres.

### FASE 1
- Has de persistir les dades en una base de dades en memòria h2 (inclosa en Spring
boot)

### FASE 2
- Utilitza mysql per persistir les dades, en lloc de h2
- Ambdós orígens de dades hauran de modificar-se en application.properties.
