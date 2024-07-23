package Fernando.Hernandez

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import Fernando.Hernandez.databinding.ActivityMainBinding
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        //1- Mandar a llamar a todos los elementos de la vista
        val txtNombre = findViewById<EditText>(R.id.txtNombre)
        val txtTipoSangre = findViewById<EditText>(R.id.txtTipoSangre)
        val txtTelefono = findViewById<EditText>(R.id.txtTelefono)
        val txtEnfermedad = findViewById<EditText>(R.id.txtEnfermedad)
        val txtFechaNacimiento = findViewById<EditText>(R.id.txtFechaNacimiento)
        val txtHabitacion = findViewById<EditText>(R.id.txtHabitacion)
        val btnAgregarPaciente = findViewById<Button>(R.id.btnAgregarPaciente)


    }
}