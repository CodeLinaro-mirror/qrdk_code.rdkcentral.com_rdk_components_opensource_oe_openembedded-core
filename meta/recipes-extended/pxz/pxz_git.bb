# Copyright (C) 2015 Khem Raj <raj.khem@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Parallel LZMA compressor compatible with XZ"
DESCRIPTION = "Parallel XZ is a compression utility that takes advantage of running LZMA compression of different parts of an input file on multiple cores and processors simultaneously. Its primary goal is to utilize all resources to speed up compression time with minimal possible influence on compression ratio"
HOMEPAGE = "https://jnovy.fedorapeople.org/pxz/"
LICENSE = "GPL-2.0+"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"
SECTION = "console/utils"
DEPENDS = "xz"

SRCREV = "ae808463c2950edfdedb8fb49f95006db0a18667"
PV = "4.999.9beta+git${SRCPV}"
SRC_URI = "git://github.com/jnovy/pxz.git"

S = "${WORKDIR}/git"

CFLAGS_append = " -fopenmp -D_FILE_OFFSET_BITS=64 -D_LARGEFILE_SOURCE"
LDFLAGS_append = " -llzma"

do_compile ()  {
	oe_runmake -C ${S}
}

do_install ()  {
	oe_runmake -C ${S} DESTDIR=${D} INSTALL="install -p" BINDIR="${bindir}" install
}

do_configure[noexec] = "1"

BBCLASSEXTEND = "native"
