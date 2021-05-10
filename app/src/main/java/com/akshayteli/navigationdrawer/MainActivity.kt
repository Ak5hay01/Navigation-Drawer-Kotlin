package com.akshayteli.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var toggle:ActionBarDrawerToggle
    lateinit var drawerLayout: DrawerLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
        toggle = ActionBarDrawerToggle(this, drawerLayout ,R.string.open,R.string.close)

        val navView = findViewById<NavigationView>(R.id.navView)

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        supportActionBar?.title = "Navigation Drawer Demo"

        navView.setNavigationItemSelectedListener {
            drawerLayout.closeDrawer(GravityCompat.START)
            when(it.itemId){
                R.id.item1-> {
                    supportActionBar?.title = "Item 1"
                   addFragment(Item1())
                }

                R.id.item2-> {
                    supportActionBar?.title = "Item 2"
                    addFragment(Item2())
                }

                R.id.item3-> {
                    supportActionBar?.title = "Item 3"
                    addFragment(Item3())
                }

                R.id.item4-> {
                    supportActionBar?.title = "Item 4"
                    addFragment(Item4())
                }

            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    fun addFragment(fragment:Fragment){
        val frag = supportFragmentManager.beginTransaction()
        frag.replace(R.id.frame_container,fragment).commit()
    }
}