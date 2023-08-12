import java.util.Scanner;
public class SocialMedia {
     
    public static void main(String[] args) {
        
        
        login();
        appPreference();
    

    }
    public static void login(){
        System.out.println("Welcome to Social Media Platform... ");
        System.out.println("Select your Media..");
    }

    public static void appPreference(){
        System.out.println("");
        System.out.println("1. Whatsapp");
        System.out.println("2. Instagram");
        System.out.println("3. Facebook");
        System.out.println("4. SnapChat");

        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter app preference");
        int appPreference = sc.nextInt();
        //System.out.println("Username is: " + userName);
        if(appPreference == 1){
            System.out.println("Welcome to whatsapp");
            whatsapp.Home();
            //whatsapp.Options();
            Scanner sc1 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter option preference");
            int whatsappPreference = sc.nextInt();
            if(whatsappPreference == 1){
                whatsapp.chats();
            }
            else if(whatsappPreference == 2){
                whatsapp.status();
            }
            else if(whatsappPreference == 3){
                whatsapp.calls();
            }
            else if(whatsappPreference == 4){
                whatsapp.UserProfile();
            }
            else if(whatsappPreference == 5){
                whatsapp.settings();
            }
            else if(whatsappPreference == 6){
                appPreference();
            }
            else{
                System.out.println("please select correct operation....");
            }
        }

        else if(appPreference == 2){
            System.out.println("Welcome to Instagram");
            Instagram.Home();
            
            Scanner sc2 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter option preference");
            int InstagramPreference = sc.nextInt();
            if(InstagramPreference == 1){
                Instagram.chats();
            }
            else if(InstagramPreference == 2){
                Instagram.stories();
            }
            else if(InstagramPreference == 3){
                Instagram.Search();
            }
            else if(InstagramPreference == 4){
                Instagram.Reels();
            }
            else if(InstagramPreference == 5){
                Instagram.Notification();
            }
            else if(InstagramPreference == 6){
                Instagram.UserProfile();
            }
            else if(InstagramPreference == 7){
                threads.Home();
            }
            else if(InstagramPreference == 8){
                whatsapp.settings();
            }
            else if(InstagramPreference == 9){
                appPreference();
            }
            else{
                System.out.println("please select correct operation....");
            }

        }


        else if(appPreference == 3){
            System.out.println("Welcome to Facebook");
            Facebook.Home();
            
            Scanner sc3 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter option preference");
            int FacebookPreference = sc.nextInt();
            if(FacebookPreference == 1){
                Facebook.chats();
            }
            else if(FacebookPreference == 2){
                Facebook.Friends();
            }
            else if(FacebookPreference == 3){
                Facebook.Watch();
            }
            else if(FacebookPreference == 4){
                Facebook.MarketPlace();
            }
            else if(FacebookPreference == 5){
                Facebook.Notification();
            }
            else if(FacebookPreference == 6){
                appPreference();
            }
            
            else{
                System.out.println("please select correct operation....");
            }

        }
        else if(appPreference == 4){
            System.out.println("Welcome to Snapchat");
            Snapchat.Home();
            
            Scanner sc4 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter option preference");
            int SnapChatPreference = sc.nextInt();
            if(SnapChatPreference == 1){
                Snapchat.Location();
            }
            else if(SnapChatPreference == 2){
                Snapchat.chats();
            }
            else if(SnapChatPreference == 3){
                Snapchat.Snap();
            }
            else if(SnapChatPreference == 4){
                Snapchat.FRNDS();
            }
            else if(SnapChatPreference == 5){
                Snapchat.Spotlight();
            }
            else if(SnapChatPreference == 6){
                appPreference();
            }
            
            else{
                System.out.println("please select correct operation....");
            }

        }
        else{
            System.out.println("no preference selected");

        }
    }
    
}

class User{
    public static String error(){
        return ("login error");
    }

}


class whatsapp{
    
