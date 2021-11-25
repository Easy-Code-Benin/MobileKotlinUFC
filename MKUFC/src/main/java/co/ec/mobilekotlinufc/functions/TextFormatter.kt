package co.ec.mobilekotlinufc.functions

/********************** @TextFormatter **********************/

/**
 * methode to format date [date]
 * get YYYY-MM-DDThh:mm:ss.sTZD parameter:: [separator]: String
 * return "dd[separator]mm[separator]YYYY"
 */
@Override
fun String.date( separator: String = "/"): String {
    val lString: List<String> = this.split("-","T")
    return lString[0] + separator + lString[1] + separator + lString[2]
}

/**
 * methode to format .[hour]
 * get YYYY-MM-DDThh:mm:ss.sTZD parameter:: [separator]: String
 * return "hh[separator]mm"
 */
@Override
fun String.hour(separator: String= ":"): String {
    val lString: List<String> = this.split("T", ":")
    val hour = Integer.parseInt(lString[1]) + 1 // lock GMT
    return hour.toString() + separator + lString[2]
}

/**
 * .[currency], @TextFormatter
 * return "Mount [currency]"
 */
@Override
fun String.currency(currency: String = "Fcfa"): String {
    return "$this $currency"

}
