package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;

/* JADX INFO: renamed from: i6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4341i6 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ C4341i6(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C4131h6((YD1) this.b.get(), (C7669xi0) this.c.get());
            default:
                return new C7630xY((Pa2) this.b.get(), (ReporterApi) this.c.get());
        }
    }
}
