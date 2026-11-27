package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class TI extends G1 {
    public static TI e;
    public static final Map<Long, String> f;

    public class a extends HashMap<Long, String> {
    }

    static {
        a aVar = new a();
        aVar.put(461L, "FIREPERF_AUTOPUSH");
        aVar.put(462L, "FIREPERF");
        aVar.put(675L, "FIREPERF_INTERNAL_LOW");
        aVar.put(676L, "FIREPERF_INTERNAL_HIGH");
        f = Collections.unmodifiableMap(aVar);
    }

    @Override // defpackage.G1
    public final String g() {
        return "com.google.firebase.perf.LogSourceName";
    }
}
