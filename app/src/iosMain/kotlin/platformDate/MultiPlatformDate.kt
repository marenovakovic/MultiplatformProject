package platformDate

import kotlin.properties.Delegates

interface DateProtocol {
    val date: String
}

actual class MultiPlatformDate actual constructor() {

    private var dateProtocol: DateProtocol by Delegates.notNull()

    constructor(dateProtocol: DateProtocol) : this() {
        this.dateProtocol = dateProtocol
    }

    actual val date: String
        get() = dateProtocol.date
}