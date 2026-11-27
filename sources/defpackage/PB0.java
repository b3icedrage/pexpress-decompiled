package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class PB0 extends ApiException {
    public final Exception d;

    /* JADX WARN: Code duplicated, block: B:8:0x002e  */
    /* JADX WARN: Illegal instructions before constructor call */
    public PB0(int i, Exception exc) {
        String strC;
        Locale locale = Locale.ROOT;
        HashMap map = Rl2.a;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            HashMap map2 = Rl2.b;
            if (map2.containsKey(numValueOf)) {
                strC = ID.c((String) map.get(numValueOf), " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/IntegrityErrorCode.html#", (String) map2.get(numValueOf), ")");
            } else {
                strC = "";
            }
        } else {
            strC = "";
        }
        super(new Status(i, "Integrity API error (" + i + "): " + strC + "."));
        if (i == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.d = exc;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.d;
    }
}
