package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ty, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6880ty {
    public static final void a(@NotNull JM jm, @NotNull AbstractC2625a0 abstractC2625a0) {
        try {
            JM jmB = C5885pC0.b(jm);
            C1717Ot1.a aVar = C1717Ot1.e;
            UE.s(jmB, Unit.a);
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            abstractC2625a0.resumeWith(C1795Pt1.a(th));
            throw th;
        }
    }

    public static void b(Function2 function2, AbstractC2625a0 abstractC2625a0, AbstractC2625a0 abstractC2625a1) {
        try {
            JM jmB = C5885pC0.b(C5885pC0.a(abstractC2625a0, abstractC2625a1, function2));
            C1717Ot1.a aVar = C1717Ot1.e;
            UE.s(jmB, Unit.a);
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            abstractC2625a1.resumeWith(C1795Pt1.a(th));
            throw th;
        }
    }
}
