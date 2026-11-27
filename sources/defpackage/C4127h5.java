package defpackage;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: h5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4127h5 extends AbstractC3917g5 {

    @NotNull
    public final InterfaceC2228Vi q;

    /* JADX INFO: renamed from: h5$a */
    @InterfaceC3368dU(c = "com.impl.feature.platform.screens.verification.webview.AccountVerificationWebChromeClientImpl", f = "AccountVerificationWebChromeClientImpl.kt", l = {28, 29}, m = "readyToStartScript")
    public static final class a extends LM {
        public C4127h5 d;
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
            return C4127h5.this.c(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4127h5(@NotNull Activity activity, @NotNull Context context, @NotNull VK1 showAlertDialogUseCase, @NotNull InterfaceC2228Vi applyVerificationScriptUseCaseImpl) {
        super(showAlertDialogUseCase);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
        Intrinsics.checkNotNullParameter(applyVerificationScriptUseCaseImpl, "applyVerificationScriptUseCaseImpl");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
        this.q = applyVerificationScriptUseCaseImpl;
    }

    @Override // defpackage.KR
    public final boolean a() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r7.a(r6, r0) == r1) goto L23;
     */
    @Override // defpackage.KR
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@org.jetbrains.annotations.Nullable android.webkit.WebView r6, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C4127h5.a
            if (r0 == 0) goto L13
            r0 = r7
            h5$a r0 = (defpackage.C4127h5.a) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L1a
        L13:
            h5$a r0 = new h5$a
            LM r7 = (defpackage.LM) r7
            r0.<init>(r7)
        L1a:
            java.lang.Object r7 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            defpackage.C1795Pt1.b(r7)
            goto L5f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            android.webkit.WebView r6 = r0.e
            h5 r2 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L4d
        L3c:
            defpackage.C1795Pt1.b(r7)
            r0.d = r5
            r0.e = r6
            r0.i = r4
            java.lang.Object r7 = defpackage.KR.d(r5, r6, r0)
            if (r7 != r1) goto L4c
            goto L5e
        L4c:
            r2 = r5
        L4d:
            if (r6 == 0) goto L5f
            Vi r7 = r2.q
            r2 = 0
            r0.d = r2
            r0.e = r2
            r0.i = r3
            java.lang.Object r6 = r7.a(r6, r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4127h5.c(android.webkit.WebView, JM):java.lang.Object");
    }
}
