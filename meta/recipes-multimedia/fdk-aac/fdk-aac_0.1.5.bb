SUMMARY = "FDK-AAC audio codec"

DESCRIPTION = "The Fraunhofer FDK AAC Codec Library for Android \
(\"FDK AAC Codec\") is software that implements the MPEG \
Advanced Audio Coding (\"AAC\") encoding and decoding scheme \
for digital audio."

HOMEPAGE = "http://opencore-amr.sourceforge.net/"

LICENSE = "Fraunhofer_FDK_AAC_Codec_Library_for_Android"
LICENSE_FLAGS = "commercial"
LIC_FILES_CHKSUM = "file://NOTICE;md5=087ae5edf3094fbebf2e44334fa2155c"

SRC_URI = "${SOURCEFORGE_MIRROR}/opencore-amr/fdk-aac-${PV}.tar.gz"

SRC_URI[md5sum] = "f70d394960da66fbf40a2946625690eb"
SRC_URI[sha256sum] = "2164592a67b467e5b20fdcdaf5bd4c50685199067391c6fcad4fa5521c9b4dd7"

inherit autotools
