import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SudokuSolver {
    static void displayBoard(String boardString) {
        String[] boardRows = { "", "", "", "", "", "", "", "", "" };
        char[] boardArray = boardString.toCharArray();
        for (int index = 0; index < boardString.length(); index++) {
            boardRows[index / 9] = boardRows[index / 9] + " " + boardArray[index];
            if (index % 9 == 2 || index % 9 == 5) {
                boardRows[index / 9] = boardRows[index / 9] + " |";
            }
        }
        System.out.println("-------------------------");
        for (int index = 0; index < 9; index++) {
            System.out.println("|" + boardRows[index] + " |");
            if (index == 2 || index == 5) {
                System.out.println("-------------------------");
            }
        }
        System.out.println("-------------------------");
    }

    static char[][] sudokuBoard(char[] board) {
        int rowCount = 0;
        char[][] boardDimension = new char[9][9];
        for (int i = 0; i < board.length; i++) {
            if (rowCount != 0 && rowCount % 9 == 0) {
                rowCount = 0;
            }
            boardDimension[i / 9][rowCount] = board[i];
            rowCount += 1;
        }
        return boardDimension;
    }

    static List<Character> isInRow(char[][] board, List<Character> possibleValue, int row) {
        for (int i = 0; i < 9; i++) {
          Character currentChar = board[row][i];
          if (possibleValue.contains(currentChar)) {
            possibleValue.remove(currentChar);
          }
        }
        return possibleValue;
      }

    static List<Character> isInCol(char[][] board, List<Character> possibleValue, int col) {
        for (int i = 0; i < 9; i++) {
          Character currentChar = board[i][col];
          if (possibleValue.contains(currentChar)) {
            possibleValue.remove(currentChar);
          }
        }
        return possibleValue;
      }
    
      static List<Character> isInBox(char[][] board, List<Character> possibleValue, int row, int col) {
        int rowNum = row - row % 3;
        int colNum = col - col % 3;
        for (int i = rowNum; i < rowNum + 3; i++) {
          for (int j = colNum; j < colNum + 3; j++) {
            Character currentChar = board[i][j];
            if (possibleValue.contains(currentChar)) {
              possibleValue.remove(currentChar);
            }
          }
        }
        return possibleValue;
      }

      static char[][] isOk(char[][] board, int row, int col, char value) {
        board[row][col] = value;
        return board;
      }

      static String solve(String boardString) {
        displayBoard(boardString);
        char[] board = boardString.toCharArray();
        char[][] sudokuBoard = sudokuBoard(board);
    
        Boolean isValueSolved = false;
        Character[] possibleValue = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        String returnValue = "";
    
        while (!isValueSolved) {
          int count = 0;
          for (int row = 0; row < sudokuBoard.length; row++) {
            for (int col = 0; col < sudokuBoard[row].length; col++) {
              List<Character> possibleValueList = new ArrayList<Character>(Arrays.asList(possibleValue));
              if (sudokuBoard[row][col] == '0') {
                count += 1;
                possibleValueList = isInRow(sudokuBoard, possibleValueList, row);
                possibleValueList = isInCol(sudokuBoard, possibleValueList, col);
                possibleValueList = isInBox(sudokuBoard, possibleValueList, row, col);
                if (possibleValueList.size() == 1) {
                  sudokuBoard = isOk(sudokuBoard, row, col, possibleValueList.get(0));
                  count -= 1;
                }
              }
            }
          }
    
          if (count == 0) {
            isValueSolved = !isValueSolved;
          }
        }
    
        for (int row = 0; row < sudokuBoard.length; row++) {
          for (int col = 0; col < sudokuBoard[row].length; col++) {
            returnValue += sudokuBoard[row][col];
          }
        }
        return returnValue;
      }

      public static void main(String[] args) {
        // Easy Mode
        String solution = solve("105802000090076405200400819019007306762083090000061050007600030430020501600308900");
        System.out.println(solution.equals("145892673893176425276435819519247386762583194384961752957614238438729561621358947"));

        // // Hard Mode
        // String solution = solve("400000805030000000000700000020000060000080400000010000000603070500200000104000000");
        // System.out.println(solution.equals("417369825632158947958724316825437169791586432346912758289643571573291684164875293"));
    }
}