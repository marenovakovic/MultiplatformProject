package platformDate

import java.text.SimpleDateFormat
import java.util.*

actual class MultiPlatformDate {
    actual val date: String
        get() {
            val date = Calendar.getInstance().time
            val dateFormat = SimpleDateFormat(platformDate.dateFormat, Locale.US)
            return dateFormat.format(date)
        }
}