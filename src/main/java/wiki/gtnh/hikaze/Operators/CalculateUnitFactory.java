package wiki.gtnh.hikaze.Operators;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class CalculateUnitFactory {
    public static CalculateUnit Generate(String unit){
        if(StringUtils.isNumeric(unit)){
            return new CalculateUnit(UnitType.NUMBER, NumberUtils.createDouble(unit));
        }else if(){

        }else{
            return Operators.OperatorMap.get(unit);
        }
    }
}
