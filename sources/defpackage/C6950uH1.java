package defpackage;

import io.sentry.protocol.A;
import io.sentry.protocol.z;
import java.util.ArrayList;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6950uH1 {

    @NotNull
    public final C6740tH1 a;

    public C6950uH1(@NotNull C6740tH1 c6740tH1) {
        this.a = c6740tH1;
    }

    @Nullable
    public final ArrayList a(@NotNull Map map, @Nullable ArrayList arrayList, boolean z, boolean z2) {
        ArrayList arrayListB;
        Thread threadCurrentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!map.containsKey(threadCurrentThread)) {
            map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (Map.Entry entry : map.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            boolean z3 = (thread == threadCurrentThread && !z) || !(arrayList == null || !arrayList.contains(Long.valueOf(thread.getId())) || z);
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
            Thread thread2 = (Thread) entry.getKey();
            A a = new A();
            a.g = thread2.getName();
            a.e = Integer.valueOf(thread2.getPriority());
            a.d = Long.valueOf(thread2.getId());
            a.k = Boolean.valueOf(thread2.isDaemon());
            a.h = thread2.getState().name();
            a.i = Boolean.valueOf(z3);
            if (z2 && (arrayListB = this.a.b(stackTraceElementArr, false)) != null && !arrayListB.isEmpty()) {
                z zVar = new z(arrayListB);
                zVar.g = Boolean.TRUE;
                a.m = zVar;
            }
            arrayList2.add(a);
        }
        return arrayList2;
    }
}
