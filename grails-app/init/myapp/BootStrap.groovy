package myapp

class BootStrap {

    BootStrapService bootStrapService

    def init = { servletContext ->
        bootStrapService.test()
    }
    def destroy = {
    }
}
