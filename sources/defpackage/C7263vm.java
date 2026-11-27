package defpackage;

import android.content.Context;
import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7263vm implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ C7263vm(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C7053um((Context) this.b.get());
            case 1:
                return new C6930uB((C6754tM0) this.b.get());
            case 2:
                return new C6797ta1((ZT1) this.b.get());
            case 3:
                return new C4090gu1((ReporterApi) this.b.get());
            case 4:
                return new C5206lz1((InterfaceC1442Lg1) this.b.get());
            default:
                return new C7521x02((InterfaceC5862p6) this.b.get());
        }
    }
}
