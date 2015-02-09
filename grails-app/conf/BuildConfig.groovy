grails.project.work.dir = 'target'
grails.project.source.level = 1.6
grails.project.repos.default = "taktik"

grails.project.dependency.resolver = "maven" // or ivy

grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		mavenRepo(id: 'maven.taktik.be', url: 'http://maven.taktik.be/nexus/content/groups/public/')

		grailsCentral()
		mavenLocal()
		mavenCentral()
	}

	dependencies {
		compile 'commons-io:commons-io:2.4'
	}

	plugins {
		// plugins for the build system only
		build ":tomcat:7.0.55"

		// plugins needed at runtime but not for compilation
		runtime ":hibernate4:4.3.6.1" // or ":hibernate:3.6.10.18"

		build(	":release:3.0.1", ":rest-client-builder:1.0.3") {
            export = false
        }
	}
}
