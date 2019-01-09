# Figuras
Api Rest que provee el resgitro y obtención de datos de figuras geometricas

## Endpoints

GET http://localhost:8080/  -> Devuelve todas las figuras registradas en el sistemas en formato Json

GET http://localhost:8080/0  -> Devuelve la figura registrada en el sistema en la posicion 0 (Primer figura registrada)

POST  http://localhost:8080/ -> Registro de figura. 


## Json de request Registro triangulo

{
"figuraType" : "triangulo",
"base" : 3.0,
"altura" : 5.0
}

## Json de response Registro triangulo

{
"tipoFigura":"Triangulo",
"base":3.0,
"altura":5.0,
"area":7.5
}


## Json de request Registro cuadrado

{
"figuraType" : "cuadrado",
"base" : 3.0,
"altura" : 5.0
}

## Json de response Registro cuadrado

{
"tipoFigura":"Cuadrado",
"base":3.0,
"altura":5.0,
"area":15.0
}

## Json de request Registro circulo

{
"figuraType" : "circulo",
"diametro" : 4.0
}

## Json de response Registro circulo

{
  "tipoFigura": "Circulo",
  "diametro": 4.0,
  "area": 12.566370614359172
}
