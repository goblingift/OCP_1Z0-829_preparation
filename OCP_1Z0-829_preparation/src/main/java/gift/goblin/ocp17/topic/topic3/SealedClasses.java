/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gift.goblin.ocp17.topic.topic3;

/**
 *
 * @author andre
 */
public class SealedClasses {
    
}

sealed class Animal permits Fish, Bird {}
final class Bird extends Animal {}
non-sealed class Fish extends Animal {}

sealed interface Eatable permits Fishy {}
non-sealed interface Fishy extends Eatable {}