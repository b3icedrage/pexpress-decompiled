package defpackage;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Xi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2414Xi implements InterfaceC2228Vi {

    @NotNull
    public final C6201qi2 a;

    @NotNull
    public final Pa2 b;

    public C2414Xi(@NotNull C6201qi2 scriptsManager, @NotNull Pa2 urlsProvider) {
        Intrinsics.checkNotNullParameter(scriptsManager, "scriptsManager");
        Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
        this.a = scriptsManager;
        this.b = urlsProvider;
    }

    @Override // defpackage.InterfaceC2150Ui
    @Nullable
    public final Object a(@NotNull WebView webView, @NotNull LM lm) throws Throwable {
        Object objB = b(webView, lm);
        return objB == MN.d ? objB : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (defpackage.LE.e(r6, (java.lang.String) r7, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.webkit.WebView r6, defpackage.LM r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C2310Wi
            if (r0 == 0) goto L13
            r0 = r7
            Wi r0 = (defpackage.C2310Wi) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            Wi r0 = new Wi
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
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            android.webkit.WebView r6 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L4e
        L38:
            defpackage.C1795Pt1.b(r7)
            Pa2 r7 = r5.b
            java.lang.String r7 = r7.B()
            r0.d = r6
            r0.h = r4
            qi2 r2 = r5.a
            java.lang.Object r7 = r2.a(r7, r0)
            if (r7 != r1) goto L4e
            goto L5b
        L4e:
            java.lang.String r7 = (java.lang.String) r7
            r2 = 0
            r0.d = r2
            r0.h = r3
            java.lang.Object r6 = defpackage.LE.e(r6, r7, r0)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2414Xi.b(android.webkit.WebView, LM):java.lang.Object");
    }
}
