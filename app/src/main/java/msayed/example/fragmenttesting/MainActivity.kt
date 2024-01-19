package msayed.example.fragmenttesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import msayed.example.fragmenttesting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var myBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(myBinding.root)
        myBinding.button.setOnClickListener {
            changeFragment(frag1())
            Toast.makeText(this, "Button1", Toast.LENGTH_SHORT).show()
        }
        myBinding.button2.setOnClickListener {
            changeFragment(frag2())
            Toast.makeText(this, "Button2", Toast.LENGTH_SHORT).show()
        }
    }

    private fun changeFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainerView2, fragment)
        fragmentTransaction.commit()

    }
}