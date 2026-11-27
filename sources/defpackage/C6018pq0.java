package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: pq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6018pq0 {

    @NotNull
    public static final IntRange b = new IntRange(400, 499, 1);

    @NotNull
    public static final Set<Integer> c = C5487nJ1.b(401);

    @NotNull
    public static final Regex d = new Regex("\\d+|[0-9a-fA-F-]{16,}");

    @NotNull
    public static final List<String> e = WE.f("jivosite", "firebase");

    @NotNull
    public final ConcurrentHashMap<String, AtomicInteger> a = new ConcurrentHashMap<>();

    public final boolean a(String str) {
        AtomicInteger atomicIntegerPutIfAbsent;
        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = this.a;
        AtomicInteger atomicInteger = concurrentHashMap.get(str);
        if (atomicInteger == null && (atomicIntegerPutIfAbsent = concurrentHashMap.putIfAbsent(str, (atomicInteger = new AtomicInteger()))) != null) {
            atomicInteger = atomicIntegerPutIfAbsent;
        }
        return atomicInteger.incrementAndGet() <= 3;
    }
}
