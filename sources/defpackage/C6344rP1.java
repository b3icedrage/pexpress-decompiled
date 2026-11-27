package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6344rP1 {

    @NotNull
    public final Object a = new Object();

    @NotNull
    public final LinkedHashMap b = new LinkedHashMap();

    public final boolean a(@NotNull C3429dk2 id) {
        boolean zContainsKey;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.a) {
            zContainsKey = this.b.containsKey(id);
        }
        return zContainsKey;
    }

    @Nullable
    public final C6135qP1 b(@NotNull C3429dk2 id) {
        C6135qP1 c6135qP1;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.a) {
            c6135qP1 = (C6135qP1) this.b.remove(id);
        }
        return c6135qP1;
    }

    @NotNull
    public final List<C6135qP1> c(@NotNull String workSpecId) {
        List<C6135qP1> listE0;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.a) {
            try {
                LinkedHashMap linkedHashMap = this.b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (Intrinsics.a(((C3429dk2) entry.getKey()).a, workSpecId)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    this.b.remove((C3429dk2) it.next());
                }
                listE0 = CollectionsKt.e0(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return listE0;
    }

    @NotNull
    public final C6135qP1 d(@NotNull C3429dk2 id) {
        C6135qP1 c6135qP1;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.a) {
            try {
                LinkedHashMap linkedHashMap = this.b;
                Object c6135qP2 = linkedHashMap.get(id);
                if (c6135qP2 == null) {
                    c6135qP2 = new C6135qP1(id);
                    linkedHashMap.put(id, c6135qP2);
                }
                c6135qP1 = (C6135qP1) c6135qP2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6135qP1;
    }
}
