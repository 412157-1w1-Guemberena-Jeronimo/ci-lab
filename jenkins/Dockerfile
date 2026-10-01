FROM jenkins/jenkins:lts-jdk21

USER root
RUN apt-get update \
    && apt-get install -y --no-install-recommends maven \
    && rm -rf /var/lib/apt/lists/*

USER jenkins
RUN jenkins-plugin-cli --plugins git workflow-aggregator junit pipeline-stage-view
ENV JAVA_OPTS="-Djenkins.install.runSetupWizard=false"
