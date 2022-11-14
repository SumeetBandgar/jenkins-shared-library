def build() {
  sh 'mvn clean install'
}

def checkout(String url, String branch) {
    git branch: ${branch}, url: ${url}
}