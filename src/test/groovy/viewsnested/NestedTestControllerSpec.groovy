package viewsnested

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification
import viewsnested.NestedTestController

class NestedTestControllerSpec extends Specification
    implements ControllerUnitTest<NestedTestController>
{

  void 'test1'() {
    when:
    controller.test1()
    then:
    response.json
  }

  void 'test2'() {
    when:
    controller.test2()
    then:
    response.json
  }

  void 'test3'() {
    when:
    controller.test3()
    then:
    response.json
  }
}
