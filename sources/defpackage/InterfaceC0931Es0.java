package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Es0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0931Es0 extends IInterface {

    /* JADX INFO: renamed from: Es0$a */
    public static abstract class a extends BinderC5377mm2 implements InterfaceC0931Es0 {
        public static final /* synthetic */ int b = 0;

        /* JADX INFO: renamed from: Es0$a$a, reason: collision with other inner class name */
        public static class C0026a extends Sl2 implements InterfaceC0931Es0 {
            @Override // defpackage.InterfaceC0931Es0
            public final Bundle c(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                int i = C5797om2.a;
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        this.b.transact(1, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        parcelObtain.recycle();
                        Bundle bundle2 = (Bundle) (parcelObtain2.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(parcelObtain2));
                        parcelObtain2.recycle();
                        return bundle2;
                    } catch (RuntimeException e) {
                        parcelObtain2.recycle();
                        throw e;
                    }
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }
    }

    Bundle c(Bundle bundle);
}
