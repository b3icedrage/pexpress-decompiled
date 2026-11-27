package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: qQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6136qQ implements InterfaceC0735Cf {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final InterfaceC7816yQ b;

    @NotNull
    public final InterfaceC1375Kk0 c;

    public C6136qQ(@NotNull C4923kf appDataRepository, @NotNull InterfaceC7816yQ currenciesRepository, @NotNull InterfaceC1375Kk0 getBetMinMaxValuesUseCase) {
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(currenciesRepository, "currenciesRepository");
        Intrinsics.checkNotNullParameter(getBetMinMaxValuesUseCase, "getBetMinMaxValuesUseCase");
        this.a = appDataRepository;
        this.b = currenciesRepository;
        this.c = getBetMinMaxValuesUseCase;
    }

    @Override // defpackage.InterfaceC0735Cf
    public final boolean a(@NotNull InterfaceC0735Cf interfaceC0735Cf) {
        return InterfaceC0735Cf.a.a(this, interfaceC0735Cf);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (r2.d(r0) == r1) goto L27;
     */
    @Override // defpackage.InterfaceC0735Cf
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull defpackage.LM r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.C5716oQ
            if (r0 == 0) goto L13
            r0 = r7
            oQ r0 = (defpackage.C5716oQ) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            oQ r0 = new oQ
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.C1795Pt1.b(r7)
            goto L6e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            qQ r2 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L62
        L3b:
            qQ r2 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L53
        L41:
            defpackage.C1795Pt1.b(r7)
            r0.d = r6
            r0.h = r5
            Kk0 r7 = r6.c
            r7.c()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            if (r7 != r1) goto L52
            goto L6d
        L52:
            r2 = r6
        L53:
            kf r7 = r2.a
            GP1 r7 = r7.k
            r0.d = r2
            r0.h = r4
            java.lang.Object r7 = defpackage.C7236vf0.a(r7, r0)
            if (r7 != r1) goto L62
            goto L6d
        L62:
            r7 = 0
            r0.d = r7
            r0.h = r3
            java.lang.Object r7 = r2.d(r0)
            if (r7 != r1) goto L6e
        L6d:
            return r1
        L6e:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6136qQ.b(LM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC0735Cf
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object d(LM lm) {
        C5926pQ c5926pQ;
        C6136qQ c6136qQ;
        GP1 gp1;
        Object value;
        C6945uG c6945uG;
        if (lm instanceof C5926pQ) {
            c5926pQ = (C5926pQ) lm;
            int i = c5926pQ.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5926pQ.h = i - Integer.MIN_VALUE;
            } else {
                c5926pQ = new C5926pQ(this, lm);
            }
        } else {
            c5926pQ = new C5926pQ(this, lm);
        }
        Object objB = c5926pQ.e;
        MN mn = MN.d;
        int i2 = c5926pQ.h;
        if (i2 == 0) {
            C1795Pt1.b(objB);
            c5926pQ.d = this;
            c5926pQ.h = 1;
            objB = this.b.b(c5926pQ);
            if (objB == mn) {
                return mn;
            }
            c6136qQ = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6136qQ = c5926pQ.d;
            C1795Pt1.b(objB);
        }
        CommonResult commonResult = (CommonResult) objB;
        if (commonResult instanceof ResultOk) {
            KF kf = (KF) ((ResultOk) commonResult).a();
            if (kf.a.isEmpty()) {
                return Unit.a;
            }
            LF lf = (LF) kf.a.get(0);
            GP1 gp2 = c6136qQ.a.I;
            lf.getClass();
            gp2.setValue(null);
            C4923kf c4923kf = c6136qQ.a;
            c4923kf.H.setValue(null);
            do {
                gp1 = c4923kf.k;
                value = gp1.getValue();
                c6945uG = (C6945uG) value;
            } while (!gp1.d(value, c6945uG != null ? C6945uG.a(c6945uG, null, lf.c, lf.b, 0.0d, 0.0d, 0L, 0L, 261983) : null));
        }
        return Unit.a;
    }

    @Override // defpackage.InterfaceC0735Cf
    public final void stop() {
    }
}
