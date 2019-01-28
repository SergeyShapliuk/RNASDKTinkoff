package ru.tinkoff.acquiring.sdk;

/**
 * @author Vitaliy Markus
 */
public interface IBaseSdkActivity {

    void success();

    void cancel();

    void showProgressDialog();

    void hideProgressDialog();

    void exception(Throwable throwable);

    void start3DS(ThreeDsData data);

    void showErrorDialog(Exception e);

    void noNetwork();

    AcquiringSdk getSdk();
}
