package bankaccountApp;

//create interface - bring info from else where
public interface IBaseRate {

    //method to return base rate
    default double getRate() {
        return 2.5;
    }

}
