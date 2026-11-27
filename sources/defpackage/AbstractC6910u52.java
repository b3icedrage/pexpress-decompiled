package defpackage;

/* JADX INFO: renamed from: u52, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6910u52 extends C5494nM implements InterfaceC7183vP0 {
    public boolean h = false;

    @Override // defpackage.InterfaceC7183vP0
    public final boolean isStarted() {
        return this.h;
    }

    public abstract EnumC6808td0 q();

    @Override // defpackage.InterfaceC7183vP0
    public final void start() {
        this.h = true;
    }

    @Override // defpackage.InterfaceC7183vP0
    public final void stop() {
        this.h = false;
    }
}
