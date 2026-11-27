package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4860kL1 implements InterfaceC4182hL1 {

    @NotNull
    public final C6120qK1 a;

    @NotNull
    public final C1621Nn1 b;

    @Nullable
    public C2936bP1 c;

    public C4860kL1() {
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.a = c6120qK1G;
        this.b = C4466ii.e(c6120qK1G);
    }

    @Override // defpackage.InterfaceC4182hL1
    @Nullable
    public final Object a(@NotNull AbstractC8090zi1.d.a.C0552a c0552a) throws Throwable {
        Object objA = this.a.a(null, c0552a);
        return objA == MN.d ? objA : Unit.a;
    }

    @Override // defpackage.InterfaceC4182hL1
    @NotNull
    public final C1621Nn1 b() {
        return this.b;
    }

    @Override // defpackage.InterfaceC4182hL1
    @Nullable
    public final Object c(@NotNull KN kn, @NotNull J41.a aVar, @NotNull AbstractC8090zi1.d.a.C0552a c0552a) {
        Object objD = d(kn, aVar.a, c0552a);
        return objD == MN.d ? objD : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(KN kn, EnumC6804tc0 enumC6804tc0, LM lm) {
        C4392iL1 c4392iL1;
        C4860kL1 c4860kL1;
        if (lm instanceof C4392iL1) {
            c4392iL1 = (C4392iL1) lm;
            int i = c4392iL1.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4392iL1.i = i - Integer.MIN_VALUE;
            } else {
                c4392iL1 = new C4392iL1(this, lm);
            }
        } else {
            c4392iL1 = new C4392iL1(this, lm);
        }
        Object obj = c4392iL1.g;
        MN mn = MN.d;
        int i2 = c4392iL1.i;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            C6120qK1 c6120qK1 = this.a;
            c4392iL1.d = this;
            c4392iL1.e = kn;
            c4392iL1.i = 1;
            if (c6120qK1.a(enumC6804tc0, c4392iL1) == mn) {
                return mn;
            }
            c4860kL1 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kn = c4392iL1.e;
            c4860kL1 = c4392iL1.d;
            C1795Pt1.b(obj);
        }
        C2936bP1 c2936bP1 = c4860kL1.c;
        if (c2936bP1 != null) {
            c2936bP1.l(null);
        }
        c4860kL1.c = C5189lv.k(kn, null, new C4650jL1(c4860kL1, null), 3);
        return Unit.a;
    }
}
