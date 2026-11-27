package defpackage;

import com.jivosite.sdk.db.SdkDb;

/* JADX INFO: renamed from: d9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3304d9 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1454Lk1 b;
    public final InterfaceC1454Lk1 c;

    public /* synthetic */ C3304d9(InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1454Lk1 interfaceC1454Lk2, int i) {
        this.a = i;
        this.b = interfaceC1454Lk1;
        this.c = interfaceC1454Lk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new S8((InterfaceC5889pD1) this.b.get(), (SdkDb) this.c.get());
            default:
                return new C3382dY1((C6102qE1) this.b.get(), (InterfaceC5889pD1) this.c.get());
        }
    }
}
