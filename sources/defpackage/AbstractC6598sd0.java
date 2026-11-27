package defpackage;

/* JADX INFO: renamed from: sd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6598sd0<E> extends C5494nM implements InterfaceC7183vP0 {
    public boolean h = false;

    @Override // defpackage.InterfaceC7183vP0
    public final boolean isStarted() {
        return this.h;
    }

    public abstract void q();

    public void start() {
        this.h = true;
    }

    @Override // defpackage.InterfaceC7183vP0
    public final void stop() {
        this.h = false;
    }
}
