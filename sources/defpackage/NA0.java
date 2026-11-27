package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class NA0 extends ApiException {
    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
    /* JADX WARN: Illegal instructions before constructor call */
    public NA0(int i) {
        String strC;
        Locale locale = Locale.getDefault();
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = Dm2.a;
        Integer numValueOf2 = Integer.valueOf(i);
        if (map.containsKey(numValueOf2)) {
            HashMap map2 = Dm2.b;
            if (map2.containsKey(numValueOf2)) {
                strC = ID.c((String) map.get(numValueOf2), " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#", (String) map2.get(numValueOf2), ")");
            } else {
                strC = "";
            }
        } else {
            strC = "";
        }
        super(new Status(i, String.format(locale, "Install Error(%d): %s", numValueOf, strC)));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
