package platformDate

val platformDate = PlatformDate()

class PlatformDate {
    val dateFormat = "MM-dd-yyyy\tHH:mm:ss"

    private val _date = MultiPlatformDate()
    val date: String
        get() = _date.date
}
expect class MultiPlatformDate() {
    val date: String
}
