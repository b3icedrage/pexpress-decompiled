package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class MQ implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1454Lk1 b;

    public /* synthetic */ MQ(InterfaceC1454Lk1 interfaceC1454Lk1, int i) {
        this.a = i;
        this.b = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new LQ((C6038px) this.b.get());
            default:
                return new J22((AbstractC4892kW0) this.b.get());
        }
    }
}
