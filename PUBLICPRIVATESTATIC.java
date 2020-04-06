
import java.util.Scanner;


public class PUBLICPRIVATESTATIC {
 /**
 * @param args the command line arguments
 */
 public static void main(String[] args) {
 Scanner Teclado = new Scanner(System.in);

int n,num,i,j;
System.out.print("Ingrese cantidad de nÃºmeros: ");
n = Teclado.nextInt();
int[] numeros = new int[n + 1];
for(i = 1; i <= n; i++)

{
System.out.print("Ingrese numero (" + i + ") : ");
numeros[i] = Teclado.nextInt();
}
for(i = 1; i <= n; i++)

{
for(j = i; j <= n; j++)
{
if(numeros[i] < numeros[j])
{
num = numeros[i];
numeros[i] = numeros[j];
numeros[j] = num;
}

}

}
System.out.println("\n Los numeros de mayor a menor son:");
for(i = 1; i <= n; i++)

{
System.out.println(numeros[i]);
}

}

}