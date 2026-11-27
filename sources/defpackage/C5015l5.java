package defpackage;

import android.content.Context;
import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5015l5 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ C5015l5(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                Pa2 urlsProvider = (Pa2) this.b.get();
                ReporterApi reporter = (ReporterApi) this.c.get();
                Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
                Intrinsics.checkNotNullParameter(reporter, "reporter");
                return new C4805k5(urlsProvider, reporter);
            case 1:
                return new R21((C5253mB1) this.b.get(), (InterfaceC3951gE1) ((OW) this.c).get());
            case 2:
                return new C4464ih1((InterfaceC2714aQ0) ((InterfaceC1454Lk1) this.c).get(), (JA) this.b.get());
            case 3:
                return new C2119Tx1((Context) ((C6) this.b).get(), (FV0) ((InterfaceC1454Lk1) this.c).get());
            default:
                Tf2 webSocketBestSelector = (Tf2) ((C3292d6) this.b).get();
                C5698oK connectionStatus = (C5698oK) ((InterfaceC1454Lk1) this.c).get();
                Intrinsics.checkNotNullParameter(webSocketBestSelector, "webSocketBestSelector");
                Intrinsics.checkNotNullParameter(connectionStatus, "connectionStatus");
                return new C8083zg2(webSocketBestSelector, connectionStatus);
        }
    }

    public C5015l5(InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.a = 2;
        this.c = interfaceC1454Lk1;
        this.b = interfaceC1531Mk1;
    }
}
