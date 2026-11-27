package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Iz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1265Iz1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 1;
    public final InterfaceC1531Mk1 b;

    public C1265Iz1(InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                final C5206lz1 holder = (C5206lz1) ((InterfaceC1454Lk1) this.b).get();
                Intrinsics.checkNotNullParameter(holder, "holder");
                return new InterfaceC7773yB1() { // from class: Hz1
                    @Override // defpackage.InterfaceC7773yB1
                    public final void a(LinkedHashMap out) {
                        C5206lz1 c5206lz1 = holder;
                        Intrinsics.checkNotNullParameter(out, "out");
                        String str = c5206lz1.b;
                        if (str != null) {
                            out.put("robot_session_id", str);
                        }
                    }
                };
            default:
                return new C4110h02((InterfaceC1442Lg1) this.b.get());
        }
    }

    public C1265Iz1(C5207m c5207m, InterfaceC1454Lk1 interfaceC1454Lk1) {
        this.b = interfaceC1454Lk1;
    }
}
