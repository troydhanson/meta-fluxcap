meta-fluxcap

Yocto/OpenEmbedded layer for [fluxcap](https://github.com/troydhanson/fluxcap).

* Depends on shr (see meta-shr for recipe)

In poky, recursive submodules are not fetched past the first level properly. As a workaround,
when the resulting error occurs in the build process, cd into the directory where the error
occurred and manually "git submodule update --init --recursive"

Usage:

* clone this repo
* add it to conf/bblayers.conf
* add fluxcap recipe to an image. E.g., add this to conf/local.conf: `IMAGE_INSTALL_append = " shr fluxcap"`
* build an image e.g. `bitbake core-image-minimal`

The resulting image has the executable `/usr/bin/fluxcap`, `/usr/bin/fluxtop`,
and `/usr/bin/ramdisk`.  More precisely they are placed in `${bindir}/`.

