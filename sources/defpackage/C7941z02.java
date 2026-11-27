package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: z02, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7941z02 {
    public static WeakReference<C7941z02> b;
    public AK1 a;

    public final synchronized C7731y02 a() {
        String strPeek;
        C7731y02 c7731y02;
        AK1 ak1 = this.a;
        synchronized (ak1.d) {
            strPeek = ak1.d.peek();
        }
        Pattern pattern = C7731y02.d;
        c7731y02 = null;
        if (!TextUtils.isEmpty(strPeek)) {
            String[] strArrSplit = strPeek.split("!", -1);
            if (strArrSplit.length == 2) {
                c7731y02 = new C7731y02(strArrSplit[0], strArrSplit[1]);
            }
        }
        return c7731y02;
    }
}
