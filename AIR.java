import java.util.*;
import java.text.*;
import java.time.format.DateTimeFormatter; 
import java.time.LocalDateTime; 

class AIR//starting class
{
    // Create an array of 12 seats, 6 window and 6 aisle.
    int seats[] = new int[12],seatnumber;
    String from="",to="",email="",num="";//declaring variables
    int date,month,year,x,cost;
    char c;
    String name[]=new String[50];
    String age[]=new String[50];
    char gen[]=new char[50];
    
    void input()//starting function
    {
        Scanner Sc=new Scanner (System.in); 
        x=0;
        //String DATE[]=new String[6];
        int i,l,z;
        char m,ch,k; //declaring variables               
        System.out.println("*** Airlines Ticket Booking System ***");
        do//running loop
        {
            l=0;
            outerloop:
            do
            {
                z=0;
                System.out.print("\nPassenger's Name:");
                name[x]=Sc.nextLine();//accepting values
                l=name[x].length();
                for(i=0;i<l;i++)
                {
                    k=name[x].charAt(i);
                    if(Character.isDigit(k))
                    z++;
                }
                if(z==0)
                break outerloop;
                else   
                {    
                    System.out.println("Sorry! You have entered an invalid name. Passenger Name must only have letters.");
                    System.out.println("Please Enter Name Again. \nName:");
                }
            }
             while(true);
            
            outerloop:
            do
            {
                do
                {
                    System.out.print("Enter AGE:");
                    age[x]=Sc.next();//accepting values
                    l=age[x].length();
                    z=0;
                    for(i=0;i<l;i++)
                    {
                        ch=age[x].charAt(i);
                        if(Character.isLetter(ch))
                        z++;
                    }
                    if(z==0)
                    break;
                    else
                    {
                        System.out.println("Error! Age Should be in NUMBER \nPlease Re-Enter:\n");
                       
                    }
                }
                while(true);
                z=Integer.valueOf(age[x]);
                do//running loop
                {   
                
                    if(z<=100)
                    break outerloop;
                    else if(z>=100) 
                    {
                        System.out.println("Sorry! Passenger can't be more than 150 years of age. \nPlease Re-Enter:\n"); 
                        System.out.print("Enter AGE:");
                        age[x]=Sc.next();//accepting values
                        z=Integer.valueOf(age[x]);
                    }
                }//closing loop
                while(true);
            }
            while(true);
            System.out.println("Enter Gender: Male[M]/Female[F]/Others[N]");
            gen[x]=Sc.next().charAt(0);//accepting values
            innerloop:
            do//running loop
            {                
                if(gen[x]=='M'||gen[x]=='m'||gen[x]=='F'||gen[x]=='f'||gen[x]=='N'||gen[x]=='n')
                break innerloop;
                else if(gen[x]!='M'||gen[x]!='m'||gen[x]!='F'||gen[x]!='f'||gen[x]!='N'||gen[x]!='n') 
                {
                    System.out.println("Sorry!You have entered an invalid character"); 
                    System.out.println("Please enter a valid character from the above list");
                    gen[x]=Sc.next().charAt(0);//accepting values
                }
            }//closing loop
            while(true);
            System.out.println("Any more Passengers(y/n)");
            m=Sc.next().charAt(0);//accepting values
            do//running loop
            {
                if(m=='Y'||m=='y'||m=='N'||m=='n')

                break;
               else
                {
                    System.out.println("Sorry!You have entered an invalid character"); 
                    System.out.println("Please enter a valid character from the above list");
                    m=Sc.next().charAt(0);
                }
            }
            while(true);
            if(m=='Y'||m=='y')
            x++;
        }
        while(m=='y');
        
        System.out.println("Enter the starting point and the destination. Choose from the following cities");
        System.out.println("DELHI    : DEL");//printing statement
        System.out.println("MUMBAI   : BOM");
        System.out.println("BENGALURU: BLR");
        System.out.println("KOLKATA  : CCU");
        System.out.println("HYDERABAD: HYD");  
        from=Sc.next();//accepting values
        from=from.toUpperCase();
        to=Sc.next();
        to=to.toUpperCase();
       
        do//running loop
        {
            if(from.equals(to))
            {
                System.out.println("Sorry! You have entered a wrong starting point and destination.");
                System.out.println("Please enter a valid starting point and destination");
                to=Sc.next();//accepting values
                to=to.toUpperCase();
                from=Sc.next();
                from=from.toUpperCase();
            }
            else
            break;
        }
        while(true);        
        do//running loop
        {
            if (from.equals("DELHI")||from.equals("DEL")||from.equals("MUMBAI")||from.equals("BOM")||from.equals("BENGALURU")||from.equals("BLR")||from.equals("KOLKATA")||from.equals("CCU")||from.equals("HYDERABAD")||from.equals("HYD"))
            break;
            else
            {
                System.out.println("Sorry! You have entered a wrong starting point.");
                System.out.println("Please enter a valid starting point");
                from=Sc.next();
                from=from.toUpperCase();
            }
        }
        while(true);
        do//running loop
        {
            if(to.equals("DELHI")||to.equals("DEL")||to.equals("MUMBAI")||to.equals("BOM")||to.equals("BENGALURU")||to.equals("BLR")||to.equals("KOLKATA")||to.equals("CCU")||to.equals("HYDERABAD")||to.equals("HYD"))
            break;
            else
            {
                System.out.println("Sorry! You have entered a wrong destination.");
                System.out.println("Please enter a valid destination");
                to=Sc.next();
                to=to.toUpperCase();
            }
        }
        while(true);
  
        System.out.println("Enter the class");//printing statement
        System.out.println("Press 1 for First Class");
        System.out.println("Press 2 for Business class");
        System.out.println("Press 3 for Economic Class");
        System.out.println("Enter your choice");
        c=Sc.next().charAt(0);
                
        do//running loop
        {
            if(c=='1'||c=='2'||c=='3')
                break;
            else if(c!='1'||c!='2'||c!='3') 
            {
                System.out.println("Sorry! You have entered an invalid choice");
                System.out.println("Please enter a valid choice from the list given above");
                c=Sc.next().charAt(0);
            }
        }
        while(true);
        
        switch(from)//starting switch case
        {
             case "DELHI":
             case "DEL" :
                 if(to.equals("MUMBAI")||to.equals("BOM"))
                 {
                     if(c=='1')
                     cost=75000;
                     else if(c=='2')
                     cost=20000;
                     else if(c=='3')
                     cost=6000;
                 }
                 else if(to.equals("BENGALURU")||to.equals("BLR"))
                 {
                     if(c=='1')
                     cost=90000;
                     else if(c=='2')
                     cost=15000;
                     else if(c=='3')
                     cost=6000;
                 } 
                 else if(to.equals("KOLKATA")||to.equals("CCU"))
                 {
                     if(c=='1')
                     cost=55000;
                     else if(c=='2')
                     cost=18000;
                     else if(c=='3')
                     cost=5500;
                 }
                 else if(to.equals("HYDERABAD")||to.equals("HYD"))
                 {
                     if(c=='1')
                     cost=150000;
                     else if(c=='2')
                     cost=20000;
                     else if(c=='3')
                     cost=6500;
                 }
                 break;
                 
             case "MUMBAI":
             case "BOM": 
                 if(to.equals("DELHI")||to.equals("DEL"))
                 {
                     if(c=='1')
                     cost=75000;
                     else if(c=='2')
                     cost=20000;
                     else if(c=='3')
                     cost=6000;
                 }
                 else if(to.equals("BENGALURU")||to.equals("BLR"))
                 {
                     if(c=='1')
                     cost=55000;
                     else if(c=='2')
                     cost=12000;
                     else if(c=='3')
                     cost=5000;
                 }
                 else if(to.equals("KOLKATA")||to.equals("CCU"))
                 {
                     if(c=='1')
                     cost=90000;
                     else if(c=='2')
                     cost=25000;
                     else if(c=='3')
                     cost=7000;
                 }
                 else if(to.equals("HYDERABAD")||to.equals("HYD"))
                 {
                     if(c=='1')
                     cost=50000;
                     else if(c=='2')
                     cost=12500;
                     else if(c=='3')
                     cost=6000;
                 }
                 break;
                 
             case "BENGALURU":
             case "BLR":
                 if (to.equals("DELHI")||to.equals("DEL"))
                 {
                     if(c=='1')
                     cost=100000;
                     else if(c=='2')
                     cost=25000;
                     else if(c=='3')
                     cost=6000;
                 }
                 else if(to.equals("MUMBAI")||to.equals("BOM"))
                 {
                     if(c=='1')
                     cost=55000;
                     else if(c=='2')
                     cost=15000;
                     else if(c=='3')
                     cost=5000;
                 }
                 else if(to.equals("KOLKATA")||to.equals("CCU"))
                 {
                     if(c=='1')
                     cost=95000;
                     else if(c=='2')
                     cost=20000;
                     else if(c=='3')
                     cost=6000;
                 }
                 else if(to.equals("HYDERABAD")||to.equals("HYD"))
                 {
                     if(c=='1')
                     cost=50000;
                     else if(c=='2')
                     cost=10000;
                     else if(c=='3')
                     cost=2000;
                 }
                 break;
                 
             case "KOLKATA":
             case "CCU":
                 if (to.equals("DELHI")||to.equals("DEL"))
                 {
                     if(c=='1')
                     cost=55000;
                     else if(c=='2')
                     cost=18000;
                     else if(c=='3')
                     cost=5500;
                 }
                 else if(to.equals("MUMBAI")||to.equals("BOM"))
                 {
                     if(c=='1')
                     cost=90000;
                     else if(c=='2')
                     cost=30000;
                     else if(c=='3')
                     cost=7000;
                 }
                 else if(to.equals("BENGALURU")||to.equals("BLR"))
                 {
                     if(c=='1')
                     cost=95000;
                     else if(c=='2')
                     cost=25000;
                     else if(c=='3')
                     cost=6500;
                 }
                 else if(to.equals("HYDERABAD")||to.equals("HYD"))
                 {
                     if(c=='1')
                     cost=85000;
                     else if(c=='2')
                     cost=30000;
                     else if(c=='3')
                     cost=7500;
                 }
                 break;
                 
             case "HYDERABAD":
             case "HYD":
                 if (to.equals("DELHI")||to.equals("DEL"))
                 {
                     if(c=='1')
                     cost=98000;
                     else if(c=='2')
                     cost=25000;
                     else if(c=='3')
                     cost=5500;
                 }
                 else if(to.equals("MUMBAI")||to.equals("BOM"))
                 {
                     if(c=='1')
                     cost=50000;
                     else if(c=='2')
                     cost=12500;
                     else if(c=='3')
                     cost=6500;
                 }
                     
                 else if(to.equals("BENGALURU")||to.equals("BLR"))
                 {
                     if(c=='1')
                     cost=50000;
                     else if(c=='2')
                     cost=15000;
                     else if(c=='3')
                     cost=2000;
                 }
                 else if(to.equals("KOLKATA")||to.equals("CCU"))
                 {
                     if(c=='1')
                     cost=85000;
                     else if(c=='2')
                     cost=30000;
                     else if(c=='3')
                     cost=5000;
                 }
                 break;
        } 
        
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      //Scanner Sc = new Scanner(System.in);
      Date date1=new Date();
      System.out.println("Today's Date :"+sdf.format(date1));
            
      System.out.print("Enter Journey Date: [dd mm yyyy]");
      date=Sc.nextInt();//accepting values
      month=Sc.nextInt(); 
      year=Sc.nextInt();
      
        
        do//running loop
        {
            if(year<18 && year >20||year<2018 && year>2020)
            {
                System.out.println("Invalid Year!!..Please Enter Year between [2018-2020]");
                date=Sc.nextInt();
            }        
                else 
                break;
        }//closing loop
        while(true);
        do//running loop
        {
            if(month<1||month>12)
            {
  
              System.out.println("Invalid Month!!..Please Enter Month between [01 - 12]");
              month=Sc.nextInt();
            }
            else
            break;
        }//closing loop
        while(true);
            switch(month)//running loop
            {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:innerloop:
                do//starting loop
                {
                    if(date>=1 && date <=31)
                    break innerloop;
                    else if(date<1 || date>31)
                    {
    
		    System.out.println("Invalid Month Date !!..Please Enter Date between [01 - 31]");
                    date=Sc.nextInt();
                    }     
                }//closing loop
                while(true);
                break;
                
                case 4:
                case 6:
                case 9:
                case 11:innerloop:
                do//starting loop
                {
                    if(date>=1 && date<=30)
                    break innerloop;
                    else if(date<1 || date>30)
                    {
  		        System.out.println("Invalid Month Date !!..Please Enter Date between [01 - 30]");
                        date=Sc.nextInt();
                    }
                }//closing loop
                while(true);
                break;
                
                case 2:
                    if(year%4==0)
                    {
                        innerloop:
                           do//starting loop
                           {
                               if(date>=1 && date<=29)
                               break innerloop;
                               else if(date<1 || date>29)
                               {
   		    		   System.out.println("Invalid Month Date !!..Please Enter Date between [01 - 29]");
                                   date=Sc.nextInt();
                               }  
                           }//closing loop
                           while(true);
                    }
                    else
                    {
                        innerloop:
                        do//starting loop
                        {
                            if(date>=1 && date<=28)
                            break innerloop;
                            else if(date<1 && date>28)
                            {                           
  		    		System.out.println("Invalid Month Date !!..Please Enter Date between [01 - 28]");
                                date=Sc.nextInt();
                            }
                       }//closing loop
                       while(true);            
                    }  
                    break;
      
              }
        do
        {
            System.out.println("Enter your Mobile Number");//printing statement
            num=Sc.next();
            l=num.length();
            z=0;
            for(i=0;i<l;i++)
            {
                k=num.charAt(i);
                if(Character.isDigit(k))
                z++;
            }
            if(z==l && l==10)
            break;
            else
            {
                System.out.println("Invalid Number.Please Enter 10 digit Mobile Number");
                num=Sc.next();
            }
        }
        while(true);
        
        System.out.println("Enter Email ID :");//printing statement
        email=Sc.next();
        email=email+" ";
        l=email.length();
        z=0;
        
        do//starting loop
        {
            for(i=0;i<l;i++)//starting innerloop
            {
                ch=email.charAt(i);
                if(ch=='@')
                z++;
            }//closing innerloop
            String S1=email.substring((l-5),(l-1));
                if(S1.equals(".com") && z>=1)
                break;
                else
                {
                    System.out.println("Invalid Email-ID !!..Please Check for '@' and '.com' ");
                    System.out.println("Please enter a valid email address");
                    email=Sc.next();
                    email=email+" ";
                    z=0;
                }                 
            }//closing loop
        while(true);
    }//closing function
    
