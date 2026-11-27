package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: wS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7403wS0 implements InterfaceC2953bV0 {
    public final ThreadLocal<Map<String, String>> d = new ThreadLocal<>();
    public final ThreadLocal<Integer> e = new ThreadLocal<>();

    @Override // defpackage.InterfaceC2953bV0
    public final Map<String, String> c() {
        Map<String, String> map = this.d.get();
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }
}
