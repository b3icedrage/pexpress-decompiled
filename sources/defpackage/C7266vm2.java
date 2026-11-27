package defpackage;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: renamed from: vm2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7266vm2 {
    public final String a;

    public C7266vm2(String str) {
        this.a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    public static String b(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = ID.c(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return C2629a1.b(str, " : ", str2);
    }

    public final void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            b(this.a, str, objArr);
        }
    }
}
