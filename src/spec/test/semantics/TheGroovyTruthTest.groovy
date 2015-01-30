/*
 * Copyright 2003-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package semantics

class TheGroovyTruthTest extends GroovyTestCase {

    void testGroovyTruth() {
        // tag::boolean_truth[]
        assert true
        assert !false
        // end::boolean_truth[]
        
        // tag::matcher_truth[]
        assert ('a' =~ /a/)
        assert !('a' =~ /b/)
        // end::matcher_truth[]
        
        // tag::collection_truth[]
        assert [1, 2, 3]
        assert ![]
        // end::collection_truth[]
        
        // tag::iterator_enumeration_truth[]
        assert [0].iterator()
        assert ![].iterator()
        Vector v = [0] as Vector
        Enumeration enumeration = v.elements()
        assert enumeration
        enumeration.nextElement()
        assert !enumeration
        // end::iterator_enumeration_truth[]
        
        // tag::map_truth[]
        assert ['one' : 1]
        assert ![:]
        // end::map_truth[]
        
        // tag::string_truth[]
        assert 'a'
        assert !''
        def nonEmpty = 'a'
        assert "$nonEmpty"
        def empty = ''
        assert !"$empty"
        // end::string_truth[]
        
        // tag::number_truth[]
        assert 1
        assert 3.5
        assert !0
        // end::number_truth[]
        
        // tag::object_truth[]
        assert new Object()
        assert !null
        // end::object_truth[]
    }
}
