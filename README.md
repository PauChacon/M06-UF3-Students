# M06-UF3-Students

## PREGUNTES DE REFLEXIÓ

### 1.Afegiu un endpoint que cerqui per un camp de tipus String on feu servir regex. Afegiu el que calgui al servei, repositori, etc.



### 2.Què caracteritza una api reactiva com aquesta i què la fa diferent d’una api síncrona amb MVC com les treballades anteriorment?

Lo que caracteritza la api reactiva és que és asincrona utilitzant MONO i FLUX per que aixi ho sigui fa que no es bloqueji al rebre dades i es fan operacions ala base de dades. Amés és més escalable per si es vol fer un projecte gran.

Las diferencies entre aquesta i una api síncrona MVC, primer lo que hem parlat de que una és síncrona i la altre asíncrona, que ames les asíncrones son més escalables i soporta mes carrega, també les asíncrones no reben objectes directamente sino que reben FLUX i MONO pero de la forma que ho feiem MVC és més senzill.


### 3.Què signifiquen Mono i Flux? Per a què penseu que serveixen i per què són útils en aquest tipus de programació?

Son per gestionar dades de forma asíncrona, penso que MONO serveix per quan demanes un sol valor com un findbyid i el flux per quan son molts per ejemple un findAll.
Són uttils per aquets porgrames perque gestionen millor i no es bloquejan al rebrer moltes dades osigui que te millor rendiment i eficiencia.

### 4.Què és record? Un record utilitza getters i setters? Justifiqueu la resposta

Record és una clase similar a un POJO per encapsular dades, osigui serveix per fer que els dto no els hi escriguis lo tipic dels POJO queden molt mes nets.
No poden fer setters pero getters si. perque es inmutable osigui que no es poden modificar els seus valor despres de crear-lo.
