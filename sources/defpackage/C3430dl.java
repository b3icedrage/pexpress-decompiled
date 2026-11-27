package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3430dl {

    @NotNull
    public static final ConcurrentHashMap<String, InterfaceC3220cl> a = new ConcurrentHashMap<>();

    @NotNull
    public static final ConcurrentHashMap<String, InterfaceC3220cl> b = new ConcurrentHashMap<>();

    @NotNull
    public static final ConcurrentHashMap<String, String> c = new ConcurrentHashMap<>();

    @NotNull
    public static final ConcurrentHashMap<String, AtomicInteger> d = new ConcurrentHashMap<>();

    @NotNull
    public static final ConcurrentHashMap<String, Integer> e = new ConcurrentHashMap<>();

    @Nullable
    public static String a(@NotNull String flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        return c.get(flow);
    }

    public static void b(String str, InterfaceC3220cl interfaceC3220cl) {
        AtomicInteger atomicIntegerPutIfAbsent;
        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = d;
        AtomicInteger atomicInteger = concurrentHashMap.get(str);
        if (atomicInteger == null && (atomicIntegerPutIfAbsent = concurrentHashMap.putIfAbsent(str, (atomicInteger = new AtomicInteger()))) != null) {
            atomicInteger = atomicIntegerPutIfAbsent;
        }
        int iIncrementAndGet = atomicInteger.incrementAndGet();
        e.put(str, Integer.valueOf(iIncrementAndGet));
        interfaceC3220cl.b("auth.attempt_number", String.valueOf(iIncrementAndGet));
    }

    public static void c(@NotNull InterfaceC3220cl attempt) {
        Intrinsics.checkNotNullParameter(attempt, "attempt");
        b.values().remove(attempt);
    }
}
