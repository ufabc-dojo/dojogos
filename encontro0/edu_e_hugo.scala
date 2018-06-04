object Jogo1 {
  def main(args: Array[String]) : Unit = {
    println("Digite seu nome, disgraça")
    var user = scala.io.StdIn.readLine()
    ptintln("Escolha uma das 3 dificuldades")
    var dificuldade = scala.io.StdIn.readLine()
    val rnd = scala.util.Random
    val log2 = (x :Int) => (scala.Math.log(x))/(scala.Math.log(2))
    val escolha = rnd.nextInt(32000)
    var aindaerrou = true
    var tentativas = 15

    while(aindaerrou && (tentativas > 0)){
      
      println(s"Voce tem $tentativas tentativas, $user . Escolha um numero: ")
      val numeroerrado = scala.io.StdIn.readLine().toInt
      tentativas -= 1
      if(numeroerrado > escolha){
        println("Muito Alto")
      }else if(numeroerrado < escolha){
        println("Muito baixo")
      }else{
        println(s"Voce não fez mais que sua obrigação, $user ")
        aindaerrou = false
        return 
      }
      
    }
    println(s"Você não tem vergonha, $user ?")
  }
}
