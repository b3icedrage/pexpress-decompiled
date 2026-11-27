package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Pt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1795Pt1 {
    @NotNull
    public static final C1717Ot1.b a(@NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new C1717Ot1.b(exception);
    }

    public static final void b(@NotNull Object obj) {
        if (obj instanceof C1717Ot1.b) {
            throw ((C1717Ot1.b) obj).d;
        }
    }
}
