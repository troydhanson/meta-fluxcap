meta-fluxcap

Yocto/OpenEmbedded layer for [fluxcap](https://github.com/troydhanson/fluxcap).

Usage:

* clone this repo
* add it to conf/bblayers.conf
* add fluxcap recipe to an image. E.g., add this to conf/local.conf: `IMAGE_INSTALL_append = " fluxcap"`
* build an image e.g. `bitbake core-image-minimal`

The resulting image has the executable `/usr/bin/fluxcap`, `/usr/bin/fluxtop`,
and `/usr/bin/ramdisk`.  More precisely they are placed in `${bindir}/`.

