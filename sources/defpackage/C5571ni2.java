package defpackage;

import android.content.Context;
import android.webkit.WebView;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: ni2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5571ni2 implements InterfaceC5361mi2, Jm2 {
    public final Object d;

    public /* synthetic */ C5571ni2(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.InterfaceC5361mi2
    public String[] b() {
        return ((WebViewProviderFactoryBoundaryInterface) this.d).getSupportedFeatures();
    }

    @Override // defpackage.InterfaceC5361mi2
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) C8129zu.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.d).createWebView(webView));
    }

    @Override // defpackage.InterfaceC5361mi2
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) C8129zu.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.d).getStatics());
    }

    @Override // defpackage.Jm2
    public Object zza() {
        return new vn2((Context) ((C1602Nh0) ((C2698aL) this.d).d).d);
    }
}
