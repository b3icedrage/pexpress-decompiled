package defpackage;

/* JADX INFO: renamed from: Ai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0588Ai<E> implements InterfaceC8088zi<E> {
    public final C3049bx<InterfaceC7668xi<E>> d = new C3049bx<>(new InterfaceC7668xi[0]);

    static {
        System.currentTimeMillis();
    }

    @Override // defpackage.InterfaceC8088zi
    public final void b(InterfaceC7668xi<E> interfaceC7668xi) {
        C3049bx<InterfaceC7668xi<E>> c3049bx = this.d;
        c3049bx.e.addIfAbsent(interfaceC7668xi);
        c3049bx.a();
    }
}
