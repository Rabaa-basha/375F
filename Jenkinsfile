node {

    checkout scm

    docker.withRegistry('https://registry.hub.docker.com', 'Bibo14201') {

        def customImage = docker.build("first")

        /* Push the container to the custom Registry */
        customImage.push()
    }
}
