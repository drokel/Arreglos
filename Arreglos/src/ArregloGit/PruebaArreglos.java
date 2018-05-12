
package ArregloGit;


public class PruebaArreglos 
{
    public static void main(String[] args) 
    {
        /*
        int ArregloEntero[] = new int[10];
        ArregloEntero[0] = 1; //Asignamos en la posición 0 del arreglo el entero 1
        System.out.println(ArregloEntero[0]);
        System.out.println("-------------------");
        */
        int ArregloEntero2[] = {2,3,4,5,6,7,8,9,10,11}; //Asignamos todos los valores del arreglo con llaves
        // System.out.println(ArregloEntero2[0]);
        System.out.println("Imprimiendo Arreglo2");
        for(int j=0; j<10;j++)
        {
            System.out.println(ArregloEntero2[j]);
        }
        int[] ArregloEntero3 = new int[5];
        ArregloEntero3[0]=5;
        ArregloEntero3[1]=10;
        ArregloEntero3[2]=15;
        ArregloEntero3[3]=20;
        ArregloEntero3[4]=25;
        //System.out.println(ArregloEntero3[3]);
        System.out.println("----------------------");
        
        System.out.println("Imprimiendo Arreglo3");
        
        for(int i=0; i<5;i++)
        {
            //System.out.println(ArregloEntero3[i]);
            if(i%2!=0)
            {
                System.out.println("Valor de la posición del Arreglo Impar: "+ArregloEntero3[i]);
            }
        
        }
        System.out.println("---------------");
        int[] ArregloEntero4 = new int[20]; //Otra forma de declarar Arreglos
        
        for(int k=0;k<20;k++)
        {
            ArregloEntero4[k]=k*3; //Asigna valores de 3 en 3 al arreglo
            System.out.println(ArregloEntero4[k]);
        }
        System.out.println("-----------------");
        System.out.println("Impresion de impares dentro del arreglo");
        System.out.println("");
        
        for (int d=0; d<20; d++)
        {
            if(ArregloEntero4[d]%2 != 0)
                System.out.println("Contenido Impar: "+ArregloEntero4[d]);
            
            if(ArregloEntero4[d]%2 == 0)
                System.out.println("Contenido par: "+ArregloEntero4[d]);
        }
        
        System.out.println("---------------------");
        
        int[][] AregloBidimensional = new int[10][10];
        //LLenamos el arreglo
        int n=0;
        for(int i=0;i<10;i++)
        {
            
            for(int j=0;j<10;j++)
            {
                n+=1;
                AregloBidimensional[i][j] = n;            
            }
        }
        //Imprimimos el arreglo
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                System.out.print("\t" + AregloBidimensional[i][j]);            
            }
            System.out.println("");    
        }
        
        
            
    }
    
    
}
