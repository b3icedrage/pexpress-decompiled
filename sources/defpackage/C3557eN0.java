package defpackage;

import android.content.Context;
import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: eN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3557eN0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 0;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC5331mb0 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;

    public C3557eN0(C6 c6, C6617si c6617si, InterfaceC1531Mk1 interfaceC1531Mk1, AB ab) {
        this.c = c6;
        this.d = c6617si;
        this.b = interfaceC1531Mk1;
        this.e = ab;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C3348dN0((Context) ((C6) this.c).get(), (C5358mi) ((C6617si) this.d).get(), (ReporterApi) this.b.get(), (InterfaceC7350wB) ((AB) this.e).get());
            default:
                return new C5730oU1((L32) this.b.get(), (InterfaceC6444rs1) ((C3523eC) this.c).get(), (C4923kf) this.d.get(), (AbstractC7949z22) this.e.get());
        }
    }

    public C3557eN0(InterfaceC1531Mk1 interfaceC1531Mk1, C3523eC c3523eC, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3) {
        this.b = interfaceC1531Mk1;
        this.c = c3523eC;
        this.d = interfaceC1531Mk2;
        this.e = interfaceC1531Mk3;
    }
}
