package cl.desafiolatam.desafiokotlin

fun main() {

    //3 imprimir nombre
    val nombre =  "Alejandro"
    //4 declarar 3 valores
    var num1 = 10
    var num2 = 20
    var num3 = 30
    var suma = num1 + num2 + num3

    // 6 declarar 1 variable string y  1 variable char
    var cadena : String
    cadena = "Arataka Reigen"
    var char = 'A'
    var largostring = "Tiene ${cadena.count()} caracteres"
    char = 'Z'

    //9 decalrar variable float explicito
    var flotexpli = 17F

    //10 asignar valor al float
    var valor : Float
    valor = 0.65f

    //11 valor maximo Byte y Short

    val byteMaximo = Byte.MAX_VALUE
    val shortMaximo = Short.MAX_VALUE

    //12 valor minimo de Int y Long

    val intMinimo = Int.MIN_VALUE
    val longminimo = Long.MIN_VALUE

    //13 declarar variante Boolean y imprimir su valor

    val valorBolaen : Boolean
    valorBolaen = true

//-----------------------------------------------------------------------------------



    //3 imprimir nombre
    println("Mi nombre es : $nombre")


    //5 suma 3 variable
    println("Suma de los tres valores = $suma")


    //8 Imprimir cantidad de caracteres de String y modificar el valor de char
    println("Largo Cadena $largostring")
    println("La letra es A y el valor nuevo es $char")

    //9 decalrar variable float explicito
    println("valor explicito del float $flotexpli")

    //10 asignar valor al float
    println("valor variable float es $valor")

    //11 imprimir valor maximo variable Byte y Short

    println("Valor Maximo de Byte es : $byteMaximo")
    println("valor maximo de Short es $shortMaximo")

    //12 imprimir valor minimo  variable Int y Long

    println("Valor minimo de Int es : $intMinimo")
    println("Valor minimo de Long es : $longminimo")

    //13 imprecion valor bolean
    println("Valor bolean es : $valorBolaen")


    //16 llamando las funciones Imprimir Parametros y Obteniendo iva
    imprimiendoParametros("alejandro","gato")

    obteniendoIva()


}

    //14 crear una funcion ImprimiendoParametros

    fun imprimiendoParametros(para1:String , para2:String){

       println("Largo parametros es : ${para1.count()+ para2.count()}" )
       // {cadena.count()}
    }

    //15 obteniendo Iva

    fun obteniendoIva (){

        val valorcompra = 1000
        var iva = 0.19

        val valoiva = valorcompra*iva

        println("valor iva es $valoiva")


    }