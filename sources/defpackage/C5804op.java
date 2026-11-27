package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: op, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5804op {

    @NotNull
    public final C1782Pp0 a;

    public C5804op() {
        C8056za engineFactory = C8056za.e;
        Intrinsics.checkNotNullParameter("js.glzwizhsaraw3ncm6lpa4.1co5ez1ole9vl51nod9lf", "apiKey");
        Intrinsics.checkNotNullParameter("https://jitsu.pbotservices.com", "host");
        Intrinsics.checkNotNullParameter(engineFactory, "httpClientFactory");
        C2483Yf block = new C2483Yf(1);
        Intrinsics.checkNotNullParameter(engineFactory, "engineFactory");
        Intrinsics.checkNotNullParameter(block, "block");
        C2332Wp0 c2332Wp0 = new C2332Wp0();
        block.invoke(c2332Wp0);
        C2332Wp0.a block2 = c2332Wp0.d;
        Intrinsics.checkNotNullParameter(block2, "block");
        C7131v81 c7131v81 = new C7131v81();
        block2.invoke(c7131v81);
        C7341w81 c7341w81 = new C7341w81(c7131v81);
        C1782Pp0 c1782Pp0 = new C1782Pp0(c7341w81, c2332Wp0);
        CoroutineContext.Element elementP = c1782Pp0.h.p(XF0.a.d);
        Intrinsics.checkNotNull(elementP);
        ((XF0) elementP).W(new C4536iq0(c7341w81, 0));
        this.a = c1782Pp0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@NotNull ArrayList arrayList, @NotNull LM lm) {
        C5384mp c5384mp;
        if (lm instanceof C5384mp) {
            c5384mp = (C5384mp) lm;
            int i = c5384mp.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5384mp.g = i - Integer.MIN_VALUE;
            } else {
                c5384mp = new C5384mp(this, lm);
            }
        } else {
            c5384mp = new C5384mp(this, lm);
        }
        Object obj = c5384mp.d;
        MN mn = MN.d;
        int i2 = c5384mp.g;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return ((C1717Ot1) obj).d;
        }
        C1795Pt1.b(obj);
        C5594np c5594np = new C5594np(this, arrayList, null);
        c5384mp.g = 1;
        Object objA = C6853tp.a(c5594np, c5384mp);
        return objA == mn ? mn : objA;
    }
}
