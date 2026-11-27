package androidx.lifecycle;

import defpackage.C1795Pt1;
import defpackage.C2522Ys;
import defpackage.C2600Zs;
import defpackage.C2827at;
import defpackage.C2936bP1;
import defpackage.C5189lv;
import defpackage.C6266r20;
import defpackage.EY0;
import defpackage.HN;
import defpackage.LM;
import defpackage.MN;
import defpackage.QV0;
import defpackage.RV;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class b<T> extends EY0<T> {

    @Nullable
    public C2827at<T> m;

    @Override // defpackage.EY0, androidx.lifecycle.LiveData
    public final void g() {
        super.g();
        C2827at<T> c2827at = this.m;
        if (c2827at != null) {
            C2936bP1 c2936bP1 = c2827at.f;
            if (c2936bP1 != null) {
                c2936bP1.l(null);
            }
            c2827at.f = null;
            if (c2827at.e != null) {
                return;
            }
            c2827at.e = C5189lv.k(c2827at.c, null, new C2600Zs(c2827at, null), 3);
        }
    }

    @Override // defpackage.EY0, androidx.lifecycle.LiveData
    public final void h() {
        super.h();
        C2827at<T> c2827at = this.m;
        if (c2827at != null) {
            if (c2827at.f != null) {
                throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
            }
            RV rv = C6266r20.a;
            c2827at.f = C5189lv.k(c2827at.c, QV0.a.s1(), new C2522Ys(c2827at, null), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Unit n(@NotNull LM lm) {
        HN hn;
        b<T> bVar;
        if (lm instanceof HN) {
            hn = (HN) lm;
            int i = hn.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                hn.g = i - Integer.MIN_VALUE;
            } else {
                hn = new HN(this, lm);
            }
        } else {
            hn = new HN(this, lm);
        }
        Object obj = hn.d;
        MN mn = MN.d;
        int i2 = hn.g;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            bVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            bVar = null;
        }
        bVar.getClass();
        return Unit.a;
    }
}
