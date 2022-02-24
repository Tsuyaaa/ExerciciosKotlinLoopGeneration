fun main(){
    var num: Double
    var soma: Double = 0.0

    do{
        print("Digite um número qualquer: ")
        num = readLine()!!.toDouble()

        soma=soma + num

        println("\nVocê deseja continua?\nEm caso negativo, digite 0.")


    }while(num != 0.0)
        print("\nOs números inseridos totalizam $soma")

}