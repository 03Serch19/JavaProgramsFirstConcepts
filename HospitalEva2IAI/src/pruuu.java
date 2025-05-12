/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class pruuu {
     static int[][] residencialm;
        static int[][] residencialMetod(int cl,int fl,int[][]resideparame,int columnorigi,int filaorigi)
        {
            residencialm = new int[(cl+columnorigi)] [(fl+filaorigi)];
            for (int i=0; i<residencialm.GetLength(1);i++)
            {                         
                if (i <filaorigi) {
                    for (int j = 0; j < residencialm.GetLength(0); j++)
                    {
                        if (j < columnorigi)
                        {
                            residencialm[j, i] = resideparame[j, i];
                        }
                        else if (j >= columnorigi)
                        {
                            residencialm[j, i] = 0;
                        }
                    }

                } else if (i >=filaorigi)
                {
                    for (int j = 0; j < residencialm.GetLength(0); j++)
                    {
                        residencialm[j, i] = 0;
                    }

                }
            }
           
            return residencialm;
        }
        static void Main(string[] args)
        {
            int colum , fila ;
            Console.WriteLine("Crear complejo residencial");
            Console.WriteLine("ingrese cantidad de columnas del complejo residencial");
            colum = int.Parse(Console.ReadLine());
            Console.WriteLine("ingrese cantidad de filass del complejo residencial");
            fila= int.Parse(Console.ReadLine());          
            int[,] residencial = new int[colum, fila];
            bool ampliar = false, nueReser = false;
            for(int i = 0; i<residencial.GetLength(1); i++)
            {
                for (int j = 0; j < residencial.GetLength(0); j++)
                {
                    residencial[j, i] = 0;
                }
            }
            for (int i = 0; i < residencial.GetLength(1); i++)
            {
                for (int j = 0; j < residencial.GetLength(0); j++)
                {
                    Console.Write(residencial[j, i]+" ");
                }
                Console.WriteLine("");
            }
            int nFila,nColum;
            int casReserv = 0;
            int totalCasas = (colum*fila);
            int casVacias;
            int resiTemporal;
            int conToTalLLeno=0;
            do
            {
               
                Console.WriteLine("Ingrese el numero de fila donde desea reservar una vivienda");
                nFila = int.Parse(Console.ReadLine());
                Console.WriteLine("Ingrese el numero de columna donde desea reservar");
                nColum = int.Parse(Console.ReadLine());
                resiTemporal = 1;
                if (resiTemporal == 1 && residencial[nColum - 1, nFila - 1] == 1)
                    Console.WriteLine("Reserva fallida ... La casa ya esta reservada..");
                else
                {
                    residencial[nColum - 1, nFila - 1] = 1;
                    casReserv++;
                    Console.WriteLine("Reserva exitosaaaaaaa.......");
                }
                    for (int i = 0; i < residencial.GetLength(1); i++)
                 {
                    for (int j = 0; j < residencial.GetLength(0); j++)
                    {
                        Console.Write(residencial[j, i] + " ");
                        if (residencial[j, i] == 1)
                        {
                            conToTalLLeno++;
                        }                    
                    }
                    Console.WriteLine("");
                 }
      
                Console.WriteLine("La cantidad de casas reservadas es " + casReserv);
                casVacias = totalCasas - casReserv;
                Console.WriteLine("La cantidad de casas vacias es " + casVacias);
                Console.WriteLine("");
                if (conToTalLLeno == (residencial.GetLength(1)* residencial.GetLength(0)))
                {
                    Console.WriteLine("El complejo residencial esta reservado completamente");
                    Console.WriteLine("");
                    Console.WriteLine("Desea ampliar el complejo residencial?");
                    Console.WriteLine("");
                    conToTalLLeno = 0;
                    if (Console.ReadLine() == "si")
                    {
                        Console.WriteLine("Ingrese cuantas columnas mas");
                        int columnmas = int.Parse(Console.ReadLine());
                        Console.WriteLine("Ingrese cuantas filas mas");
                        int filasmas = int.Parse(Console.ReadLine());
                        residencial = residencialMetod(columnmas, filasmas, residencial, residencial.GetLength(0), residencial.GetLength(1));
                        for (int i = 0; i < residencial.GetLength(1); i++)
                        {
                            for (int j = 0; j < residencial.GetLength(0); j++)
                            {
                                Console.Write(residencial[j, i] + " ");
                            }
                            Console.WriteLine("");
                        }                 
                        totalCasas = (residencial.GetLength(0)) * (residencial.GetLength(1));
                    }
                    else { nueReser = true; }
                }
                else
                {
                    conToTalLLeno = 0;
                    Console.WriteLine("Desea reservar otra casa? ");
                    if (Console.ReadLine() != "si")
                    {
                        nueReser = true;
                    }
                }
              
            } while (!(nueReser));

          
         
        }
}
