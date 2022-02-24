fun main(){
    var par: Int = 0
    var impar: Int = 0

    for(i in 1..10){
        print("Insira o $i ° número: ")
        var num = readLine()!!.toDouble()

        if(num % 2.0 == 0.0) {
            par++

        }else{
            impar++
        }
    }
    print("\nHá um total de $par números pares e $impar números ímpares.")

}