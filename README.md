### API DE PRODUCTOS
Esta aplicacion genera una simple API Hecha con SpringBoot
Donde se podran registar productos y el ID se genera automaticamente
## COMO EJECUTARLO
Como requisito debes tener instalado maven
descarga el repostirio
'''bash
git clone https://github.com/koket987/PARCIAL1-ARSW.git
'''

luego ingresa a la carpeta

cd PARCIAL1-ARSW

Ahora instalamos el proyecto

mvn clean install

Y por ultimo ejecutamos springboot

mvn spring-boot:run

## PRUEBAS
Vamos ahora con las purebas en postman

## METODO POST

![image](https://github.com/user-attachments/assets/3c74d279-424e-4760-aa22-fad513cb5a6d)

Como se puede ver genera el producto y lo devuelve con un ID generado
(No devuelve el estado 201 CREATED)

## METODO GET

![image](https://github.com/user-attachments/assets/ed60ca3b-db4f-42a4-bdd2-e6cd2c74cdb5)

Como se ve en la imagen devuelve todos los productos creados junto a toda su descripcion

## METODO GET POR ID

![image](https://github.com/user-attachments/assets/0204dc2d-f53e-4674-bc39-596eadd0d2af)

Como se puede ver en la imagen solo devuelve un producto el que esta identificado con el ID 2
esto se Corrobora con la imagen anterior la cual tiene la misma descripcion


GRACIAS



