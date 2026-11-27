package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class YX0<T> implements InterfaceC3590eY0<T> {
    @Override // defpackage.InterfaceC3590eY0
    public final void a(InterfaceC3381dY0<? super T> interfaceC3381dY0) {
        try {
            b(interfaceC3381dY0);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C4994l.j(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void b(InterfaceC3381dY0<? super T> interfaceC3381dY0);
}
