package defpackage;

/* JADX INFO: renamed from: uf2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7028uf2 implements InterfaceC0776Cs1 {
    public final /* synthetic */ C7238vf2 a;

    public C7028uf2(C7238vf2 c7238vf2) {
        this.a = c7238vf2;
    }

    @Override // defpackage.InterfaceC0776Cs1
    public final C4543is1 a() {
        C4543is1.a aVar = new C4543is1.a();
        String str = this.a.d;
        if (str == null) {
            throw new IllegalStateException("WS connect started before a connectable URL was set");
        }
        aVar.h(str);
        return aVar.b();
    }
}
