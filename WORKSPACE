workspace(name = "bazel_ls_demo_project")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
load("@bazel_tools//tools/build_defs/repo:git.bzl", "git_repository")

# bazel-skylib 0.8.0 released 2019.03.20 (https://github.com/bazelbuild/bazel-skylib/releases/tag/0.8.0)
skylib_version = "0.8.0"
http_archive(
    name = "bazel_skylib",
   type = "tar.gz",
   url = "https://github.com/bazelbuild/bazel-skylib/releases/download/{}/bazel-skylib.{}.tar.gz".format (skylib_version, skylib_version),
    sha256 = "2ef429f5d7ce7111263289644d233707dba35e39696377ebab8b0bc701f7818e",
)

# check minimum Bazel version
load("@bazel_skylib//lib:versions.bzl", "versions")
versions.check(minimum_bazel_version= "2.0.0")

git_repository(
    name = "salesforce_rules_mybuilder",
    branch = "master",
    remote = "git@github.com:salesforce/bazel-java-builder-template.git",
)

load("@salesforce_rules_mybuilder//mybuilder:repositories.bzl", "rules_mybuilder_dependencies", "rules_mybuilder_toolchains")
rules_mybuilder_dependencies()
rules_mybuilder_toolchains()

# Maven dependencies
load("//third_party/maven:dependencies.bzl", "maven_dependencies")
maven_dependencies()
