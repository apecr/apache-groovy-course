@Grapes(
    @Grab(group = 'org.apache.commons', module = 'commons-lang3', version = '3.4')
)

import org.apache.commons.lang3.text.WordUtils

String name = "Alberto Pelayo Eyo Castro-Rial"
WordUtils wU = new WordUtils()

println wU.initials(name)