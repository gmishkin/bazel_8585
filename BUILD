load("@bazel_tools//tools/jdk:default_java_toolchain.bzl", "default_java_toolchain")

default_java_toolchain(
    name = "toolchain_custom_turbine",
    header_compiler = ["turbine_deploy.jar"], # Built locally
    source_version = "11",
    target_version = "11",
)
