import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity

class PaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        val paymentOptions = findViewById<RadioGroup>(R.id.paymentOptions)
        val confirmPaymentButton = findViewById<Button>(R.id.confirmPaymentButton)

        confirmPaymentButton.setOnClickListener {
            val selectedPaymentMethod = findViewById<RadioButton>(paymentOptions.checkedRadioButtonId).text.toString()
            // Handle payment based on selected option
        }
    }
}
