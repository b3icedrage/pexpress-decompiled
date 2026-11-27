package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: gx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4097gx {
    static {
        Object objA;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            objA = Class.forName("java.lang.ClassValue");
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        if (!(objA instanceof C1717Ot1.b)) {
            objA = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (objA instanceof C1717Ot1.b) {
            objA = obj;
        }
    }

    @NotNull
    public static final UH a(@NotNull Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        return new UH(compute);
    }
}
