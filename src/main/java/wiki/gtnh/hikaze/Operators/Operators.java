package wiki.gtnh.hikaze.Operators;

import java.util.HashMap;
import java.util.Vector;

public class Operators extends CalculateUnit {
    public final OptType type;
    public final String label;
    public final int priority;
    public final ICalculate calculateCallBack;

    public Operators(OptType _type, String _label, int _priority, ICalculate _iCalculate, UnitType uType_) {
        super(uType_, 0f);
        type = _type;
        label = _label;
        priority = _priority;
        calculateCallBack = _iCalculate;
        OperatorMap.put(_label, this);
    }
    public double operate(double[] in){
        return calculateCallBack.calculate(in);
    }
    public static final HashMap<String, Operators> OperatorMap = new HashMap<>();
}
