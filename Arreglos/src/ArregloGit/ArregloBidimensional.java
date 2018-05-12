package ArregloGit;
public class ArregloBidimensional 
{
    public static void main(String[] args) 
    {
        int [][] Bi = new int[10][10];
        
        //llenamos el arreglo
        int n = 0;
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
                {
                    n = n+1;
                    Bi[i][j] = n;               
                }
            for(int k=0;k<10;k++)
                {
                    
                }
            for(int k=0;k<10;k--)
                {
                    
                }
            for(int k=0;k<10;k--)
                {
                    
                }
        }
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {

                System.out.print("\t" + Bi[i][j]); 
            }
            System.out.println("");
        }
    }
    
}
