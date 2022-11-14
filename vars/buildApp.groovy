def build() {
  sh 'mvn clean install'
}

def checkout(url, branch) {
    git branch: '${branch}', url: '${url}'
}