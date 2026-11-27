package defpackage;

/* JADX INFO: renamed from: bO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2932bO0<E> extends C5494nM implements InterfaceC7183vP0 {
    public boolean h;

    @Override // defpackage.InterfaceC7183vP0
    public final boolean isStarted() {
        return this.h;
    }

    @Override // defpackage.C5494nM, defpackage.InterfaceC5284mM
    public final void j(HS0 hs0) {
        this.e = hs0;
    }

    public abstract String q(QS0 qs0);

    public String r() {
        return null;
    }

    @Override // defpackage.InterfaceC7183vP0
    public final void stop() {
        this.h = false;
    }
}
