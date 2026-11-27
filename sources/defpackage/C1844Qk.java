package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Qk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1844Qk implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 0;
    public final InterfaceC1454Lk1 b;

    public C1844Qk(InterfaceC1454Lk1 interfaceC1454Lk1) {
        this.b = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C1766Pk((InterfaceC7759y72) this.b.get());
            default:
                final C6964uM0 holder = (C6964uM0) this.b.get();
                Intrinsics.checkNotNullParameter(holder, "holder");
                return new InterfaceC7773yB1() { // from class: Ez1
                    @Override // defpackage.InterfaceC7773yB1
                    public final void a(LinkedHashMap out) {
                        C6964uM0 c6964uM0 = holder;
                        Intrinsics.checkNotNullParameter(out, "out");
                        String str = c6964uM0.a;
                        if (str != null) {
                            out.put("last_dialog_shown", str);
                        }
                    }
                };
        }
    }

    public C1844Qk(C5207m c5207m, InterfaceC1454Lk1 interfaceC1454Lk1) {
        this.b = interfaceC1454Lk1;
    }
}
