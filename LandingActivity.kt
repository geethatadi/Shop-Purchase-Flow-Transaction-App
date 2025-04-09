import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class LandingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        // Set up Location Spinner (Example)
        val locationSpinner = findViewById<Spinner>(R.id.locationSpinner)
        // Code to populate locationSpinner goes here

        // Category buttons
        val groceryButton = findViewById<Button>(R.id.groceryButton)
        val hardwareButton = findViewById<Button>(R.id.hardwareButton)

        groceryButton.setOnClickListener {
            // Handle grocery category selection
        }

        hardwareButton.setOnClickListener {
            // Handle hardware category selection
        }

        // Shop with credits button
        val shopWithCreditsButton = findViewById<Button>(R.id.shopWithCreditsButton)
        shopWithCreditsButton.setOnClickListener {
            // Handle shop with credits functionality
        }

        // View Gift Card Receipt button
        val viewGiftCardReceiptButton = findViewById<Button>(R.id.viewGiftCardReceiptButton)
        viewGiftCardReceiptButton.setOnClickListener {
            // Redirect to Gift Card Receipt page
            val intent = Intent(this, GiftCardReceiptActivity::class.java)
            startActivity(intent)
        }
    }
}
