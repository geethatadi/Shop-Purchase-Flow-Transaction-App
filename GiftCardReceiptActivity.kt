import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent

class GiftCardReceiptActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gift_card_receipt)

        val contactNumber = findViewById<EditText>(R.id.contactNumber)
        val giftFrom = findViewById<EditText>(R.id.giftFrom)
        val message = findViewById<EditText>(R.id.message)

        // Payment Button
        val paymentButton = findViewById<Button>(R.id.paymentButton)
        paymentButton.setOnClickListener {
            // Handle redirect to payment options page
            val intent = Intent(this, PaymentActivity::class.java)
            startActivity(intent)
        }
    }
}
