package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6853tp {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object a(@NotNull C5594np c5594np, @NotNull LM lm) {
        C6643sp c6643sp;
        if (lm instanceof C6643sp) {
            c6643sp = (C6643sp) lm;
            int i = c6643sp.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6643sp.e = i - Integer.MIN_VALUE;
            } else {
                c6643sp = new C6643sp(lm);
            }
        } else {
            c6643sp = new C6643sp(lm);
        }
        Object objP = c6643sp.d;
        MN mn = MN.d;
        int i2 = c6643sp.e;
        try {
            if (i2 == 0) {
                C1795Pt1.b(objP);
                C1717Ot1.a aVar = C1717Ot1.e;
                c6643sp.e = 1;
                objP = C5189lv.p(C6266r20.c, new C6014pp(c5594np, null), c6643sp);
                if (objP == mn) {
                    return mn;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(objP);
            }
            C1717Ot1.a aVar2 = C1717Ot1.e;
            return objP;
        } catch (Throwable th) {
            C1717Ot1.a aVar3 = C1717Ot1.e;
            return C1795Pt1.a(th);
        }
    }
}
