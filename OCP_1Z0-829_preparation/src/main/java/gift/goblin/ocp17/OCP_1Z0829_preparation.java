/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gift.goblin.ocp17;

import gift.goblin.ocp17.topic.topic1.DateTimeAPI;
import gift.goblin.ocp17.topic.topic1.MathApi;
import gift.goblin.ocp17.topic.topic1.PrimitivesWrapperMathAPICastings;
import gift.goblin.ocp17.topic.topic1.StringMethods;
import gift.goblin.ocp17.topic.topic2.SwitchStatements;
import gift.goblin.ocp17.topic.topic3.EnumerationExample;
import gift.goblin.ocp17.topic.topic3.FunctionalInterfaces;
import gift.goblin.ocp17.topic.topic3.ImmutableObjects;
import gift.goblin.ocp17.topic.topic3.NestedClasses;
import gift.goblin.ocp17.topic.topic3.RecordsExamples;
import gift.goblin.ocp17.topic.topic3.VarargsExample;
import gift.goblin.ocp17.topic.topic4.ExceptionInheritance;

/**
 *
 * @author andre
 */
public class OCP_1Z0829_preparation {

    public static void main(String[] args) {
        // Topic 1
        new PrimitivesWrapperMathAPICastings().doWork();
        new MathApi().doWork();
        new StringMethods().doWork();
        new DateTimeAPI().doWork();
        
        // Topic 2
        new SwitchStatements().doWork();
        
        // Topic 3
        new NestedClasses().doWork();
        new RecordsExamples().doWork();
        new VarargsExample().doWork();
        new ImmutableObjects().doWork();
        new FunctionalInterfaces().doWork();
        new EnumerationExample().doWork();
        
        // Topic 4
        new ExceptionInheritance().doWork();
    }
}
