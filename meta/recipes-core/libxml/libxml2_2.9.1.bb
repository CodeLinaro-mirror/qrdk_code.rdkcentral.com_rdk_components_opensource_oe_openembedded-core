require libxml2.inc

SRC_URI += "http://www.w3.org/XML/Test/xmlts20080827.tar.gz;name=testtar"
SRC_URI += "file://libxml2-CVE-2015-5312.patch;name=CVE-2015-5312"
SRC_URI += "file://libxml2-CVE-2016-4448_1.patch;name=CVE-2016-4448_1"
SRC_URI += "file://libxml2-CVE-2016-4448.patch;name=CVE-2016-4448"
SRC_URI += "file://libxml2_configure_in.patch;name=configure"

SRC_URI[CVE-2015-5312.md5sum] = "ed4640b7e5a43a4ab6553a8b79fe1d6"
SRC_URI[CVE-2016-4448.md5sum] = "3c1bc4d949bdca318f39f95471443ae2"
SRC_URI[CVE-2016-4448_1.md5sum] = "fb824c927c3415fd6e5ad16a609803e8"
SRC_URI[configure.md5sum] = "7373682f5a5d99ec3ef797c14f1a04b0"

SRC_URI[CVE-2015-5312.sha256sum] = "a078b6624deefbb10f8acca1c383aec5b638c449bfd071c66f59ddd3b982ffc9"
SRC_URI[CVE-2016-4448.sha256sum] = "d144ef71319dbc13455f1e31bb855471ed227da2f4c26045b0d60bb74a0d8de9"
SRC_URI[CVE-2016-4448_1.sha256sum] = "3e75708f408e1a1e5fae86d8891d4a285a4024064f69e08afcb8a506e63bcce2"
SRC_URI[configure.sha256sum] = "3fdbb1f0d0d569a2633e5c8ff36a39cb9c5f5230dcb92dce7fca91c0c373134a"

SRC_URI[libtar.md5sum] = "9c0cfef285d5c4a5c80d00904ddab380"
SRC_URI[libtar.sha256sum] = "fd3c64cb66f2c4ea27e934d275904d92cec494a8e8405613780cbc8a71680fdb"
SRC_URI[testtar.md5sum] = "ae3d1ebe000a3972afa104ca7f0e1b4a"
SRC_URI[testtar.sha256sum] = "96151685cec997e1f9f3387e3626d61e6284d4d6e66e0e440c209286c03e9cc7"
