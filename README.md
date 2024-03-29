![GitHub Actions](https://github.com/salesforce/bazel-ls-demo-project/workflows/CI/badge.svg)
[![](https://img.shields.io/badge/license-BSD-blue.svg)](https://opensource.org/licenses/BSD-3-Clause)

# bazel-ls-demo-project

Demo project for testing and developing the Bazel language server.
The initial focus is on **Java**.

While Bazel provides a ton of flexibility, this flexibility is not something the Bazel language server will support initially.
Instead we are starting with a focus on a recommended module structure extremely similar to Maven projects.

![Dependency graph](https://g.gravizo.com/svg?digraph%20mygraph%20%7B%0A%20%20node%20%5Bshape%3Dbox%5D%3B%0A%20%20%22%2F%2Fmodule1%3Amodule1%22%0A%20%20%22%2F%2Fmodule1%3Amodule1%22%20-%3E%20%22%2F%2Fmodule1%3Amybuilder_sample_generation%22%0A%20%20%22%2F%2Fmodule1%3Amodule1%22%20-%3E%20%22%2F%2Fmodule2%3Amodule2%22%0A%20%20%22%2F%2Fmodule1%3Amodule1%22%20-%3E%20%22%2F%2Fmodule3%3Amodule3%22%0A%20%20%22%2F%2Fmodule1%3Amodule1%22%20-%3E%20%22%2F%2Fmodule1%3Ajava%2Fsrc%2Fhello%2FHello.java%22%0A%20%20%22%2F%2Fmodule1%3Amodule1%22%20-%3E%20%22%40com_google_guava%2F%2Fjar%3Ajar%22%0A%20%20%22%2F%2Fmodule1%3Amodule1%22%20-%3E%20%22%2F%2Fmodule1%3Ajava%2Fresources%2Fhello.txt%22%0A%20%20%22%2F%2Fmodule1%3Ajava%2Fsrc%2Fhello%2FHello.java%22%0A%20%20%22%2F%2Fmodule1%3Amybuilder_sample_generation%22%0A%20%20%22%2F%2Fmodule1%3Amybuilder_sample_generation%22%20-%3E%20%22%2F%2Fmodule1%3Ajava%2Fresources%2Fhello.txt%22%0A%20%20%22%2F%2Fmodule1%3Ajava%2Fresources%2Fhello.txt%22%0A%20%20%22%2F%2Fmodule2%3Amodule2%22%0A%20%20%22%2F%2Fmodule2%3Amodule2%22%20-%3E%20%22%2F%2Fmodule3%3Amodule3%22%0A%20%20%22%2F%2Fmodule2%3Amodule2%22%20-%3E%20%22%2F%2Fmodule2%3Ajava%2Fsrc%2Flibrary%2FGreeting.java%22%0A%20%20%22%2F%2Fmodule2%3Ajava%2Fsrc%2Flibrary%2FGreeting.java%22%0A%20%20%22%2F%2Fmodule3%3Amodule3%22%0A%20%20%22%2F%2Fmodule3%3Amodule3%22%20-%3E%20%22%2F%2Fmodule3%3Ajava%2Fsrc%2Flog%2FLogger.java%22%0A%20%20%22%2F%2Fmodule3%3Ajava%2Fsrc%2Flog%2FLogger.java%22%0A%20%20%22%40com_google_guava%2F%2Fjar%3Ajar%22%0A%20%20%22%40com_google_guava%2F%2Fjar%3Ajar%22%20-%3E%20%22%40com_google_guava%2F%2F%3Acom_google_guava%22%0A%20%20%22%40com_google_guava%2F%2F%3Acom_google_guava%22%0A%20%20%22%40com_google_guava%2F%2F%3Acom_google_guava%22%20-%3E%20%22%40com_google_guava%2F%2F%3Aguava-28.2-jre.jar%22%0A%20%20%22%40com_google_guava%2F%2F%3Aguava-28.2-jre.jar%22%0A%7D)


# VSCode tasks

You can use the example from the tasks.json file to create VSCode tasks.

The example runs a [Bazel Query](https://docs.bazel.build/versions/main/query-how-to.html) and expects a module name from the input area. 