/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gift.goblin.ocp17.topic.topic1;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author andre
 */
public class DateTimeAPI {
    
    public void doWork() {
        doDateObjects();
        doPeriod();
        doDuration();
        doInstant();
    }
    
    
    private void doDateObjects() {
        
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println(zonedDateTime);
        
        localDate = localDate.plus(1, ChronoUnit.MONTHS);
        localTime = localTime.plus(1, ChronoUnit.HOURS);
        localDateTime = localDateTime.minus(2, ChronoUnit.WEEKS);
        zonedDateTime = zonedDateTime.minus(10, ChronoUnit.SECONDS);
        
        System.out.println("_________");
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println(zonedDateTime);
        
    }
    
    private void doPeriod() {
        
        Period p1 = Period.of(1, 2, 10);            // P1Y2M10D
        Period periodDays = Period.ofDays(10);      // P10D
        Period periodMonths = Period.ofMonths(2);   // P2M
        Period periodYears = Period.ofYears(1);     // P1Y
        
        System.out.println("periodDays:" + periodDays);
        System.out.println("periodMonthy:" + periodMonths);
        System.out.println("periodYears:" + periodYears);
        System.out.println("Period:" + p1);
        
        LocalDate ld = LocalDate.of(2022, 10, 15);
        LocalDate ldNextYear = ld.plus(periodYears);
        System.out.println(ldNextYear);
        
    }
    
    private void doDuration() {
        
        Duration d1 = Duration.of(10, ChronoUnit.DAYS); // PT240H
        Duration d2 = Duration.of(5, ChronoUnit.MINUTES); // PT5M
        
        System.out.println(d1);
        System.out.println(d2);
        
        Duration d3 = Duration.ofDays(2);       // PT48H
        Duration d4 = Duration.ofMillis(50);    //PT0.05S
        System.out.println("d3:" + d3);
        System.out.println("d4:" + d4);
        
    }
    
    private void doInstant() {
        Instant i1 = Instant.now();
        Instant i2 = ZonedDateTime.now().toInstant();
        System.out.println(i1);
        System.out.println(i2);
    }
    
    
}
