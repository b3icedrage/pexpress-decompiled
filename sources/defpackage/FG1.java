package defpackage;

import io.sentry.exception.a;
import io.sentry.protocol.l;
import io.sentry.protocol.s;
import io.sentry.protocol.z;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class FG1 {

    @NotNull
    public final C6740tH1 a;

    public FG1(@NotNull C6740tH1 c6740tH1) {
        this.a = c6740tH1;
    }

    @NotNull
    public static s b(@NotNull Throwable th, @Nullable l lVar, @Nullable Long l, @Nullable List list, boolean z) {
        Package r0 = th.getClass().getPackage();
        String name = th.getClass().getName();
        s sVar = new s();
        String message = th.getMessage();
        if (r0 != null) {
            name = name.replace(r0.getName() + ".", "");
        }
        String name2 = r0 != null ? r0.getName() : null;
        if (list != null && !list.isEmpty()) {
            z zVar = new z(list);
            if (z) {
                zVar.g = Boolean.TRUE;
            }
            sVar.i = zVar;
        }
        sVar.h = l;
        sVar.d = name;
        sVar.j = lVar;
        sVar.g = name2;
        sVar.e = message;
        return sVar;
    }

    public final void a(@NotNull Throwable th, @NotNull AtomicInteger atomicInteger, @NotNull HashSet hashSet, @NotNull ArrayDeque arrayDeque, @Nullable String str) {
        Thread threadCurrentThread;
        l lVar;
        boolean z;
        int iIncrementAndGet = atomicInteger.get();
        String str2 = str;
        while (th != null && hashSet.add(th)) {
            if (str2 == null) {
                str2 = "chained";
            }
            if (th instanceof a) {
                a aVar = (a) th;
                l lVar2 = aVar.d;
                Throwable th2 = aVar.e;
                threadCurrentThread = aVar.g;
                z = aVar.h;
                th = th2;
                lVar = lVar2;
            } else {
                l lVar3 = new l();
                threadCurrentThread = Thread.currentThread();
                lVar = lVar3;
                z = false;
            }
            s sVarB = b(th, lVar, threadCurrentThread != null ? Long.valueOf(threadCurrentThread.getId()) : null, this.a.b(th.getStackTrace(), Boolean.FALSE.equals(lVar.h)), z);
            ArrayDeque arrayDeque2 = arrayDeque;
            arrayDeque2.addFirst(sVarB);
            if (lVar.d == null) {
                lVar.d = str2;
            }
            if (atomicInteger.get() >= 0) {
                lVar.m = Integer.valueOf(iIncrementAndGet);
            }
            iIncrementAndGet = atomicInteger.incrementAndGet();
            lVar.l = Integer.valueOf(iIncrementAndGet);
            Throwable[] suppressed = th.getSuppressed();
            if (suppressed != null && suppressed.length > 0) {
                int length = suppressed.length;
                int i = 0;
                while (i < length) {
                    a(suppressed[i], atomicInteger, hashSet, arrayDeque2, "suppressed");
                    i++;
                    arrayDeque2 = arrayDeque;
                }
            }
            th = th.getCause();
            str2 = null;
        }
    }
}
