package rocks.zipcode.io.assessment4.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe
{
    String[][] board = new String[3][3];

    public TicTacToe(String[][] board)
    {
        this.board = board;
    }

    public TicTacToe()
    {
        for(Integer i = 0; i < 3; i ++)
        {
            for(Integer k = 0; k < 3; k++)
            {
                board[i][k] = "";
            }
        }
    }

    public String[] getRow(Integer value)
    {
        return board[value];
    }

    public String[] getColumn(Integer value)
    {
        String[] output = new String[3];
        output[0] = board[0][value];
        output[1] = board[1][value];
        output[2] = board[2][value];

        return output;
    }

    public Boolean isRowHomogenous(Integer rowIndex)
    {
        String[] row = getRow(rowIndex);

        return row[0].equals(row[1]) && row[1].equals(row[2]);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex)
    {
        String[] col = getColumn(columnIndex);

        return col[0].equals(col[1]) && col[1].equals(col[2]);
    }

    public String getWinner()
    {
        if(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]))
        {
            return board[1][1];
        }
        else if(board[0][2].equals(board[1][1]) && board[2][0].equals(board[1][1]))
        {
            return board[1][1];
        }

        for(Integer i = 0; i < 3; i++)
        {
            if(isColumnHomogeneous(i))
            {
                return getColumn(i)[0];
            }
            else if(isRowHomogenous(i))
            {
                return getRow(i)[0];
            }
        }
        return "";
    }

    public String[][] getBoard() {
        return board;
    }
}
