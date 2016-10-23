import tictactoe._

object Game{
    def main(args: Array[String]) {
        var game = new Grid
        println("Game Begins")

        for (i <- Range(0,9).inclusive){
            if (i % 2 == 0){
                println("Player 1 ::::")
            } else {
                println("Player 2 ::::")
            }
            var piece = readLine("Play X or O: ...")
            println("X axis position")
            var x = readInt()

            println("Y axis position")
            var y = readInt()

            game.play(piece,x,y)
        }
    }
}
