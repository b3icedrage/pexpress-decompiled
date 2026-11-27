package defpackage;

import android.content.Context;
import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: dN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3348dN0 {

    @NotNull
    public final Context a;

    @NotNull
    public final C5358mi b;

    @NotNull
    public final ReporterApi c;

    @NotNull
    public final InterfaceC7350wB d;

    @NotNull
    public final C6120qK1 e;

    @NotNull
    public final C6120qK1 f;

    @NotNull
    public final C6120qK1 g;

    @NotNull
    public final C6120qK1 h;
    public KN i;

    public C3348dN0(@NotNull Context context, @NotNull C5358mi appUpdatesManagerImpl, @NotNull ReporterApi reporter, @NotNull InterfaceC7350wB checkForUpdatesUseCase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appUpdatesManagerImpl, "appUpdatesManagerImpl");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(checkForUpdatesUseCase, "checkForUpdatesUseCase");
        this.a = context;
        this.b = appUpdatesManagerImpl;
        this.c = reporter;
        this.d = checkForUpdatesUseCase;
        this.e = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.f = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.g = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.h = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(C3348dN0 c3348dN0, LM lm) {
        ZM0 zm0;
        c3348dN0.getClass();
        if (lm instanceof ZM0) {
            zm0 = (ZM0) lm;
            int i = zm0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                zm0.h = i - Integer.MIN_VALUE;
            } else {
                zm0 = new ZM0(c3348dN0, lm);
            }
        } else {
            zm0 = new ZM0(c3348dN0, lm);
        }
        Object objA = zm0.e;
        MN mn = MN.d;
        int i2 = zm0.h;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            zm0.d = c3348dN0;
            zm0.h = 1;
            objA = c3348dN0.d.a(zm0);
            if (objA != mn) {
            }
            return mn;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objA);
            return null;
        }
        c3348dN0 = zm0.d;
        C1795Pt1.b(objA);
        InterfaceC7140vB interfaceC7140vB = (InterfaceC7140vB) objA;
        if (interfaceC7140vB instanceof InterfaceC7140vB.a) {
            C6120qK1 c6120qK1 = c3348dN0.h;
            zm0.d = null;
            zm0.h = 2;
            EM em = C7236vf0.a;
            if (C4466ii.o(new C4733jk(c6120qK1, 1), zm0) == mn) {
                return mn;
            }
        } else if (interfaceC7140vB instanceof InterfaceC7140vB.b) {
            return Boolean.valueOf(((InterfaceC7140vB.b) interfaceC7140vB).a);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086 A[PHI: r7
      0x0086: PHI (r7v3 dN0) = (r7v2 dN0), (r7v9 dN0) binds: [B:27:0x0083, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (r7.a(r8, r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.C3348dN0 r7, defpackage.LM r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof defpackage.C3138cN0
            if (r0 == 0) goto L16
            r0 = r8
            cN0 r0 = (defpackage.C3138cN0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.h = r1
            goto L1b
        L16:
            cN0 r0 = new cN0
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4d
            if (r2 == r6) goto L47
            if (r2 == r5) goto L41
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            defpackage.C1795Pt1.b(r8)
            goto L96
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            dN0 r7 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L86
        L41:
            dN0 r7 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L71
        L47:
            dN0 r7 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L5d
        L4d:
            defpackage.C1795Pt1.b(r8)
            r0.d = r7
            r0.h = r6
            mi r8 = r7.b
            java.lang.Object r8 = r8.d(r0)
            if (r8 != r1) goto L5d
            goto L95
        L5d:
            qK1 r8 = r7.f
            java.lang.Integer r2 = new java.lang.Integer
            r6 = 100
            r2.<init>(r6)
            r0.d = r7
            r0.h = r5
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 != r1) goto L71
            goto L95
        L71:
            qK1 r8 = r7.e
            java.lang.Integer r2 = new java.lang.Integer
            r5 = 2131952144(0x7f130210, float:1.9540722E38)
            r2.<init>(r5)
            r0.d = r7
            r0.h = r4
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 != r1) goto L86
            goto L95
        L86:
            qK1 r7 = r7.h
            kotlin.Unit r8 = kotlin.Unit.a
            r2 = 0
            r0.d = r2
            r0.h = r3
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L96
        L95:
            return r1
        L96:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3348dN0.b(dN0, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (defpackage.C4466ii.o(r5, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(defpackage.C3348dN0 r5, defpackage.KN r6, defpackage.LM r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C2929bN0
            if (r0 == 0) goto L13
            r0 = r7
            bN0 r0 = (defpackage.C2929bN0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            bN0 r0 = new bN0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r7)
            goto L56
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            dN0 r5 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L48
        L38:
            defpackage.C1795Pt1.b(r7)
            r5.i = r6
            r0.d = r5
            r0.h = r4
            kotlin.Unit r6 = r5.c()
            if (r6 != r1) goto L48
            goto L55
        L48:
            qK1 r5 = r5.h
            r6 = 0
            r0.d = r6
            r0.h = r3
            java.lang.Object r5 = defpackage.C4466ii.o(r5, r0)
            if (r5 != r1) goto L56
        L55:
            return r1
        L56:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3348dN0.d(dN0, KN, LM):java.lang.Object");
    }

    public final Unit c() {
        KN kn = this.i;
        if (kn != null) {
            C5189lv.k(kn, C6266r20.a, new XM0(this, null), 2);
            return Unit.a;
        }
        Intrinsics.l("scope");
        throw null;
    }
}
