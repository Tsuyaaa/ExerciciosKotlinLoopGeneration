fun main(){
    var cont = 1
    var idade: Int
    var genero: Int
    var comp: Int = 0
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

    while(cont<=150){
        println("\nPessoa $cont")
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
                print("\nQual o seu comportamento: ")
                comp = readLine()!!.toInt()

                when(comp){
                    1 -> fCalm++
                    2 -> fNerv++
                    3 -> fAgre++
                    else -> "Valor inválido"

                }
            }
            2 -> {
                print("\nDado os seguintes comportamentos: " +
                        "\n1. Calmo\n2. Nervoso\n3. Agressivo")
                print("\nQual o seu comportamento: ")
                comp = readLine()!!.toInt()

                when(comp){
                    1 -> mCalm++
                    2 -> mNerv++
                    3 -> mAgre++
                    else -> "Valor inválido"

                }
            }
            3 -> {
                print("\nDado os seguintes comportamentos: " +
                        "\n1. Calme\n2. Nervose\n3. Agressive")
                print("\nQual o seu comportamento: ")
                comp = readLine()!!.toInt()

                when(comp){
                    1 -> oCalm++
                    2 -> oNerv++
                    3 -> oAgre++
                    else -> "Valor inválido"

                }
            }
       }
    if(idade in 0..18 && comp == 1){
        menos18Calm++


    }else if(idade>=40 && comp==2){
        mais40Nerv++
    }


    }
    calmTotal = fCalm + mCalm + oCalm
    println("\nHá um total de $calmTotal pessoas calmas. São $fNerv o número de mulheres nervosas, " +
            "são $mAgre a quantidade de homens agressivo. " +
            "E outros gêneros, representam" +
            " $oCalm pessoas calmas.\nO número total de pessoas com menos de 18 anos " +
            "e calmas são $menos18Calm " +
            "e as pessoas com mais de 40 anos nervosas são $mais40Nerv.")


}