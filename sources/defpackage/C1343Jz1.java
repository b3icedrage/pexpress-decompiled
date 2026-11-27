package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Jz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1343Jz1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 1;
    public final InterfaceC1454Lk1 b;

    public C1343Jz1(InterfaceC1454Lk1 interfaceC1454Lk1) {
        this.b = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                final S12 holder = (S12) this.b.get();
                Intrinsics.checkNotNullParameter(holder, "holder");
                return new InterfaceC7773yB1() { // from class: Fz1
                    @Override // defpackage.InterfaceC7773yB1
                    public final void a(LinkedHashMap out) {
                        S12 s12 = holder;
                        Intrinsics.checkNotNullParameter(out, "out");
                        String str = s12.a;
                        if (str != null) {
                            out.put("current_bet_request_id", str);
                        }
                    }
                };
            default:
                return new Da2((M8) this.b.get());
        }
    }

    public C1343Jz1(C5207m c5207m, InterfaceC1454Lk1 interfaceC1454Lk1) {
        this.b = interfaceC1454Lk1;
    }
}
