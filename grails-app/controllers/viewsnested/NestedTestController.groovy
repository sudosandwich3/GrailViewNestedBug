package viewsnested


import grails.rest.*
import grails.converters.*

class NestedTestController {
	static responseFormats = ['json', 'xml']
	
    def test1() {
      MyObj obj = new MyObj(val1: 'myVa1', val2: 'myVal2', val3: 'myVal3')
      respond obj
    }

    def test2() {
      MyObj obj = new MyObj(val1: 'myVa1', val2: 'myVal2', val3: 'myVal3')
      respond obj
    }

    def test3() {
      MyObj obj = new MyObj(val1: 'myVa1', val2: 'myVal2', val3: 'myVal3')
      respond obj
    }
}
