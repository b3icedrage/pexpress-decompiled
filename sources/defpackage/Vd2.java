package defpackage;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Vd2 {

    @NotNull
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        for (Qd2 qd2 : this.a.values()) {
            qd2.c = true;
            HashMap map = qd2.a;
            if (map != null) {
                synchronized (map) {
                    try {
                        Iterator it = qd2.a.values().iterator();
                        while (it.hasNext()) {
                            Qd2.g(it.next());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            LinkedHashSet linkedHashSet = qd2.b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = qd2.b.iterator();
                        while (it2.hasNext()) {
                            Qd2.g((Closeable) it2.next());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            qd2.h();
        }
        this.a.clear();
    }
}
