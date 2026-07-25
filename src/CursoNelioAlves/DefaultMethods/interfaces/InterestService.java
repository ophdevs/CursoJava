package CursoNelioAlves.DefaultMethods.interfaces;

import java.security.InvalidParameterException;

public interface InterestService {
    double getInterestRate();

    default double payment(double valor, int meses){
        if( meses < 1){
            throw new InvalidParameterException("meses tem que ser maior");
        }
        return valor * Math.pow(1.0 + getInterestRate() / 100, meses);
    }
}
