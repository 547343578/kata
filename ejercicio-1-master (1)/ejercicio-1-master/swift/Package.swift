// swift-tools-version:5.5

import PackageDescription

let package = Package(
    name: "MercadonaShopOne",
    products: [
        .library(
            name: "MercadonaShopOne",
            targets: ["MercadonaShopOne"]),
    ],
    targets: [
        .target(
            name: "MercadonaShopOne",
            dependencies: []),
        .target(
            name: "MercadonaShopOneApp",
            dependencies: ["MercadonaShopOne"]),
        .testTarget(
            name: "MercadonaShopOneTests",
            dependencies: ["MercadonaShopOne"]),
    ]
)
