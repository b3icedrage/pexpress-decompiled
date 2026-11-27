package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class H10 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [E10] */
    /* JADX WARN: Type inference failed for: r7v0, types: [eh, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Nullable
    public static final Object a(@NotNull E10 e10, @NotNull I10 i10, @NotNull AbstractC4743jm1 abstractC4743jm1, @NotNull C3623eh c3623eh, @NotNull LM lm) {
        G10 g10;
        if (lm instanceof G10) {
            g10 = (G10) lm;
            int i = g10.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                g10.h = i - Integer.MIN_VALUE;
            } else {
                g10 = new G10(lm);
            }
        } else {
            g10 = new G10(lm);
        }
        Object objB = g10.g;
        MN mn = MN.d;
        int i2 = g10.h;
        try {
            if (i2 == 0) {
                C1795Pt1.b(objB);
                g10.d = abstractC4743jm1;
                g10.e = c3623eh;
                g10.h = 1;
                objB = e10.b(i10, g10);
                c3623eh = c3623eh;
                if (objB == mn) {
                    return mn;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Function1 function1 = g10.e;
                abstractC4743jm1 = g10.d;
                C1795Pt1.b(objB);
                c3623eh = function1;
            }
            return (O10) objB;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            c3623eh.invoke(e2);
            C3279d22 c3279d22 = C5163lm1.a;
            Intrinsics.checkNotNullParameter(abstractC4743jm1, "<this>");
            return new O10.b(abstractC4743jm1.b() ? H32.a.CALL_UP : H32.a.PUT_DOWN);
        }
    }
}