    public static void Home(){
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        String userName = sc.nextLine();
        System.out.println("Hello " + userName);

        if(userName.equals("altaf")){
            System.out.println("user verified");
            System.out.println("welcome to home page....");
            System.out.println("Options:");
            Options();
            
        }
        else{
            System.out.println("USER IS NOT AUTHORIZED");
            Home();            
            
        }

        

    }
    public static void Options(){
        System.out.println("");
        System.out.println("1. Chats");
        System.out.println("2. Status");
        System.out.println("3. calls");
        System.out.println("4. user profile");
        System.out.println("5. settings.");
        System.out.println("6. logout.");

    }
    public static void chats(){
        System.out.println("4 unread messages....");
    }
    public static void status(){
        System.out.println("showing status....");
    }
    public static void calls(){
        calls ref1 = new calls();
        
        System.out.println("showing call details ....");
        System.out.println("what you want to see :");
        System.out.println("");
        System.out.println("1. Incoming calls");
        System.out.println("2. Outgoing Calls");
        System.out.println("3. Missed Calls");

        Scanner sc5 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter option preference");
            int callPreference = sc5.nextInt();
            if(callPreference == 1){
                ref1.Incoming();
            }
            else if(callPreference == 2){
                ref1.Outgoing();
            }
            else if(callPreference == 3){
                ref1.Missed();            }
            
            else{
                System.out.println("please select correct operation....");
            }
        
       

    }
    public static void UserProfile(){
        System.out.println("showing userProfile....");

        Userprofile ref4 = new Userprofile();
        System.out.println("");
        System.out.println("select option preference ");
        System.out.println("");
        System.out.println("1. change Name");
        System.out.println("2. Change About");
        System.out.println("3. Change Phone");
        System.out.println("4. Change Photo.");
        

        Scanner sc11 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter option preference");
            int profilePreference = sc11.nextInt();
            if(profilePreference == 1){
                ref4.changeName();
            }
            else if(profilePreference == 2){
                ref4.changeAbout();
            }
            else if(profilePreference == 3){
                ref4.changePhone();            
            }
            else if(profilePreference == 4){
                ref4.changePhoto();           
            }
            
            
            else{
                System.out.println("please select correct operation....");
            }
    }
    public static void settings(){
        settings ref2 = new settings();
        System.out.println("settings: ");
        System.out.println("");
        System.out.println("1. select theme:");
        System.out.println("2. language");
        System.out.println("3. Privacy");
        System.out.println("4. Notification.");
        System.out.println("5. Help");

        Scanner sc6 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter option preference");
            int settingsPreference = sc6.nextInt();
            if(settingsPreference == 1){
                ref2.selectTheme();
            }
            else if(settingsPreference == 2){
                ref2.language();
            }
            else if(settingsPreference == 3){
                ref2.Privacy();            
            }
            else if(settingsPreference == 4){
                ref2.Notification();           
            }
            else if(settingsPreference == 5){
                ref2.Help();            
            }
            
            else{
                System.out.println("please select correct operation....");
            }
    }

}


class settings{
    public static void selectTheme(){
        System.out.println("select Theme:");
        System.out.println("");
        System.out.println("1. Black");
        System.out.println("2. White");

        Scanner sc7 = new Scanner(System.in);
        System.out.println("Enter Option Preference");
        int themePreference = sc7.nextInt();
        if(themePreference == 1){
            System.out.println("theme set to black");
        }
        else if(themePreference == 2){
            System.out.println("theme set to white");
        }
        else{
            System.out.println("please select correct operation");
        }

    }

