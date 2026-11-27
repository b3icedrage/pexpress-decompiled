package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: Wl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2320Wl0 {
    public final Map<Class<?>, Object> a;

    /* JADX INFO: renamed from: Wl0$a */
    public static final class a {
        public final HashMap a = new HashMap();
    }

    public C2320Wl0(a aVar) {
        this.a = Collections.unmodifiableMap(new HashMap(aVar.a));
    }
}
