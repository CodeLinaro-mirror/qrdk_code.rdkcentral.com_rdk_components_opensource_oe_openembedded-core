require sqlite3.inc

LICENSE = "PD"
LIC_FILES_CHKSUM = "file://sqlite3.h;endline=11;md5=786d3dc581eff03f4fd9e4a77ed00c66"

SRC_URI = "\
  https://www.sqlite.org/2017/sqlite-autoconf-${SQLITE_PV}.tar.gz \
  file://Fix_CVE-2017-13685.patch \
  "
SRC_URI[md5sum] = "369444dbf11895c61949940a6b038f92"
SRC_URI[sha256sum] = "ec66595b29bc0798b023a5122021ea646ab4fa9e2f735937c5426feeba950742"