    public static void language(){
        System.out.println("select Language:");
        System.out.println("");
        System.out.println("1. English");
        System.out.println("2. Hindi");
        System.out.println("3. Marathi");
        System.out.println("4. Tamil");

        Scanner sc8 = new Scanner(System.in);
        System.out.println("Enter Option Preference");
        int languagePreference = sc8.nextInt();
        if(languagePreference == 1){
            System.out.println("language set to English");
        }
        else if(languagePreference == 2){
            System.out.println("language set to hindi");
        }
        else if(languagePreference == 3){
            System.out.println("language set to Marathi");
        }
        else if(languagePreference == 4){
            System.out.println("language set to Tamil");
        }
        else{
            System.out.println("please select correct operation");
        }


    }
    
    public static void Privacy(){
        System.out.println("Privacy");
        System.out.println("");
        System.out.println("1. Public.");
        System.out.println("2. Private.");
       

        Scanner sc9 = new Scanner(System.in);
        System.out.println("Enter Option Preference");
        int privacyPreference = sc9.nextInt();
        if(privacyPreference == 1){
            System.out.println("privacy set to public.");
        }
        else if(privacyPreference == 2){
            System.out.println("privacy set to private.");
        }
        
        else{
            System.out.println("please select correct operation");
        }

    }

    public static void Notification(){
        System.out.println("Notification:");
        System.out.println("");
        System.out.println("1. Allowed.");
        System.out.println("2. Not Allowed.");
       

        Scanner sc10 = new Scanner(System.in);
        System.out.println("Enter Option Preference");
        int notificationPreference = sc10.nextInt();
        if(notificationPreference == 1){
            System.out.println("notifications are allowed.");
        }
        else if(notificationPreference == 2){
            System.out.println("notifications are not allowed.");
        }
        
        else{
            System.out.println("please select correct operation");
        }

    }

    public static void Help(){

        System.out.println("welcome to custome care:");
        System.out.println("customer care no: 120003456");
    }

}


class calls{
    public static void Incoming(){
        System.out.println("showing Incoming Calls....");

    }

    public static void Outgoing(){
        System.out.println("Showing Calls Made by user.....");

    }

    public static void Missed(){
        System.out.println("Showing calls missed by user.....");

    }
}

class Userprofile{

    public static void changeName(){
        System.out.println("name changed successfully");
    }

    public static void changeAbout(){
        System.out.println("about changed successfully");
    }

    public static void changePhone(){
        System.out.println("Phone no changed successfully");
    }

    public static void changePhoto(){
        System.out.println("Profile changed successfully");
    }

}

class Instagram extends whatsapp{

    public static void Home(){
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        String userName = sc.nextLine();
        System.out.println("Hello " + userName);

        if(userName.equals("altaf")){
            System.out.println("user verified");
            System.out.println("welcome to home page....");
            System.out.println("Options:");
            Options();
            
        }
        else{
            System.out.println("USER IS NOT AUTHORIZED");
            Home();            
            
        }

        

    }

    

    public static void Options(){
        System.out.println("");
        System.out.println("1. Chats");
        System.out.println("2. Stories");
        System.out.println("3. search");
        System.out.println("4. reels");
        System.out.println("5. notification");
        System.out.println("6. user profile");
        System.out.println("");
        System.out.println("7. Moving to threads");
        System.out.println("8. Settings");
        System.out.println("9. logout.");

    }
    
