# Pulled from a mix of different images:

require /home/mrafik/yocto-tegra/poky-dunfell/meta/recipes-sato/images/core-image-sato-dev.bb
#include recipes-core/images/rpi-basic-image.bb

# This image is a little more full featured, and includes wifi
# support, provided you have a raspberrypi3
#inherit core-image-sato-dev

inherit populate_sdk_qt5 

SUMMARY = "The minimal image that can run Qt5 applications"
LICENSE = "MIT"
MY_TOOLS = " \
    qtbase \
    qtbase-dev \
    qtbase-mkspecs \
    qtbase-plugins \
    qtbase-tools \
"
MY_PKGS = " \
    qt3d \
    qt3d-dev \
    qt3d-mkspecs \
    qtcharts \
    qtcharts-dev \
    qtcharts-mkspecs \
    qtconnectivity-dev \
    qtconnectivity-mkspecs \
    qtquickcontrols2 \
    qtquickcontrols2-dev \
    qtquickcontrols2-mkspecs \
    qtdeclarative \
    qtdeclarative-dev \
    qtdeclarative-mkspecs \
    qtgraphicaleffects \
    qtgraphicaleffects-dev \
"
MY_FEATURES = " \
    linux-firmware-bcm43430 \
    bluez5 \
    i2c-tools \
    bridge-utils \
    hostapd \
    dhcp-server \
    iptables \
    wpa-supplicant \
"
#DISTRO_FEATURES_append += " bluez5 bluetooth wifi"
IMAGE_INSTALL_append = " \
    ${MY_TOOLS} \
    ${MY_PKGS} \
    basicquick \
"
