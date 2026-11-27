package defpackage;

import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Si, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1994Si implements InterfaceC2150Ui {

    @NotNull
    public final C6201qi2 a;

    @NotNull
    public final Pa2 b;

    @NotNull
    public final InterfaceC3170cY c;

    @NotNull
    public final C4923kf d;

    @NotNull
    public final InterfaceC3985gQ e;

    public C1994Si(@NotNull C6201qi2 scriptsManager, @NotNull Pa2 urlsProvider, @NotNull InterfaceC3170cY depositValuesProvider, @NotNull C4923kf appDataRepository, @NotNull InterfaceC3985gQ cryptoEnablementProvider) {
        Intrinsics.checkNotNullParameter(scriptsManager, "scriptsManager");
        Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
        Intrinsics.checkNotNullParameter(depositValuesProvider, "depositValuesProvider");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(cryptoEnablementProvider, "cryptoEnablementProvider");
        this.a = scriptsManager;
        this.b = urlsProvider;
        this.c = depositValuesProvider;
        this.d = appDataRepository;
        this.e = cryptoEnablementProvider;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008d A[PHI: r2 r9 r10
      0x008d: PHI (r2v5 Si) = (r2v4 Si), (r2v12 Si) binds: [B:28:0x008a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r9v3 android.webkit.WebView) = (r9v2 android.webkit.WebView), (r9v10 android.webkit.WebView) binds: [B:28:0x008a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r10v11 java.lang.Object) = (r10v10 java.lang.Object), (r10v1 java.lang.Object) binds: [B:28:0x008a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@NotNull WebView webView, @NotNull LM lm) throws Throwable {
        C1838Qi c1838Qi;
        C1994Si c1994Si;
        boolean zC;
        int i;
        int i2;
        if (lm instanceof C1838Qi) {
            c1838Qi = (C1838Qi) lm;
            int i3 = c1838Qi.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1838Qi.j = i3 - Integer.MIN_VALUE;
            } else {
                c1838Qi = new C1838Qi(this, lm);
            }
        } else {
            c1838Qi = new C1838Qi(this, lm);
        }
        Object objA = c1838Qi.h;
        MN mn = MN.d;
        int i4 = c1838Qi.j;
        if (i4 == 0) {
            C1795Pt1.b(objA);
            String strM = this.b.m();
            c1838Qi.d = this;
            c1838Qi.e = webView;
            c1838Qi.j = 1;
            objA = this.a.a(strM, c1838Qi);
            if (objA != mn) {
                c1994Si = this;
            }
            return mn;
        }
        if (i4 == 1) {
            webView = c1838Qi.e;
            c1994Si = c1838Qi.d;
            C1795Pt1.b(objA);
        } else {
            if (i4 == 2) {
                webView = c1838Qi.e;
                c1994Si = c1838Qi.d;
                C1795Pt1.b(objA);
                GP1 gp1 = c1994Si.d.b;
                c1838Qi.d = c1994Si;
                c1838Qi.e = webView;
                c1838Qi.j = 3;
                objA = C7236vf0.a(gp1, c1838Qi);
                if (objA != mn) {
                    zC = c1994Si.e.c((FF) objA);
                    i = !zC ? 1 : 0;
                    if (!zC) {
                        c1838Qi.d = null;
                        c1838Qi.e = null;
                        c1838Qi.g = i;
                        c1838Qi.j = 4;
                        if (LE.f(webView, "window.AppModule.hideCryptoDeposit", new Object[0], c1838Qi) != mn) {
                            i2 = i;
                        }
                    }
                    return Boolean.valueOf(i != 0);
                }
                return mn;
            }
            if (i4 == 3) {
                webView = c1838Qi.e;
                c1994Si = c1838Qi.d;
                C1795Pt1.b(objA);
                zC = c1994Si.e.c((FF) objA);
                i = !zC ? 1 : 0;
                if (!zC) {
                    c1838Qi.d = null;
                    c1838Qi.e = null;
                    c1838Qi.g = i;
                    c1838Qi.j = 4;
                    if (LE.f(webView, "window.AppModule.hideCryptoDeposit", new Object[0], c1838Qi) != mn) {
                        i2 = i;
                    }
                    return mn;
                }
                return Boolean.valueOf(i != 0);
            }
            if (i4 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = c1838Qi.g;
            C1795Pt1.b(objA);
        }
        i = i2;
        return Boolean.valueOf(i != 0);
        c1838Qi.d = c1994Si;
        c1838Qi.e = webView;
        c1838Qi.j = 2;
        if (LE.e(webView, (String) objA, c1838Qi) != mn) {
            GP1 gp2 = c1994Si.d.b;
            c1838Qi.d = c1994Si;
            c1838Qi.e = webView;
            c1838Qi.j = 3;
            objA = C7236vf0.a(gp2, c1838Qi);
            if (objA != mn) {
                zC = c1994Si.e.c((FF) objA);
                i = !zC ? 1 : 0;
                if (!zC) {
                    c1838Qi.d = null;
                    c1838Qi.e = null;
                    c1838Qi.g = i;
                    c1838Qi.j = 4;
                    if (LE.f(webView, "window.AppModule.hideCryptoDeposit", new Object[0], c1838Qi) != mn) {
                        i2 = i;
                        i = i2;
                    }
                }
                return Boolean.valueOf(i != 0);
            }
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (defpackage.LE.f(r6, "window.AppModule.insertRecommendedDeposit", r7, r0) == r1) goto L21;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull android.webkit.WebView r6, @org.jetbrains.annotations.Nullable java.lang.String r7, @org.jetbrains.annotations.NotNull defpackage.LM r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.C1916Ri
            if (r0 == 0) goto L13
            r0 = r8
            Ri r0 = (defpackage.C1916Ri) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            Ri r0 = new Ri
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r8)
            goto L65
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            android.webkit.WebView r6 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L48
        L38:
            defpackage.C1795Pt1.b(r8)
            r0.d = r6
            r0.h = r4
            cY r8 = r5.c
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L48
            goto L64
        L48:
            java.lang.Number r8 = (java.lang.Number) r8
            int r7 = r8.intValue()
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r8}
            r8 = 0
            r0.d = r8
            r0.h = r3
            java.lang.String r8 = "window.AppModule.insertRecommendedDeposit"
            java.lang.Object r6 = defpackage.LE.f(r6, r8, r7, r0)
            if (r6 != r1) goto L65
        L64:
            return r1
        L65:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1994Si.c(android.webkit.WebView, java.lang.String, LM):java.lang.Object");
    }
}
