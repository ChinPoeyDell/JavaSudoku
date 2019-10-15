/**
 * TicTacToe
 */
public class TicTacToe {

    static String checkBoard(String board) {
        // your code
        char[] boardArray = board.toCharArray();
        displayBoard(boardArray);

        String[] rules = {
            "" + boardArray[0] + boardArray[1] + boardArray[2],
            "" + boardArray[3] + boardArray[4] + boardArray[5],
            "" + boardArray[6] + boardArray[7] + boardArray[8],
            "" + boardArray[0] + boardArray[3] + boardArray[6],
            "" + boardArray[1] + boardArray[4] + boardArray[7],
            "" + boardArray[2] + boardArray[5] + boardArray[8],
            "" + boardArray[0] + boardArray[4] + boardArray[8],
            "" + boardArray[2] + boardArray[4] + boardArray[6]
        };

        for(int i = 0; i < rules.length; i ++){
            String row = rules[i];
            if(row.equals("XXX") ){
                return "X";
            } else if (row.equals("OOO")){
                return "O";
            }
        }
        
        if(board.contains("-")){
            return "incomplete";
        } else {
            return "draw";
        }
    }

        static void displayBoard(char[] boardArray){
           String[] rows = {"|","|","|"};
           
           for(int i = 0; i < boardArray.length; i ++){
               rows[i/3] += " " + boardArray[i] + " |";
           }

           for(String row: rows){
               System.out.println(row);
           }
        }
        // String row = "|";

        // for(int i = 0; i < boardArray.length; i ++){
        //     row += " " + boardArray[i] + " |";
        //     if(i == 2 || i == 5 || i == 8){
        //         System.out.println(row);
        //         row = "|";
        //     }
        // }

        //another method
        // for(int i=0; i < boardArray.length; i++){
        //     row[i/3] += " " + boardArray[i] + " |";
        // }

        // for(String row: rows){
        //     System.out.println(row);
        // }

        // return "";
    //   }

      
    
      public static void main(String[] args) {
        // row
        System.out.println(checkBoard("XXX-O-O-O").equals("X"));
        // col
        System.out.println(checkBoard("OXXOX-O--").equals("O"));
        // diagonal
        System.out.println(checkBoard("XO--XO-OX").equals("X"));
        // draw
        System.out.println(checkBoard("XOXOXOOXO").equals("draw"));
        //incompleted
        System.out.println(checkBoard("XO-------").equals("incomplete"));
      }
    
}