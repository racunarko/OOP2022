package hr.fer.oop.samostalneVjezbe.vjezba03.zad06;

class XY extends SingleTypeKeyValue<Double>{

    public XY(double k, double v) {
        super(k, v);
    }

    public static boolean isIncreasingFunction(XY[] data) {
        if (data.length <= 1) {
            return true;
        }
        else {
            XY[] function = data.clone();
            for(int i = 0; i < function.length - 1; i++) {
                for(int j = i + 1; j < function.length; j++) {
                    if (function[i].getKey() > function[j].getKey()){
                        XY temp = function[i];
                        function[i] = function[j];
                        function[j] = temp;
                    }
                }
            }
            for(int i = 0; i < function.length - 1; i++) {
                if(function[i].getValue() > function[i + 1].getValue()) {
                    return false;
                }
            }
        }
        return true;
    }
}
