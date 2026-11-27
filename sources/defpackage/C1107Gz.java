package defpackage;

import androidx.lifecycle.x;
import com.api.feature.analytics.reporters.ReporterApi;
import com.impl.feature.changelanguage.screens.changelanguage.ChangeLanguageFragmentRepeatImpl;

/* JADX INFO: renamed from: Gz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1107Gz implements InterfaceC5331mb0<ChangeLanguageFragmentRepeatImpl> {
    public final InterfaceC1531Mk1<WL0> a;
    public final InterfaceC1531Mk1<AbstractC5603ns> b;
    public final InterfaceC1531Mk1<C3554eM0> c;
    public final OW d;
    public final InterfaceC1454Lk1 e;
    public final InterfaceC1531Mk1<C4612j90> f;
    public final InterfaceC1531Mk1<ReporterApi> g;

    public C1107Gz(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, OW ow, InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = interfaceC1531Mk3;
        this.d = ow;
        this.e = interfaceC1454Lk1;
        this.f = interfaceC1531Mk4;
        this.g = interfaceC1531Mk5;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new ChangeLanguageFragmentRepeatImpl(this.a.get(), this.b.get(), this.c.get(), (x.b) this.d.get(), (InterfaceC2130Ub0) this.e.get(), this.f.get(), this.g.get());
    }
}
