package tictactoe{

    class Cell(var entry:String = "") {
        //set the value of the cell to either X or O
        def set(e:String):String = {
            if (e == "X" || e == "O"){
                entry = e
                entry
            } else "invalid move"
        }
    }

    class Grid extends Cell {
        var a = 4
        //create a grid full of cells
        var grid = Vector(
            Vector(new Cell, new Cell, new Cell),
            Vector(new Cell, new Cell, new Cell),
            Vector(new Cell, new Cell, new Cell)
        )

        //define the play method
        def play(e:String, x:Int, y:Int):Unit = {
            if (x < 0 || x > 2 || y <0 || y >2){
                println("Invalid Cell, Play again")
            } else if (!isEmpty(grid(x)(y).entry)){
                println("Oh! c'mmon someone've played there before")
            }
            else {
                grid(x)(y).set(e)
                println(e + " is played in column " + x + ", " + y)
            }
            winGame
        }

        //check if the cell is empty
        def isEmpty(cell_value:String):Boolean = {
            var entry = cell_value
            entry == ""
        }

        def winGame():Unit = {
            var pt1 = grid(0)(0).entry; var pt2 = grid(0)(1).entry; var pt3 = grid(0)(2).entry
            var pt4 = grid(1)(0).entry; var pt5 = grid(1)(1).entry; var pt6 = grid(1)(2).entry
            var pt7 = grid(2)(0).entry; var pt8 = grid(2)(1).entry; var pt9 = grid(2)(2).entry

            if (((pt1 == pt2) && (pt2 == pt3) && pt1 != "") || ((pt4 == pt5) && (pt5 == pt6) && pt4 != "") || ((pt6 == pt7) && (pt7 == pt8) && pt6 != "")){
                println("")
                println("========================")
                println("player wins")
                System.exit(1)
            } else if (((pt1 == pt4) && (pt4 == pt7) && pt1 != "") || ((pt2 == pt5) && (pt5 == pt8) && pt2 != "") || ((pt3 == pt6) && (pt6 == pt9) && pt3 != "")){
                println("")
                println("========================")
                println("player wins")
                System.exit(1)
            } else if (((pt1 == pt5) && (pt5 == pt9) && pt1 != "") || ((pt3 == pt5) && (pt5 == p78) && pt3 != "") ){ 
                println("")
                println("========================")
                println("player wins")
                System.exit(1)
            } else {
                println("")
            }
        }

    }

}