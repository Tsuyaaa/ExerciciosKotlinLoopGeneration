fun main(){
    var cont = 1
    var idade: Int
    var genero: Int
    var comp: Int
    var mCalm = 0
    var mNerv = 0
    var mAgre = 0
    var fCalm = 0
    var fNerv = 0
    var fAgre = 0
    var oCalm = 0
    var oNerv = 0
    var oAgre = 0
    var menos18 = 0
    var mais40 = 0
    var calmTotal = 0
    var menos18Calm = 0
    var mais40Nerv = 0

    while(cont<=4){
        println("Pessoa $cont")
        cont++
        print("Digite a sua idade: ")
        idade = readLine()!!.toInt()

    if(idade in 0..18){
        menos18++

    }else if(idade>=40){
        mais40++

    }
        println("\nDado os gêneros: \n1. Feminino\n2. Masculino \n3. Outros")
        print("Qual o seu gênero?:")
        genero = readLine()!!.toInt()

        when(genero){
            1 -> {
                print("\nDado os seguintes comportamentos: " +
                        "\n1. Calma\n2. Nervosa\n3. Agressiva")
                print("Qual o seu comportamento: ")
                comp = readLine()!!.toInt()

                when(comp){
                    1 -> fCalm++
                    2 -> fNerv++
                    3 -> fAgre++
                    else -> "Valor inválido"

                }
            }
            2 -> {
                print("Dado os seguintes comportamentos: " +
                        "\n1. Calmo\n2. Nervoso\n3. Agressivo")
                print("Qual o seu comportamento: ")
                comp = readLine()!!.toInt()

                when(comp){
                    1 -> mCalm++
                    2 -> mNerv++
                    3 -> mAgre++
                    else -> "Valor inválido"

                }
            }
            3 -> {
                print("Dado os seguintes comportamentos: " +
                        "\n1. Calme\n2. Nervose\n3. Agressive")
                print("Qual o seu comportamento: ")
                comp = readLine()!!.toInt()

                when(comp){
                    1 -> oCalm++
                    2 -> oNerv++
                    3 -> oAgre++
                    else -> "Valor inválido"

                }
            }
       }
    if(idade in 0..18){


    }


    }


}