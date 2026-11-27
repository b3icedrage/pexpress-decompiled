package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: a41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2643a41 {

    @NotNull
    public final AtomicReference<a> a = new AtomicReference<>(null);

    @Nullable
    public volatile C2936bP1 b;

    @Nullable
    public volatile a c;

    /* JADX INFO: renamed from: a41$a */
    public static final class a {

        @NotNull
        public final C7083uv1 a;

        public a(@NotNull C7083uv1 action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.a = action;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(C2643a41 c2643a41, E31 e31, LM lm) {
        C2867b41 c2867b41;
        boolean zBooleanValue;
        c2643a41.getClass();
        if (lm instanceof C2867b41) {
            c2867b41 = (C2867b41) lm;
            int i = c2867b41.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2867b41.g = i - Integer.MIN_VALUE;
            } else {
                c2867b41 = new C2867b41(c2643a41, lm);
            }
        } else {
            c2867b41 = new C2867b41(c2643a41, lm);
        }
        Object objInvoke = c2867b41.d;
        Object obj = MN.d;
        int i2 = c2867b41.g;
        try {
            if (i2 == 0) {
                C1795Pt1.b(objInvoke);
                c2867b41.g = 1;
                objInvoke = e31.invoke(c2867b41);
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(objInvoke);
            }
            zBooleanValue = ((Boolean) objInvoke).booleanValue();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
