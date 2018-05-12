package ArregloGit;

public class ArregloEspiral 
{
    public static void main(String[] args) 
    {
        int [][] arregloEntero = new int[10][10];
        int n = 1;
        for(int x=0;x<=5;x++)
        {
            for(int y=x;y<=9-x;y++)
            {
                arregloEntero[x][y]=n;
                n++;
            }
        }
        for(int x=1;x<=5;x++)
        {
            for(int y=x;y<=10-x;y++)
            {
                arregloEntero[y][10-x]=n;
                n++;
            }
        }
        
        //Impresion matriz
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                System.out.print("\t" + arregloEntero[i][j]);            
            }
            System.out.println("");    
        }
    }
}
