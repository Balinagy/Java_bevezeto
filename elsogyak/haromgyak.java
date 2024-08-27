
public class haromgyak{
    public static void main(String[] args){
        //lnko számítás minden argsra
        if(args.length < 2){
            System.out.println("Give more then 2 args");
        }
        else{
            long a = Long.parseLong(args[0]);
            long b = Long.parseLong(args[1]);
            long lnko;
            if(a>b)
            {
                lnko = b;
            }
            else
            {
                lnko = a;
            }
            
            boolean found = false;
            while(lnko > 1 && !found){
                if(a%lnko==0 && b%lnko==0){
                    found = true;
                }
                else{
                    lnko--;
                }
            }

            if(args.length>2){
                long helper;
                for(int i = 2; i < args.length; i++)
                {
                    if (lnko>Long.parseLong(args[i])){
                        helper=Long.parseLong(args[i]);
                    }
                    else
                    {
                        helper=lnko;
                    }
                    boolean foundhelper= false;
                    while(helper>1 && !foundhelper){
                        if(lnko%helper==0 && Long.parseLong(args[i])%helper==0){
                            foundhelper=true;
                        }
                        else{
                            helper--;
                        }
                    }
                    lnko=helper;
                }
            }
            System.out.println("LNKO is: "+lnko);
        }
    }
}