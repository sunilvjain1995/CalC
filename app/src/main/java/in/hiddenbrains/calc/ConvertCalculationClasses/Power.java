package in.hiddenbrains.calc.ConvertCalculationClasses;


public class Power {
    private Double valuetoconvert;

    public Double converttoindex(Double valuetoconvert, int type){

        Double answer = 0.0;
        switch (type){

            case 0:
                answer =  valuetoconvert;
                break;

            case 1:
                answer =  valuetoconvert*1000;
                break;

            case 2:
                answer =  valuetoconvert*0.016667;
                break;

            case 3:
                answer =  valuetoconvert*1;
                break;

            case 4:
                answer =  valuetoconvert*0.027778 / 100;
                break;
        }
        return answer;
    }

    public Double converttoanswer(Double valuetoconvert , int type){
        Double answer = 0.0;

        switch (type){
            case 0:
                answer =  valuetoconvert;
                break;

            case 1:
                answer =  valuetoconvert * 0.001;
                break;

            case 2:
                answer =  valuetoconvert * 60;
                break;

            case 3:
                answer = valuetoconvert * 1;
                break;

            case 4:
                answer = valuetoconvert * 3600;
                break;
        }
        return answer;
    }

}
