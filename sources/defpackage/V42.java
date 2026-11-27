package defpackage;

import android.util.Base64;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class V42 {
    public abstract String a();

    public abstract byte[] b();

    public abstract EnumC6825th1 c();

    public final C1778Po d(EnumC6825th1 enumC6825th1) {
        String strA = a();
        if (strA == null) {
            throw new NullPointerException("Null backendName");
        }
        if (enumC6825th1 != null) {
            return new C1778Po(strA, b(), enumC6825th1);
        }
        throw new NullPointerException("Null priority");
    }

    public final String toString() {
        String strA = a();
        EnumC6825th1 enumC6825th1C = c();
        String strEncodeToString = b() == null ? "" : Base64.encodeToString(b(), 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(strA);
        sb.append(", ");
        sb.append(enumC6825th1C);
        sb.append(", ");
        return C5807oq.b(sb, strEncodeToString, ")");
    }
}