    public static void stories(){
        System.out.println("showing Stories....");
    }
    public static void Search(){
        System.out.println("Search for Users....");
    }
    public static void UserProfile(){
       USRPROFILE ref15 = new USRPROFILE();
        System.out.println("select prefered option:");
        System.out.println("");
        System.out.println("1. Settings.");
        System.out.println("2. Your Activity.");
        System.out.println("3. Archive.");
        System.out.println("4. Scan QR Code.");
        System.out.println("5. Saved.");
        System.out.println("6. Close Friends List.");

        
        System.out.println("");
        Scanner sc15 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter option preference");
            int usrPreference = sc15.nextInt();
            if(usrPreference == 1){
                ref15.sttngs();
            }
            else if(usrPreference == 2){
                ref15.YourActivity();
            }
            else if(usrPreference == 3){
                ref15.Archive();
            }
            else if(usrPreference == 4){
                ref15.QRCode();
            }
            else if(usrPreference == 5){
                ref15.Saved();
            }
            else if(usrPreference == 6){
                ref15.CloseFriends();
            }
            
            
            
            else{
                System.out.println("please select correct operation....");
            }


    }
    public static void Reels(){
        System.out.println("showing Reels....");
        
    }
    public static void Notification(){
        NOTIFICATION ref14 = new NOTIFICATION();
        System.out.println("select prefered option:");
        System.out.println("");
        System.out.println("1. Followers.");
        System.out.println("2. Following.");
        System.out.println("3. Requests.");
        
        System.out.println("");
        Scanner sc15 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter option preference");
            int notPreference = sc15.nextInt();
            if(notPreference == 1){
                ref14.followers();
            }
            else if(notPreference == 2){
                ref14.following();
            }
            else if(notPreference == 3){
                ref14.requests();
            }
            
            
            
            else{
                System.out.println("please select correct operation....");
            }

    }
    

}

class NOTIFICATION extends Instagram{
    public static void followers(){
        System.out.println("showing followers...");

    }

    public static void following(){
        System.out.println("showing following...");

    }

    public static void requests(){
        System.out.println("showing Requests:");
        System.out.println("");
        System.out.println("select prefered option:");
        System.out.println("1. Accept");
        System.out.println("2. Reject.");
        Scanner sc12 = new Scanner(System.in);
        System.out.println("Enter option Preference");
        int reqPreference = sc12.nextInt();
        if(reqPreference == 1){
            System.out.println("Accepted the request..");

        }
        else if(reqPreference == 2){
            System.out.println("Rejected the Request...");
        }
        else{
            System.out.println("please select correct operation");
        }


    }
}
class USRPROFILE{
    public static void sttngs(){
        System.out.println("select prefered option:");
        System.out.println("");
        System.out.println("1. Time Spent.");
        System.out.println("2. Acoount Privacy.");
        System.out.println("3. Blocked.");
        
        System.out.println("");
        Scanner sc16 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter option preference");
            int istsetPreference = sc16.nextInt();
            if(istsetPreference == 1){
                System.out.println("total time spent");
            }
            else if(istsetPreference == 2){
                System.out.println("Decide account privacy");
            }
            else if(istsetPreference == 3){
                System.out.println("showing blocked accounts");
            }
            
            else{
                System.out.println("please select correct operation....");
            }


    }

    public static void YourActivity(){
        System.out.println("total 24 HRS....");

        
    }

    public static void Archive(){
        System.out.println("collections:");
        System.out.println("");
        System.out.println("select option preference:");
        System.out.println("");
        System.out.println("1. Your Collection.");
        System.out.println("2. Friends Collection.");
   
    
        System.out.println("");
        Scanner sc17 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter option preference");
            int SavedPreference = sc17.nextInt();
            if(SavedPreference == 1){
                System.out.println("Showing Your Collection....");
            }
            else if(SavedPreference == 2){
                System.out.println("Showing Your Friends Collection....");
            }
            
            
            
            else{
                System.out.println("please select correct operation....");
            }
    }

    public static void QRCode(){
        System.out.println("Scanning QR Code..../");
        
    }

    public static void Saved(){
        System.out.println("Displaying Saved Posts..");
        
    }

    public static void CloseFriends(){
        System.out.println("Edit Your Close Friends List...");
        
    }

} 


