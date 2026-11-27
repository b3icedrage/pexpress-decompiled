package defpackage;

import android.content.Context;
import android.webkit.WebView;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: eH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3538eH implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ RunnableC3538eH(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4866kN1 interfaceC4866kN1 = null;
        switch (this.d) {
            case 0:
                ComponentActivity this$0 = (ComponentActivity) this.e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OnBackPressedDispatcher dispatcher = (OnBackPressedDispatcher) this.g;
                Intrinsics.checkNotNullParameter(dispatcher, "$dispatcher");
                this$0.addObserverForBackInvoker(dispatcher);
                return;
            case 1:
                C4786k00 c4786k00 = (C4786k00) this.e;
                Context context = (Context) this.g;
                if (c4786k00.a != null || context == null) {
                    return;
                }
                c4786k00.a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                return;
            default:
                AbstractC5709oN1 abstractC5709oN1 = (AbstractC5709oN1) this.e;
                if (AbstractC5709oN1.b.a.C0455a.a[abstractC5709oN1.h.ordinal()] != 1) {
                    throw new C6489s51();
                }
                S80 s80 = S80.EMAIL_AUTH;
                abstractC5709oN1.F();
                interfaceC4866kN1.g((String) this.g);
                WebView webView = abstractC5709oN1.d;
                if (webView != null) {
                    webView.destroy();
                    abstractC5709oN1.F();
                    interfaceC4866kN1.a().removeView(abstractC5709oN1.d);
                    abstractC5709oN1.d = null;
                    return;
                }
                return;
        }
    }
}
