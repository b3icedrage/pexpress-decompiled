package defpackage;

import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import io.sentry.android.core.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7227vd implements AppsFlyerRequestListener {
    public final /* synthetic */ ApplicationC0963Fd a;

    public C7227vd(ApplicationC0963Fd applicationC0963Fd) {
        this.a = applicationC0963Fd;
    }

    @Override // com.appsflyer.share.attribution.AppsFlyerRequestListener
    public final void onError(int i, String errorDesc) {
        Intrinsics.checkNotNullParameter(errorDesc, "errorDesc");
        b0.e("APPS_FLYER", "Launch failed to be sent:\nError code: " + i + "\nError description: " + errorDesc);
        InterfaceC2570Zi interfaceC2570Zi = this.a.w;
        if (interfaceC2570Zi != null) {
            interfaceC2570Zi.b(EnumC6919u8.LAUNCH, Integer.valueOf(i), errorDesc, null);
        } else {
            Intrinsics.l("appsFlyerHealth");
            throw null;
        }
    }

    @Override // com.appsflyer.share.attribution.AppsFlyerRequestListener
    public final void onSuccess() {
        InterfaceC2570Zi interfaceC2570Zi = this.a.w;
        if (interfaceC2570Zi != null) {
            interfaceC2570Zi.a(EnumC6919u8.LAUNCH);
        } else {
            Intrinsics.l("appsFlyerHealth");
            throw null;
        }
    }
}
