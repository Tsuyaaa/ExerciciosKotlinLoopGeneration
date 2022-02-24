fun main(){
    var menos21: Int = 0
    var mais50: Int = 0
    var idade: Int = 0

    while(idade != -99){
        print("Digite a idade do indivíduo (caso deseje cancelar, digite '-99'): ")
        idade = readLine()!!.toInt()

        if(idade in 0..21){
            menos21++

        }else if(idade >= 50){
            mais50++

        }

    }
        print("\nHá um total de $menos21 pessoas com menos de 21 anos, e" +
                " há $mais50 com mais de 50 anos.")

}