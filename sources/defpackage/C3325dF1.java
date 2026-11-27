package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: dF1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3325dF1 implements XE1 {

    @NotNull
    public final AbstractC7949z22 a;

    @NotNull
    public final C4923kf b;

    @NotNull
    public final AbstractC2199Uy0 c;

    @NotNull
    public final C6120qK1 d;

    @NotNull
    public final C1621Nn1 e;

    public C3325dF1(@NotNull AbstractC7949z22 tradingAssetsProvider, @NotNull C4923kf appData, @NotNull AbstractC2199Uy0 indicatorUseCase) {
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(indicatorUseCase, "indicatorUseCase");
        this.a = tradingAssetsProvider;
        this.b = appData;
        this.c = indicatorUseCase;
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.d = c6120qK1G;
        this.e = C4466ii.e(c6120qK1G);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:53:0x0109 A[PHI: r7 r8
      0x0109: PHI (r7v14 'indicator' Lx0) = (r7v9 'indicator' Lx0), (r7v17 'indicator' Lx0) binds: [B:51:0x0106, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r8v15 dF1) = (r8v12 dF1), (r8v17 dF1) binds: [B:51:0x0106, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r9.a(r2, r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
    
        if (r8.a(r9, r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ee, code lost:
    
        if (r8.a(r9, r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011e, code lost:
    
        if (r8.a(r9, r0) == r1) goto L55;
     */
    @Override // defpackage.XE1
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull defpackage.C1491Lx0 r7, boolean r8, @org.jetbrains.annotations.NotNull defpackage.LM r9) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3325dF1.a(Lx0, boolean, LM):java.lang.Object");
    }

    @Override // defpackage.XE1
    @NotNull
    public final C1621Nn1 b() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(C1491Lx0 c1491Lx0, LM lm) {
        ZE1 ze1;
        if (lm instanceof ZE1) {
            ze1 = (ZE1) lm;
            int i = ze1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ze1.h = i - Integer.MIN_VALUE;
            } else {
                ze1 = new ZE1(this, lm);
            }
        } else {
            ze1 = new ZE1(this, lm);
        }
        Object objO = ze1.e;
        MN mn = MN.d;
        int i2 = ze1.h;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            InterfaceC6396rf0<String> interfaceC6396rf0L = this.c.l();
            ze1.d = c1491Lx0;
            ze1.h = 1;
            objO = C4466ii.o(interfaceC6396rf0L, ze1);
            if (objO == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1491Lx0 = ze1.d;
            C1795Pt1.b(objO);
        }
        return Boolean.valueOf(!Intrinsics.a(objO, c1491Lx0.b));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(C1491Lx0 c1491Lx0, LM lm) {
        C2682aF1 c2682aF1;
        C3325dF1 c3325dF1;
        if (lm instanceof C2682aF1) {
            c2682aF1 = (C2682aF1) lm;
            int i = c2682aF1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2682aF1.h = i - Integer.MIN_VALUE;
            } else {
                c2682aF1 = new C2682aF1(this, lm);
            }
        } else {
            c2682aF1 = new C2682aF1(this, lm);
        }
        Object objO = c2682aF1.e;
        MN mn = MN.d;
        int i2 = c2682aF1.h;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            if (Intrinsics.a(c1491Lx0.b, "close_price")) {
                return Boolean.TRUE;
            }
            InterfaceC6396rf0<C3279d22> interfaceC6396rf0 = this.a.o;
            c2682aF1.d = this;
            c2682aF1.h = 1;
            objO = C4466ii.o(interfaceC6396rf0, c2682aF1);
            if (objO == mn) {
                return mn;
            }
            c3325dF1 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3325dF1 = c2682aF1.d;
            C1795Pt1.b(objO);
        }
        C3279d22 c3279d22 = (C3279d22) objO;
        String str = c3279d22 != null ? c3279d22.c : null;
        if (str == null) {
            str = "";
        }
        C7152vF c7152vF = (C7152vF) c3325dF1.b.p.getValue();
        List listP = c7152vF != null ? JH1.p(JH1.m(JH1.h(CollectionsKt.y(c7152vF.a), new JA1(1)), new YE1(0))) : null;
        if (listP == null) {
            listP = C5653o60.d;
        }
        return Boolean.valueOf(listP.contains(str));
    }
}