    int seat() // starting function
    {
        Scanner Sc = new Scanner(System.in);
        int i,j,seatnumber=0;//declaring variables
        char choice = '1';
        for(j=0;j<=x;j++)//running loop
        {
            for ( i = 0; i < 12; i++) //running loop
            seats[i] = 0; 
          
            // Ask user for a window or an aisle seat and store their coice.
            System.out.print("Please enter 1 for Window, 2 for Aisle: ");
            System.out.print("Choice:");
            choice = Sc.next().charAt(0);
            do
            {
                if(choice=='1'||choice=='2')
                break;
                else
                {
                    System.out.println("You have entered an invalid choice");
                    System.out.print("Please enter 1 for Window, 2 for Aisle: ");
                    System.out.print("Choice:");
                    choice = Sc.next().charAt(0);
                }
            }
            while(true);
            seatnumber = 0;
            // If they chose a window seat, attempt to book it.
            if (choice == '1') 
            {
                seatnumber = Window();
                // No window seats available, try booking an aisle seat for them instead.
                if (seatnumber == -1) 
                {
                    seatnumber = Aisle();
                    if (seatnumber != -1) 
                    {
                        System.out.println("Sorry, we were not able to book a window seat. But do have an Aisle seat.");
                        display(seatnumber,j);
                    }
                }
                else 
                {
                    // Booking a window seat was successful.
                    System.out.println("You are in luck, we have a window seat available!");
                    display(seatnumber,j);
                }
            }
            else if (choice == '2') 
            {
                // If they chose booking an isle, check to see if it is available.
                seatnumber = Aisle();
                // If not available, see if we have window seats available.
                if (seatnumber == -1) 
                {
                    seatnumber = Window();
                    if (seatnumber != -1) 
                    {
                        System.out.println("Sorry, we were not able to book an aisle seat. But do have a window seat.");
                        display(seatnumber,j);
                    }
                }
                else 
                {
                    // Booking an aisle seat was successful.
                    System.out.println("You are in luck, we have an aisle seat available!");
                    display(seatnumber,j);
                }
            }
            // No window or aisle seats were available. 
            if (seatnumber == -1) 
            {
                System.out.println("We are sorry, there are no window or aisle seats available.");
                System.out.println();
            }
        }//ending loop
        bill(j);
        return seatnumber;       
    }//closing function
 
