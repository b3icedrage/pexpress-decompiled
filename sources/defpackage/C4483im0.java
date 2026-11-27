package defpackage;

/* JADX INFO: renamed from: im0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4483im0 implements InterfaceC4742jm0<Object> {
    public volatile Object a;
    public final /* synthetic */ InterfaceC4742jm0 b;

    public C4483im0(InterfaceC4742jm0 interfaceC4742jm0) {
        this.b = interfaceC4742jm0;
    }

    @Override // defpackage.InterfaceC4742jm0
    public final Object get() {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        Object obj = this.b.get();
                        UE.e(obj, "Argument must not be null");
                        this.a = obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.a;
    }
}
