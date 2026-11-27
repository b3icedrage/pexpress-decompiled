package defpackage;

import android.net.Uri;
import android.os.Message;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class KR extends WebChromeClient {

    @NotNull
    public final VK1 a;

    @NotNull
    public final GP1 b;

    @NotNull
    public final C1699On1 c;

    @NotNull
    public final C6120qK1 d;

    @NotNull
    public final C1621Nn1 e;

    @NotNull
    public final C2030Su f;

    @NotNull
    public final C1811Pz g;

    @NotNull
    public final C6120qK1 h;

    @NotNull
    public final C1621Nn1 i;

    @Nullable
    public Nh2 j;

    @Nullable
    public InterfaceC6830ti2 k;

    @NotNull
    public final LinkedHashSet l;

    @Nullable
    public String m;
    public final int n;

    @NotNull
    public final LinkedHashSet o;
    public final boolean p;

    @InterfaceC3368dU(c = "com.api.feature.webpage.webchromeclient.CustomWebChromeClient$onProgressChanged$1", f = "CustomWebChromeClient.kt", l = {100, 105}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ int g;
        public final /* synthetic */ WebView h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, WebView webView, JM<? super a> jm) {
            super(2, jm);
            this.g = i;
            this.h = webView;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return KR.this.new a(this.g, this.h, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        
            if (r2.c(r1, r6) == r0) goto L25;
         */
        @Override // defpackage.AbstractC7487wq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                MN r0 = defpackage.MN.d
                int r1 = r6.d
                KR r2 = defpackage.KR.this
                int r3 = r6.g
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L20
                if (r1 == r5) goto L1c
                if (r1 != r4) goto L14
                defpackage.C1795Pt1.b(r7)
                goto L63
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                defpackage.C1795Pt1.b(r7)
                goto L40
            L20:
                defpackage.C1795Pt1.b(r7)
                On1 r7 = r2.c
                g21 r7 = r7.d
                java.lang.Object r7 = r7.getValue()
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                r1 = 100
                if (r3 != r1) goto L40
                if (r7 == 0) goto L40
                r6.d = r5
                java.lang.Object r7 = defpackage.KR.b(r2, r6)
                if (r7 != r0) goto L40
                goto L62
            L40:
                java.util.LinkedHashSet r7 = r2.o
                android.webkit.WebView r1 = r6.h
                if (r1 == 0) goto L4b
                java.lang.String r5 = r1.getUrl()
                goto L4c
            L4b:
                r5 = 0
            L4c:
                java.lang.String r5 = defpackage.KR.f(r5)
                boolean r7 = r7.contains(r5)
                int r5 = r2.n
                if (r3 <= r5) goto L63
                if (r7 != 0) goto L63
                r6.d = r4
                java.lang.Object r7 = r2.c(r1, r6)
                if (r7 != r0) goto L63
            L62:
                return r0
            L63:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: KR.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public KR(@NotNull VK1 showAlertDialogUseCase) {
        Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
        this.a = showAlertDialogUseCase;
        GP1 gp1I = C1589Ne.i(Boolean.FALSE);
        this.b = gp1I;
        this.c = C4466ii.f(gp1I);
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.d = c6120qK1G;
        this.e = C4466ii.e(c6120qK1G);
        C2030Su c2030SuA = C2889bA.a(1, 6, null);
        this.f = c2030SuA;
        this.g = new C1811Pz(c2030SuA);
        C6120qK1 c6120qK1G2 = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.h = c6120qK1G2;
        this.i = C4466ii.e(c6120qK1G2);
        this.l = new LinkedHashSet();
        this.n = 60;
        this.o = new LinkedHashSet();
        this.p = true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(KR kr, LM lm) {
        JR jr;
        if (lm instanceof JR) {
            jr = (JR) lm;
            int i = jr.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                jr.h = i - Integer.MIN_VALUE;
            } else {
                jr = new JR(kr, lm);
            }
        } else {
            jr = new JR(kr, lm);
        }
        Object obj = jr.e;
        MN mn = MN.d;
        int i2 = jr.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            C6120qK1 c6120qK1 = kr.d;
            Unit unit = Unit.a;
            jr.d = kr;
            jr.h = 1;
            if (c6120qK1.a(unit, jr) == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kr = jr.d;
            C1795Pt1.b(obj);
        }
        GP1 gp1 = kr.b;
        Boolean bool = Boolean.FALSE;
        gp1.getClass();
        gp1.m(null, bool);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        if (r6.a(r7, r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(defpackage.KR r6, android.webkit.WebView r7, defpackage.LM r8) {
        /*
            boolean r0 = r8 instanceof defpackage.MR
            if (r0 == 0) goto L13
            r0 = r8
            MR r0 = (defpackage.MR) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            MR r0 = new MR
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.C1795Pt1.b(r8)
            goto L75
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            KR r6 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L66
        L39:
            defpackage.C1795Pt1.b(r8)
            java.util.LinkedHashSet r8 = r6.o
            if (r7 == 0) goto L45
            java.lang.String r2 = r7.getUrl()
            goto L46
        L45:
            r2 = r5
        L46:
            java.lang.String r2 = f(r2)
            r8.add(r2)
            Su r8 = r6.f
            if (r7 == 0) goto L56
            java.lang.String r7 = r7.getUrl()
            goto L57
        L56:
            r7 = r5
        L57:
            if (r7 != 0) goto L5b
            java.lang.String r7 = ""
        L5b:
            r0.d = r6
            r0.h = r4
            java.lang.Object r7 = r8.j(r0, r7)
            if (r7 != r1) goto L66
            goto L74
        L66:
            qK1 r6 = r6.h
            kotlin.Unit r7 = kotlin.Unit.a
            r0.d = r5
            r0.h = r3
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r1) goto L75
        L74:
            return r1
        L75:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.KR.d(KR, android.webkit.WebView, LM):java.lang.Object");
    }

    public static String f(String str) {
        if (str == null) {
            return "";
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = str.charAt(!z ? i : length) == '/';
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string = str.subSequence(i, length + 1).toString();
        return string == null ? "" : string;
    }

    public boolean a() {
        return this.p;
    }

    @Nullable
    public Object c(@Nullable WebView webView, @NotNull JM<? super Unit> jm) {
        return d(this, webView, (LM) jm);
    }

    public boolean e(@Nullable String str, @Nullable String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        return f(str).equals(f(str2));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(@Nullable WebView webView, boolean z, boolean z2, @Nullable Message message) {
        InterfaceC6830ti2 interfaceC6830ti2 = this.k;
        if (interfaceC6830ti2 == null || webView == null || message == null) {
            return false;
        }
        return interfaceC6830ti2.a(webView, message);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(@Nullable WebView webView, @Nullable String str, @Nullable String str2, @Nullable JsResult jsResult) {
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(@Nullable PermissionRequest permissionRequest) {
        Nh2 nh2 = this.j;
        if (nh2 != null) {
            nh2.b(permissionRequest);
        } else if (permissionRequest != null) {
            permissionRequest.deny();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(@Nullable PermissionRequest permissionRequest) {
        Nh2 nh2 = this.j;
        if (nh2 != null) {
            nh2.d(permissionRequest);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(@Nullable WebView webView, int i) {
        String url;
        super.onProgressChanged(webView, i);
        if (this.m == null) {
            this.m = webView != null ? webView.getUrl() : null;
        }
        if (a() && webView != null) {
            i = webView.getProgress();
        }
        LinkedHashSet linkedHashSet = this.l;
        if (i >= 0 && i < 41) {
            if (e(this.m, webView != null ? webView.getUrl() : null)) {
                linkedHashSet.clear();
                Boolean bool = Boolean.TRUE;
                GP1 gp1 = this.b;
                gp1.getClass();
                gp1.m(null, bool);
                this.o.clear();
            } else if (webView != null) {
                linkedHashSet.clear();
                Boolean bool2 = Boolean.TRUE;
                GP1 gp2 = this.b;
                gp2.getClass();
                gp2.m(null, bool2);
                this.o.clear();
            }
        } else if (webView != null && (url = webView.getUrl()) != null && StringsKt.C(url, "bonuscode", false)) {
            linkedHashSet.clear();
            Boolean bool3 = Boolean.TRUE;
            GP1 gp3 = this.b;
            gp3.getClass();
            gp3.m(null, bool3);
            this.o.clear();
        }
        if (linkedHashSet.contains(Integer.valueOf(i))) {
            return;
        }
        C5189lv.k(C3286d41.a, null, new a(i, webView, null), 3);
        linkedHashSet.add(Integer.valueOf(i));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(@Nullable WebView webView, @Nullable ValueCallback<Uri[]> valueCallback, @Nullable WebChromeClient.FileChooserParams fileChooserParams) {
        Nh2 nh2 = this.j;
        if (nh2 != null) {
            return nh2.c(valueCallback, fileChooserParams);
        }
        return false;
    }
}
