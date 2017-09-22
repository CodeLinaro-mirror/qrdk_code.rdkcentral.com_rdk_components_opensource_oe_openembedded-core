SUMMARY = "File synchronization tool"
HOMEPAGE = "http://rsync.samba.org/"
BUGTRACKER = "http://rsync.samba.org/bugzilla.html"
SECTION = "console/network"

# needs to add acl and attr
DEPENDS = "popt"

SRC_URI = "http://rsync.samba.org/ftp/rsync/src/rsync-${PV}.tar.gz;name=package \
           file://rsync-2.6.9-fname-obo.patch \
           https://rsync.samba.org/ftp/rsync/munge-symlinks-2.6.9.diff;name=munge \
           https://rsync.samba.org/ftp/rsync/security/rsync-2.6.9-daemon-exclude.diff;name=exclude \
           https://rsync.samba.org/ftp/rsync/security/rsync-2.6.9-daemon-ids.diff;name=daemon \
           file://rsyncd.conf"

SRC_URI[package.md5sum] = "996d8d8831dbca17910094e56dcb5942"
SRC_URI[package.sha256sum] = "ca437301becd890e73300bc69a39189ff1564baa761948ff149b3dd7bde633f9"

SRC_URI[munge.md5sum] = "fb0c3235584e8d3cf116162e0ce74f99"
SRC_URI[munge.sha256sum] = "550a831ab2c388a7c3ffbc9bc8d517eaebdca7dce40e25608f9f9ba3f3bd6768"

SRC_URI[exclude.md5sum] = "401d3cbaf13850bf141b827475501bda"
SRC_URI[exclude.sha256sum] = "ea34034b1b272166ad2936b1df948bcc76ea6d1438b543a829c82e7e804074aa"

SRC_URI[daemon.md5sum] = "5f989257193d4b85c8136ceaed702896"
SRC_URI[daemon.sha256sum] = "115ac12fc2cf738b24a3072272b0453591dec1afbdafb3365f70c894be837d78"


inherit autotools

do_install_append() {
	install -d ${D}${sysconfdir}
	install -m 0644 ${WORKDIR}/rsyncd.conf ${D}${sysconfdir}
}

EXTRA_OEMAKE='STRIP=""'

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=6d5a9d4c4d3af25cd68fd83e8a8cb09c"

PR = "r4"
