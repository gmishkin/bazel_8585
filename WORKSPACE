workspace(name = "info_amsa_bazel_8585")

load("@bazel_tools//tools/build_defs/repo:jvm.bzl", "jvm_maven_import_external")

jvm_maven_import_external("org.projectlombok:lombok:1.18.4", ["http://central.maven.org/maven2/"],
                          name = "org_projectlombok_lombok",
                          artifact_sha256 = "39f3922deb679b1852af519eb227157ef2dd0a21eec3542c8ce1b45f2df39742",
                          licenses = ["notice"],
                          generated_rule_name = "jar",
                          default_visibility = ["//visibility:private"],
                          extra_build_file_content="""
java_plugin(
    name = "plugin",
    processor_class = "lombok.launch.AnnotationProcessorHider$AnnotationProcessor",
    generates_api = True,
    deps = [":jar"],
    visibility = ["//visibility:public"]
)
java_library(
    name = "org_projectlombok_lombok",
    exports = [":jar"],
    exported_plugins = [":plugin"],
    neverlink = True,
    visibility = ["//visibility:public"]
)
""")
