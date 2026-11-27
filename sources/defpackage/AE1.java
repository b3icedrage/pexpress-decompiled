package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AE1 {

    @NotNull
    public static final C7782yE1 a = new C7782yE1(new byte[0], 0, 0, false, false);
    public static final int b;

    @NotNull
    public static final AtomicReference<C7782yE1>[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference<C7782yE1>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        c = atomicReferenceArr;
    }

    public static final void a(@NotNull C7782yE1 segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f != null || segment.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.d) {
            return;
        }
        AtomicReference<C7782yE1> atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        C7782yE1 c7782yE1 = a;
        C7782yE1 andSet = atomicReference.getAndSet(c7782yE1);
        if (andSet == c7782yE1) {
            return;
        }
        int i = andSet != null ? andSet.c : 0;
        if (i >= 65536) {
            atomicReference.set(andSet);
            return;
        }
        segment.f = andSet;
        segment.b = 0;
        segment.c = i + 8192;
        atomicReference.set(segment);
    }

    @NotNull
    public static final C7782yE1 b() {
        AtomicReference<C7782yE1> atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        C7782yE1 c7782yE1 = a;
        C7782yE1 andSet = atomicReference.getAndSet(c7782yE1);
        if (andSet == c7782yE1) {
            return new C7782yE1();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new C7782yE1();
        }
        atomicReference.set(andSet.f);
        andSet.f = null;
        andSet.c = 0;
        return andSet;
    }
}
