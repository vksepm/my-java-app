# To learn more about how to use Nix to configure your environment
# see: https://developers.google.com/idx/guides/customize-idx-env
{ pkgs, ... }: {
  # Which nixpkgs channel to use.
  channel = "stable-23.11"; # or "unstable"
  # Use https://search.nixos.org/packages to find packages
  packages = [
    pkgs.zulu17
    pkgs.maven
    pkgs.sudo
  ];
  services.docker.enable = true;
  # Sets environment variables in the workspace
  env = {};
  idx = {
    # Search for the extensions you want on https://open-vsx.org/ and use "publisher.id"
    extensions = [
      "vscjava.vscode-java-pack"
      "rangav.vscode-thunder-client"
      "vscjava.vscode-java-debug"
      "vscjava.vscode-java-pack"
      "redhat.java"
      "vscjava.vscode-maven"
      "vscjava.vscode-java-dependency"
      "vscjava.vscode-java-test"
      "redhat.vscode-xml"
      "VMware.vscode-spring-boot"
      "VMware.vscode-boot-dev-pack"
      "vscjava.vscode-spring-initializr"
      "vscjava.vscode-spring-boot-dashboard"
    ];
          # "ms-azuretools.vscode-docker"
    workspace = {
      # Runs when a workspace is first created with this `dev.nix` file
      onCreate = {
        install = "mvn clean install";
      };
      # Runs when a workspace is (re)started
      # onStart = {
      #   run-server = "PORT=3000 mvn spring-boot:run";
      # };
    };
  };
}