class threads extends Instagram{
    public static void Home(){
        System.out.println("");
        System.out.println("welcome to threads");
        options();
    }
    public static void options(){
        System.out.println("select prefered option:");
        System.out.println("");
        System.out.println("1. Create New Thread");
        System.out.println("2. Search");
        System.out.println("3. Show Activity");
        System.out.println("4. User Profile");
        System.out.println("");
        Scanner sc4 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter option preference");
            int ThreadPreference = sc4.nextInt();
            if(ThreadPreference == 1){
                threads.newThread();
            }
            else if(ThreadPreference == 2){
                threads.search();
            }
            else if(ThreadPreference == 3){
                threads.activity();
            }
            else if(ThreadPreference == 4){
                threads.userProfile();
            }
            
            
            else{
                System.out.println("please select correct operation....");
            }
    }
    public static void newThread(){
        System.out.println("Creating new Thread...");

    }
    
    public static void search(){
        System.out.println("Searching...");

    }

    public static void activity(){
        System.out.println("Active Threads....");

    }

    public static void userProfile(){
        System.out.println("Showing user Profile");

    }
}


class Facebook extends whatsapp{

    public static void Home(){
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        String userName = sc.nextLine();
        System.out.println("Hello " + userName);

        if(userName.equals("altaf")){
            System.out.println("user verified");
            System.out.println("welcome to home page....");
            System.out.println("Options:");
            Options();
            
        }
        else{
            System.out.println("USER IS NOT AUTHORIZED");
            Home();       
        }    
            
        }
    

    public static void Options(){
        System.out.println("");
        System.out.println("1. Chats");
        System.out.println("2. Friends");
        System.out.println("3. watch");
        System.out.println("4. Market Place");
        System.out.println("5. notification");
        System.out.println("6. logout.");
     

    }

    public static void Friends(){
        System.out.println("Showing Friends.....");
    }
    public static void Watch(){
        System.out.println("Watching Videos...");
    }
    public static void MarketPlace(){
        System.out.println("Market Place to buy...");
    }
    public static void Notification(){
        System.out.println("4 unread messages");
    }
    

}


class Snapchat extends whatsapp{

