package defpackage;

/* JADX INFO: renamed from: o80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5661o80<E> extends C5494nM implements InterfaceC5451n80<E> {
    public String h;
    public boolean i;

    @Override // defpackage.InterfaceC5451n80
    public final void b(String str) {
        if (this.h != null) {
            throw new IllegalStateException("name has been already set");
        }
        this.h = str;
    }

    @Override // defpackage.InterfaceC5451n80
    public final String getName() {
        return this.h;
    }

    @Override // defpackage.InterfaceC7183vP0
    public final boolean isStarted() {
        return this.i;
    }

    @Override // defpackage.InterfaceC7183vP0
    public final void stop() {
        this.i = false;
    }
}