    // This function checks for window seats and returns seat number or -1 if full.
    int Window() //starting function
    {
        int i;
        for (i = 0; i < 6; i++) //running loop
        {
            if (seats[i] == 0) 
            {
                seats[i] = 1;
                return i + 1;
            }
        }// closing loop
        return -1;
    }//closing function

    // This function checks to see if aisle seats were available, -1 if full.
    int Aisle() //starting function
    {
        int i;
        for ( i = 6; i < 12; i++) //running loop
        {
            if (seats[i] == 0) 
            {
                seats[i] = 1;
                return i + 1;
            }
        }//closing loop
        return -1;
    }//closing function

    void display(int seatnumber,int j)//starting function
    {
        System.out.println("\n");//printing statement
        System.out.println("_____________________________________________________________________");
        System.out.println();
        System.out.println("=====================================================================");        
        System.out.println("HAPPY JOURNEY");
        System.out.println("BOARDING PASS :");
        if(c=='1')
        System.out.println("Class: First Class");
        else if(c=='2')
        System.out.println("Class: Business Class");
        else if(c=='3')
        System.out.println("Class: Economic Class");
            System.out.print("Name of Passenger: ");
            if(gen[j]=='M'||gen[j]=='m')
            System.out.print("Mr. ");
            else if(gen[j]=='F'||gen[j]=='f')
            System.out.print("Ms. ");
            System.out.println(name[j].toUpperCase());
            System.out.println(" Age: "+age[j]);
            System.out.println("Seat Number: " + seatnumber);
            System.out.println("Origin: "+from+"    Destination: "+to);            
            System.out.println("Valid before "+date+ "|" + month + "|" +year);
            System.out.println("Enjoy your trip!");
            System.out.println();
            System.out.println("=================================================================");
            System.out.println("_________________________________________________________________");
    }//closing function
    
