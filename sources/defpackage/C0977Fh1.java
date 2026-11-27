package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Fh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0977Fh1 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object a(@NotNull InterfaceC1133Hh1 interfaceC1133Hh1, @NotNull Function0 function0, @NotNull LM lm) {
        C0821Dh1 frame;
        if (lm instanceof C0821Dh1) {
            frame = (C0821Dh1) lm;
            int i = frame.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                frame.h = i - Integer.MIN_VALUE;
            } else {
                frame = new C0821Dh1(lm);
            }
        } else {
            frame = new C0821Dh1(lm);
        }
        Object obj = frame.g;
        MN mn = MN.d;
        int i2 = frame.h;
        try {
            if (i2 == 0) {
                C1795Pt1.b(obj);
                if (frame.getContext().p(XF0.a.d) != interfaceC1133Hh1) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                frame.d = interfaceC1133Hh1;
                frame.e = function0;
                frame.h = 1;
                C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
                c6251qy.r();
                interfaceC1133Hh1.i(new C0899Eh1(c6251qy, 0));
                Object objQ = c6251qy.q();
                if (objQ == mn) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (objQ == mn) {
                    return mn;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = frame.e;
                C1795Pt1.b(obj);
            }
            function0.invoke();
            return Unit.a;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
    }
}
