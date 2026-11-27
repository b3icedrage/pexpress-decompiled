package defpackage;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: sr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6649sr {
    public final Map<String, Method> a;
    public final Map<String, Method> b;
    public final Map<String, Method> c;

    public C6649sr(HashMap map, HashMap map2, HashMap map3) {
        this.a = Collections.unmodifiableMap(map);
        this.b = Collections.unmodifiableMap(map2);
        this.c = Collections.unmodifiableMap(map3);
    }
}
