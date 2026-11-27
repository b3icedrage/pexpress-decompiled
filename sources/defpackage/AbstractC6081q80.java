package defpackage;

import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: q80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class AbstractC6081q80 {

    /* JADX INFO: renamed from: q80$a */
    @AutoValue.Builder
    public static abstract class a {
        public final void a(String str, String str2) {
            HashMap map = ((C7060uo.a) this).f;
            if (map == null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put(str, str2);
        }
    }

    public final String a(String str) {
        String str2 = b().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map<String, String> b();

    public abstract Integer c();

    public abstract B60 d();

    public abstract long e();

    public final int f(String str) {
        String str2 = b().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract String g();

    public abstract long h();

    public final C7060uo.a i() {
        C7060uo.a aVar = new C7060uo.a();
        String strG = g();
        if (strG == null) {
            throw new NullPointerException("Null transportName");
        }
        aVar.a = strG;
        aVar.b = c();
        B60 b60D = d();
        if (b60D == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        aVar.c = b60D;
        aVar.d = Long.valueOf(e());
        aVar.e = Long.valueOf(h());
        aVar.f = new HashMap(b());
        return aVar;
    }
}