    public static void Home(){
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        String userName = sc.nextLine();
        System.out.println("Hello " + userName);

        if(userName.equals("altaf")){
            System.out.println("user verified");
            System.out.println("welcome to home page....");
            System.out.println("Options:");
            Options();
            
        }
        else{
            System.out.println("USER IS NOT AUTHORIZED");
            Home();            
            
        }

        

    }
    public static void Options(){
        System.out.println("");
        System.out.println("1. Location");
        System.out.println("2. chats");
        System.out.println("3. snap");
        System.out.println("4. Friends");
        System.out.println("5. Spotlight");
        System.out.println("6. logout.");
     

    }
    public static void chats(){
        snap_chats ref5 = new snap_chats();

        System.out.println("select prefered option:");
        System.out.println("");
        System.out.println("1. Recieved Chats");
        System.out.println("2. Saved chats");
        System.out.println("3. Replay");
        System.out.println("4. New Snap");
        System.out.println("");
        Scanner sc11 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter option preference");
            int ChatPreference = sc11.nextInt();
            if(ChatPreference == 1){
                ref5.Received();
            }
            else if(ChatPreference == 2){
                ref5.save();
            }
            else if(ChatPreference == 3){
                ref5.replay();
            }
            else if(ChatPreference == 4){
                ref5.newSnap();
            }
            
            
            else{
                System.out.println("please select correct operation....");
            }


    }

    
    public static void FRNDS(){
        FRIENDS ref8 = new FRIENDS();
        
        System.out.println("select prefered option:");
        System.out.println("");
        System.out.println("1. Add Friends");
        System.out.println("2. Accept Requests.");
        System.out.println("3. Discover.");
        
        System.out.println("");
        Scanner sc13 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter option preference");
            int friendsPreference = sc13.nextInt();
            if(friendsPreference == 1){
                ref8.addFriends();
            }
            else if(friendsPreference == 2){
                ref8.AcceptRequest();
            }
            else if(friendsPreference == 3){
                ref8.Discover();
            }
            
            
            
            else{
                System.out.println("please select correct operation....");
            }
    
    }
    public static void Location(){
        LOCATION ref6 = new LOCATION();
        System.out.println("select prefered option:");
        System.out.println("");
        System.out.println("1. send my current location");
        System.out.println("2. Places near by");
        System.out.println("3. Friends nearby");
        System.out.println("4. Satellite View");
        System.out.println("");
        Scanner sc12 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter option preference");
            int locPreference = sc12.nextInt();
            if(locPreference == 1){
                ref6.currentLocation();
            }
            else if(locPreference == 2){
                ref6.nearBy();
            }
            else if(locPreference == 3){
                ref6.friendsNear();
            }
            else if(locPreference == 4){
                ref6.satellite();
            }
            
            
            else{
                System.out.println("please select correct operation....");
            }

    }
    public static void Snap(){
        SNAP ref7 = new SNAP();
        System.out.println("select prefered option:");
        System.out.println("");
        System.out.println("1. Explore Filters");
        System.out.println("2. looping");
        System.out.println("3. Add Music.");
        System.out.println("4. Add Sticker");
        System.out.println("");
        Scanner sc13 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter option preference");
            int SNAPPreference = sc13.nextInt();
            if(SNAPPreference == 1){
                ref7.exploreFilters();
            }
            else if(SNAPPreference == 2){
                ref7.loop();
            }
            else if(SNAPPreference == 3){
                ref7.addMusic();
            }
            else if(SNAPPreference == 4){
                ref7.stickers();
            }
            
            
            else{
                System.out.println("please select correct operation....");
            }
    }
    public static void Spotlight(){
        SPOTLIGHT ref10 = new SPOTLIGHT();
        System.out.println("select prefered option:");
        System.out.println("");
        System.out.println("1. Save the spotlight.");
        System.out.println("2. Like.");
        System.out.println("3. Show Comments.");
        System.out.println("4. Send as Message.");
        System.out.println("");
        Scanner sc14 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter option preference");
            int spotPreference = sc14.nextInt();
            if(spotPreference == 1){
                ref10.SAVE();
            }
            else if(spotPreference == 2){
                ref10.like();
            }
            else if(spotPreference == 3){
                ref10.comments();
            }
            else if(spotPreference == 4){
                ref10.sendasmssg();
            }
            
            
            else{
                System.out.println("please select correct operation....");
            }

    }
    

}

class snap_chats{
    public static void Received(){
        System.out.println("chat is received");
    }
    public static void save(){
        System.out.println("double tap to savae the chat");
    }

    public static void replay(){
        System.out.println("hold to replay the snap");
    }

    public static void newSnap(){
        System.out.println("click to send snap");
    }
}

class LOCATION{

    public static void currentLocation(){
        System.out.println("Sharing current location of me.....");

    }

    public static void nearBy(){
        System.out.println("Place nearby....");

    }

    public static void friendsNear(){
        System.out.println("Friends Nearby...");
    }

    public static void satellite(){
        System.out.println("satellite view of map..");

    }
}

class SNAP{
    public static void exploreFilters(){
        System.out.println("Exploring the range of filters....");
    }

    public static void loop(){
        System.out.println("setting time for the snap....");

    }

    public static void addMusic(){
        System.out.println("adding music in the snap....");

    }

    public static void stickers(){
        System.out.println("adding stickers in the snap....");

    }

    public static void favFilters(){
        System.out.println("My favourite filters....");

    }
}

class FRIENDS{
    public static void addFriends(){
        System.out.println("searching friends....");

    }

    public static void AcceptRequest(){
        System.out.println("penidng requests...");


    }

    public static void Discover(){
        System.out.println("Finding new Stories...");

    }
}

class SPOTLIGHT{
    public static void SAVE(){
        System.out.println("Spotlight saved successfully...");

    }

    public static void like(){
        System.out.println("u liked a spotlight...");

    }

    public static void comments(){
        System.out.println("showing comments.....");

    }

    public static void sendasmssg(){
        System.out.println("sending as message to friends....");

    }
}