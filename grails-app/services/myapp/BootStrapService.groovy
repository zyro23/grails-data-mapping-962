package myapp

import grails.gorm.DetachedCriteria
import grails.gorm.transactions.Transactional

@Transactional
class BootStrapService {

	void test() {
		new Dummy(name: "dummy").save()

		new DetachedCriteria(Dummy).build {
			eq "name", "dummy"
		}.updateAll(name: "updated dummy")
	}

}
