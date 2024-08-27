public class B
{
    //negyedik feladat
    /*
    public static void main(String[] args){
        System.out.println(args[0]);
    }
    */

    //ötödik feladat
    /*
    public static void main(String[] args){
        for (double i = 0; i < 4; i++){
            System.out.println((i+1)/2);
        }
        System.console().printf("Kiírtam 4 számot\n");
    }  
    */

   //hatodik feladat
   /*
   public static void main(String[] args){
    System.console().printf("Első szám?\n");
    String a = System.console().readLine();
    System.console().printf("Második szám?\n");
    String b = System.console().readLine();
    int aa = Integer.parseInt(a);
    int bb = Integer.parseInt(b);

    for (int i = aa+1; i<bb; i++){
        System.out.println((i/2));
    }
   }
   */

  //hetedik feladat
  /*
  public static void main(String[] args){
    if(args.length < 2 || args.length > 2){
        System.out.println("Nem megfelelő számú paraméter\n");
    }
    else{
    int aa = Integer.parseInt(args[0]);
    int bb = Integer.parseInt(args[1]);

    System.out.println("A két szám összege: " + (aa+bb));
    System.out.println("A két szám különbsége: " + (aa-bb));
    System.out.println("A két szám szorzata: " + (aa*bb));
    if(bb == 0){
        System.out.println("A nullával való osztás nem engedélyezett!\n");
    }
    else{
        System.out.println("A két szám hányadosa: " + ((double)aa/(double)bb));
        System.out.println("A két szám osztási maradéka: " + (aa%bb));
    }
    }
  }
  */

 //nyolcadik feladat
 /*
 public static void main(String[] args){
    System.console().printf("Add meg n-t!\n");
    String a = System.console().readLine();
    int aa = Integer.parseInt(a);
    int szamlalo = 1;
    if(aa < 0){
        System.console().printf("n-nek természetes számnak kell lennie!\n");
    }
    else if(aa == 0){
        System.console().printf("A faktoriális: 1!\n");
    }
    else{
        for(int i = aa; i > 0; i--){
            szamlalo = szamlalo*i;
        }
        System.console().printf("A faktoriális: %d!\n", szamlalo);
    }
 }
 */
}