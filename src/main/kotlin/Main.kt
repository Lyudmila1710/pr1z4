fun main() {
        println("Введите первое число: ")
        val a= readln().toDouble()
        println("Введите второе число: ")
        val b=readln().toDouble()
        println("Введите символ операции: ")
        val c= readln()
        when(c){
            "+"-> println("Сумма $a и $b = ${a+b}")
            "-" -> println("Разноть $a и $b = ${a-b}")
            "*" -> println("Произведение $a и $b = ${a*b}")
            "/" -> println("Частное $a и $b = ${a/b} ")
        }
}