# Navigation-Drawer-Kotlin

# To implement the navigation drawer follow following steps

1. Check if there is dependency of material present in the gradel file if not then add it
    implementation 'com.google.android.material:material:1.2.1'
    
2. Now to implement the Drawer we will need to add DrawerLayout in our activity_main.xml
3. After that we need to add constrain layout for the main page view and inside that framelayout for showing different fragments
4. below that add NavigationView which is responsible for the drawer. 
5. Add header layout and menu to the NavigationView
6. Now inside the MainActivity initialize the Toogle, DrawerLayout, NavigationView
7. Add Navigation Item selected listener
8. create a method for replacing the fragments 


Following are the screenshots 

# 1. Home Screen 
  ![alt text](/attachment/home.png)
  
# 2. When Drawer opens
  ![alt text](/attachment/drawer_open.png)
  
# 3. When We select Item1
  ![alt text](/attachment/item1.png)