    void bill(int j)//starting function
    {   
        int t;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yy");
        LocalDateTime now = LocalDateTime.now();  
        System.out.println("\t FLIGHT BILL          Date :"+ dtf.format(now) );
        System.out.println(" " );
        for(j=0;j<=x;j++)//running loop
        {
            System.out.print("Name of passenger: ");
            if(gen[j]=='M'||gen[j]=='m')
            System.out.print("Mr. ");
            else if(gen[j]=='F'||gen[j]=='f')
            System.out.print("Ms. ");
            System.out.println(name[j].toUpperCase());
            System.out.println(" Age: "+age[j]);
        }//closing loop
            System.out.println("E-mail id :"+email);
            System.out.println("Contact No :"+num);      
            System.out.println("Origin: "+from+"           Destination: "+to);
            if(c=='1') 
            System.out.println("Class: First Class");
            else if(c=='2')
            System.out.println("Class: Business Class");
            else if(c=='3')
            System.out.println("Class: Economic Class");
            System.out.println("Cost Per Ticket = Rs."+cost+"/- ");//printing statement
            System.out.println("Valid before "+date+ "|" + month + "|" +year);
            System.out.println("This Ticket is Non-Refundable and Non-Transferable.");
            t=(cost*(x+1));
            double amt=t+(t*0.075);
            System.out.println("Total Cost: Rs." +amt+"/- including all taxes");
            System.out.println("Thank you for booking your tickets with us!");
            System.out.println("Hope you like our services");
            System.out.println("________________________________________________________________________________");
    }// closing function
    
    public static void main(String[] args)//starting main function
    {
        AIR ob=new AIR();
        ob.input();
        ob.seat();        
    }//closing main function
}//closing class