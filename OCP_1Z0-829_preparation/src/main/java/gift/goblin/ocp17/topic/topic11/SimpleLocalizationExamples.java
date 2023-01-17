package gift.goblin.ocp17.topic.topic11;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author goblingift
 */
public class SimpleLocalizationExamples {
    
    public void doWork() {
        doSimpleLocaleObjects();
        doNumberFormat();
        doNumberFormatPercentage();
        doNumberFormatCurrency();
        doCompactNumberFormat();
    }
    
    private void doSimpleLocaleObjects() {
        Locale defaultLocale = Locale.getDefault();
        System.out.println("Default locale:" + defaultLocale);
        
        Locale germanLocale = new Locale("de", "DE");
        
        Locale usaLocale = Locale.US;
        Locale localeFrench = Locale.FRENCH;
                
        Locale germanLocale2 = new Locale.Builder().setLanguage("de").setRegion("DE").build();
    }
    
    private void doNumberFormat() {
        NumberFormat numberFormatDE = NumberFormat.getInstance(Locale.GERMANY);
        NumberFormat numberFormatUS = NumberFormat.getInstance(Locale.US);
        
        double d = 92_828.90;
        
        String formattedDe = numberFormatDE.format(d);
        String formattedUs = numberFormatUS.format(d);
        System.out.println("de:" + formattedDe);
        System.out.println("us:" + formattedUs);
        
        try {
            Number parsed = numberFormatDE.parse("1.000,89");
            System.out.println(parsed);
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private void doNumberFormatPercentage() {
        NumberFormat numberFormatDE = NumberFormat.getPercentInstance(Locale.GERMANY);
        String percent = numberFormatDE.format(0.842);
        System.out.println(percent);
    }
    
    private void doNumberFormatCurrency() {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.US);
        String money = currencyInstance.format(89_271.33);
        System.out.println(money);
    }
    
    private void doCompactNumberFormat() {
        NumberFormat shortNumber = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        NumberFormat longNumber = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        System.out.println(shortNumber.format(9_829_242.98));
        System.out.println(longNumber.format(9_829_242.98));
    }
    
}
