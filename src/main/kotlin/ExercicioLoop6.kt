fun main(){
    var num: Double
    var soma: Double = 0.0
    var media: Double = 0.0
    var multiTres: Double = 0.0

    do{
        print("Digite um número diferente de 0: ")
        num = readLine()!!.toDouble()

        if (num != 0.0) {
            if(num % 3.0 == 0.0){
                multiTres++
                soma = soma + num

        }
            media = soma / multiTres
    }

}while (num!=0.0)
    println("\nA média dos mútiplos de 3 inseridos é $media.")
}