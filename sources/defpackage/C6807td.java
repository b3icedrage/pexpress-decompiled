package defpackage;

import com.appsflyer.share.AppsFlyerConversionListener;
import io.sentry.android.core.b0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: td, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6807td implements AppsFlyerConversionListener {
    public final /* synthetic */ ApplicationC0963Fd a;

    public C6807td(ApplicationC0963Fd applicationC0963Fd) {
        this.a = applicationC0963Fd;
    }

    @Override // com.appsflyer.share.AppsFlyerConversionListener
    public final void onConversionDataFail(String str) {
        b0.e("APPS_FLYER", "onConversionDataFail: " + str);
        InterfaceC2570Zi interfaceC2570Zi = this.a.w;
        if (interfaceC2570Zi != null) {
            interfaceC2570Zi.b(EnumC6919u8.CONVERSION, null, str, null);
        } else {
            Intrinsics.l("appsFlyerHealth");
            throw null;
        }
    }

    @Override // com.appsflyer.share.AppsFlyerConversionListener
    public final void onConversionDataSuccess(Map<String, ? extends Object> map) {
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                arrayList.add(((Object) key) + ": " + entry.getValue());
            }
            CollectionsKt.J(arrayList, ", ", null, null, null, 62);
        }
        InterfaceC2570Zi interfaceC2570Zi = this.a.w;
        if (interfaceC2570Zi == null) {
            Intrinsics.l("appsFlyerHealth");
            throw null;
        }
        interfaceC2570Zi.a(EnumC6919u8.CONVERSION);
    }
}
