# M06-UF3-Students

## PROBES SWAGGER

### GetAll
Aqui fa un select de tota la base de dades
![image](https://github.com/user-attachments/assets/d3c2bfa0-ba2f-4e59-8052-4e8ab108db82)

### SelectById
Aqui busca per un estudiant en concret per la seva id
![image](https://github.com/user-attachments/assets/49a31ec9-3346-40c9-9fa1-fc20d289b3d3)

### SelectByName
Aqui el que busca es un estudiant per el seu nom pero no cal que sigui exactement el correcte osigui que si buscas "Josep" i poses "Jos" et retornara Joseps, Joses, Jose Marias, Joselitos etc
![image](https://github.com/user-attachments/assets/d1774a0e-0533-4b69-bb7a-708aba623cfa)

### Delete
Borra estudiant per id
![image](https://github.com/user-attachments/assets/df4c64c6-d5d9-4b6d-9b6d-9025690622f2)
comprobació de que no existeix, mateixa id pero ja no el troba:
![image](https://github.com/user-attachments/assets/bb5a9742-b719-4d54-b3b3-7f785446fc8a)

### INSERT
insert de student
![image](https://github.com/user-attachments/assets/0527ea52-a5a7-44e7-90a0-f30bd873fd82)
![image](https://github.com/user-attachments/assets/4d356b71-a32e-43d2-9d1c-542db8837831)

### Update
![image](https://github.com/user-attachments/assets/22083976-655b-489b-b655-97eddbad627d)
![image](https://github.com/user-attachments/assets/54dcbe5a-7d28-4eac-93ea-f1ff9624b55f)




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
