package raul.castaneda.loginkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnIngresar.setOnClickListener {
            val user = txtuser.text.toString()
            val pass = txtcontraseña.text.toString()

            if (user.equals("") or pass.equals("")) {
                mensaje("Datos vacios", Toast.LENGTH_LONG)
            } else {
                if (user.equals("Raul") and pass.equals("0000")) {
                    mensaje("Bienvenido")
                    val i = Intent(this, Main2Activity::class.java)
                    i.putExtra("nombre", "Raul")
                    startActivity(i)
                } else {
                    mensaje("no te conozco")
                }
            }
        }
        }
    fun mensaje(mensaje:String,dur:Int=Toast.LENGTH_SHORT) {
        Toast.makeText(this,mensaje,dur).show()
        }
    }

