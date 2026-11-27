package defpackage;

import com.base.feature.platform.filechooser.WebViewFileChooserUseCaseBase;

/* JADX INFO: loaded from: classes.dex */
public final class Uh2 implements InterfaceC5331mb0<WebViewFileChooserUseCaseBase> {
    public final InterfaceC1531Mk1<ActivityC1745Pd> a;
    public final C4817k8 b;
    public final C3680ey c;
    public final XK1 d;
    public final InterfaceC1531Mk1<C2877b7> e;

    public Uh2(InterfaceC1531Mk1 interfaceC1531Mk1, C4817k8 c4817k8, C3680ey c3680ey, XK1 xk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.a = interfaceC1531Mk1;
        this.b = c4817k8;
        this.c = c3680ey;
        this.d = xk1;
        this.e = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new WebViewFileChooserUseCaseBase(this.a.get(), (InterfaceC3890fy) this.b.get(), (C3470dy) this.c.get(), (VK1) this.d.get(), new C3686f(), this.e.get());
    }
}
