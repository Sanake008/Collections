package Colls

import scala.collection.Set

//import scala.collection.mutable

object Collections 
{
  def main(args:Array[String])
  {
    /*
     * Set: 
     * son colecciones de tipo Iterables lo que quiere decir que no se 
     * pueden repetir elementos
     * + para añadir nuevos elementos al Set creando un nuevo Set
     * ++ para añadr un set al Set ya establecido creando un nuevo Set
     * -  para quitar un elemento al Set creando un nuevo Set
     * -- para quitar varios elementos al Set creando un nuevo Set
     * el metodo contains en los set recive como parametro el elemento
     * que se desea saber si esta contenido en el set y devolvera un esto nooo
     * boolean true en caso de que lo contenga y false en caso de que no
     * 
     * */     
    val unSet = Set(1,2,3,4)
    val otroSet = unSet + 5 + 6 + 7 + 8 + 8 + 8 - 2
    if(otroSet(10))
    {
      println("Contiene el elemento especificado")
    }
    else
    {
      println("No contiene el elemento especificado")
    }
    
    val masmas = unSet ++ Set(5,6,7,8,9)
    val menosmenos = unSet -- Set(1,2)
    
    println("Un set normal: " + unSet)
    println("Otro set añadiendo elemento a elemento con +: " + otroSet)
    println("Set sumandole otro set entero: " + masmas)
    println("Set restandole varios elementos: " + menosmenos)
     
    /*
     * Map colecciones clave valor donde las claves no pueden repetirse
     * las maneras en las que se puede declarae un Map son las siguientes:
     * Map(key -> value, key -> value....) o bien Map((key, value),(key, value....))
     * las operaciones fundamentales de un map se dividen en dos categorias
     * y son las siguientes:
     * 
     * 	Lookup operations
     * 	1- apply
     * 	2- get
     * 	3- getOrElse
     * 	4- contains
     * 	5- isDefinedAt
     * */
      
    val unMap = Map("x" -> 24, "y" -> 25, "z" -> 26, "t" -> 26) + "l" -> 29 
    val otroMap = Map(("x",24),("y",25),("z",26))+"esto" -> 30
    
    val agregado = unMap + "w" -> 27 + "o" -> 28
    
   
    println(unMap)
    println(otroMap)
    println(agregado)
   
    case class Person(name: String, age: Int)
    
    val person1 = new Person("Abraham", 28)
    val person2 = new Person("Paula", 25)
    val person3 = new Person("Maximo", 50)
    
    val personMap1 = Map(person1.name -> person1.age, person2.name -> person2.age,
        person3.name -> person3.age)
    
    val personMap1Other = Map((person1.name, person1.age),(person2.name, person2.age),
        (person3.name, person3.age))
        
    val personMap2 = Map(person1.age -> person1.name, person2.age -> person2.name,
        person3.age -> person3.name)
        
    val personMap2Other = Map((person1.age, person1.name),(person2.age, person2.name),
        (person3.age, person3.name))
        
    println(personMap1)
    println(personMap2)
    
    println(personMap1Other)
    println(personMap2Other)
    
    /*
     * Array es un tipo de coleccion en scala, estos arrays pueden ser de
     * tipo generico esto significa que puedes tener un Array[T] donde T
     * es un tipo de parametro o un tipo abstracto los scala Arrays son 
     * compatibles con secuencias
     * 
     * */
    
    val frutas = Array("Pera","Manzana","Naranja","Albaricoque")
    /*El metodo apply devuelve el valor de la pocicion que se le pase como
     * parametro 
     * 
     * otra manera de obtener un elemento por index que a su vez tambien 
     * es una llamada al metodo apply es de la siguiente manera
     * nombreArreglo(index del elemento)
     * 
     * */
    println(frutas.apply(0))
    println(frutas.apply(1))
    println(frutas(2))
    
    
    /* El metodo length devuelve el tamaño del array
     * El metodo isEmpty devuleve true si esta vacio y false si esta lleno
     * El metodo nonEmpty devuelve true si esta lleno y false si esta vacio
     * El metodo indexOf devuelve el indice del elemento que se le especifique
     * en caso de pasara como parametro un elemento que no existe devolvera -1
     * */
    
    println(frutas.indexOf("Pera"))
    
    /*
     * El metodo map ejecuta una funcion para cada uno de los elementos en la lista
     * regreando otra lista que almacena los resultados de la funcion para cada elemento
     * 
     * */
    
    
    val numeros = List(4,15,16,23,42)
    
    def cuadrado (x: Int): Int = x * x
    def fun(x: Int) = if(x > 2) Some(x) else None
    
    val numerossqr = numeros.map {e => cuadrado(e)} 
    val numerosalcuadradopordos = numerossqr.map(_.*(2))
    
    val res = numeros.map {num => fun(num)}
    
    println("Los numeros: " + numeros)
    println("Los numeros al cuadrado: " + numerossqr)
    println("Los numeros al cuadrado por 2: " + numerosalcuadradopordos)
    println("Los numeros despues de aplicar la funcion map: " + res)
    
    /*
     * La funcion flatten junta todos los elementos de una lista de listas en una sola lista
     * La funcion flatmap hace un map a cada una de las listas de la lista y les hace un flatten
     * cuando se tiene un lista de strings la funcion flatmap sirve por que es como si se tuviera un lista de listas
     * y aque los string son una lista de caracteres
     * */
    val n = List(List(1,2,6),List(2,3,5),List(5,7,1),List(4,8,3))
    val sublista = n.flatten
    val otrasublista = n.map{x:List[Int] => x.map{e => e * 2}}.flatten
    val conflatmap = n.flatMap{x: List[Int] => x.map{e => e * 2}}
    
    
    println("Esta es la lista normal: " + n)
    println("Esta es la lista con flatten: " + sublista)
    println("Esta es la lista en cuadrados: " + otrasublista)
    println("Esta es la lista con flat map: " + conflatmap)
    
    
    
  }
}