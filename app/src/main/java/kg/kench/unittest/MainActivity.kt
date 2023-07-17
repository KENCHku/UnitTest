package kg.kench.unittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.kench.unittest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDivide.setOnClickListener {
            divide()
        }
    }

    private fun divide() = with(binding) {
        tvResult.text = Divide().divide(etFnum.text.toString(), etSnum.text.toString())
    }
}