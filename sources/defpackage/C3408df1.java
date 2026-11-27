package defpackage;

import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: df1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3408df1 extends AbstractC3198cf1 {
    public static final /* synthetic */ int w = 0;

    @NotNull
    public final C6201qi2 q;

    @NotNull
    public final Pa2 r;

    @NotNull
    public final C4923kf s;

    @NotNull
    public final InterfaceC3985gQ t;

    @NotNull
    public final C6381rb1 u;

    @NotNull
    public final C1699On1 v;

    /* JADX INFO: renamed from: df1$a */
    @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform_webview.webview.PlatformWebChromeClientImpl", f = "PlatformWebChromeClientImpl.kt", l = {42, 43}, m = "readyToStartScript")
    public static final class a extends LM {
        public C3408df1 d;
        public WebView e;
        public /* synthetic */ Object g;
        public int i;

        public a(LM lm) {
            super(lm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return C3408df1.this.c(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3408df1(@NotNull VK1 alertDialog, @NotNull C6201qi2 scriptsManager, @NotNull Pa2 urlsProvider, @NotNull C4923kf appDataRepository, @NotNull InterfaceC3985gQ cryptoEnablementProvider) {
        super(alertDialog);
        Intrinsics.checkNotNullParameter(alertDialog, "showAlertDialogUseCase");
        Intrinsics.checkNotNullParameter(scriptsManager, "scriptsManager");
        Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(cryptoEnablementProvider, "cryptoEnablementProvider");
        Intrinsics.checkNotNullParameter(alertDialog, "alertDialog");
        this.q = scriptsManager;
        this.r = urlsProvider;
        this.s = appDataRepository;
        this.t = cryptoEnablementProvider;
        C6381rb1 c6381rb1 = new C6381rb1(C7235vf.a, "Chart");
        this.u = c6381rb1;
        this.v = c6381rb1.f;
    }

    @Override // defpackage.KR
    public final boolean a() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        if (r2.g(r12, r0) == r1) goto L29;
     */
    @Override // defpackage.KR
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@org.jetbrains.annotations.Nullable android.webkit.WebView r12, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.C3408df1.a
            if (r0 == 0) goto L13
            r0 = r13
            df1$a r0 = (defpackage.C3408df1.a) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L1a
        L13:
            df1$a r0 = new df1$a
            LM r13 = (defpackage.LM) r13
            r0.<init>(r13)
        L1a:
            java.lang.Object r13 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 0
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r5) goto L2e
            defpackage.C1795Pt1.b(r13)
            goto La8
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            android.webkit.WebView r12 = r0.e
            df1 r2 = r0.d
            defpackage.C1795Pt1.b(r13)
            goto L99
        L3e:
            defpackage.C1795Pt1.b(r13)
            rb1$a r13 = defpackage.C6381rb1.a.d
            rb1$a r2 = defpackage.C6381rb1.a.e
            rb1$a r6 = defpackage.C6381rb1.a.g
            rb1$a[] r13 = new defpackage.C6381rb1.a[]{r13, r2, r6}
            java.lang.String r2 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
            java.util.Set r13 = defpackage.C1526Mj.H(r13)
            rb1 r2 = r11.u
            r2.getClass()
            java.lang.String r6 = "conditions"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r6)
            kotlin.time.TimeMark r6 = r2.l
            if (r6 == 0) goto L72
            long r7 = r2.j
            long r9 = r6.b()
            long r9 = kotlin.time.b.t(r9)
            long r6 = kotlin.time.b.p(r7, r9)
            r2.j = r6
        L72:
            r2.l = r3
            bP1 r6 = r2.k
            if (r6 == 0) goto L7b
            r6.l(r3)
        L7b:
            r2.k = r3
            int r6 = r2.g
            int r6 = r6 + r4
            r2.g = r6
            r2.h = r13
            long r6 = r2.c
            r2.j = r6
            r2.c()
            r0.d = r11
            r0.e = r12
            r0.i = r4
            java.lang.Object r13 = defpackage.KR.d(r11, r12, r0)
            if (r13 != r1) goto L98
            goto La7
        L98:
            r2 = r11
        L99:
            if (r12 == 0) goto Lab
            r0.d = r3
            r0.e = r3
            r0.i = r5
            java.lang.Object r12 = r2.g(r12, r0)
            if (r12 != r1) goto La8
        La7:
            return r1
        La8:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        Lab:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3408df1.c(android.webkit.WebView, JM):java.lang.Object");
    }

    @Override // defpackage.KR
    public final boolean e(@Nullable String str, @Nullable String str2) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
    
        if (defpackage.LE.f(r2, "window.AppModule.hideCryptoAssets", new java.lang.Object[0], r0) == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(android.webkit.WebView r9, defpackage.LM r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3408df1.g(android.webkit.WebView, LM):java.lang.Object");
    }
}
