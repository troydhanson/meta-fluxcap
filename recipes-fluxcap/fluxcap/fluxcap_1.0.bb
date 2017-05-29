DESCRIPTION = "fluxcap network tap replication and aggregation tool"
HOMEPAGE = "https://github.com/troydhanson/fluxcap"
SECTION = "base"
DEPENDS = "ncurses shr"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d335476c9079068e034c80652feeebb9"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

# The gitsm fetcher does git submodule (recursive) checkout
SRC_URI = "gitsm://github.com/troydhanson/fluxcap.git;protocol=https;branch=master"
SRCREV = "14b6026d7cc23698b4d6711e06b6066821075e69"

# FIXME 
#SRC_URI[md5sum] = "0"
#SRC_URI[sha256sum] = "0"

S = "${WORKDIR}/git"

inherit autotools

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
PARALLEL_MAKE = ""

