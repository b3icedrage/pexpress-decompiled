package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7101v1 implements Function0 {
    public final C6075q62 d;
    public final InterfaceC4366iD e;
    public final InterfaceC6126qM1 g;
    public final InterfaceC6126qM1 h;

    public C7101v1(C6075q62 c6075q62, InterfaceC4366iD interfaceC4366iD, InterfaceC6126qM1 interfaceC6126qM1, InterfaceC6126qM1 interfaceC6126qM2) {
        this.d = c6075q62;
        this.e = interfaceC4366iD;
        this.g = interfaceC6126qM1;
        this.h = interfaceC6126qM2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(C7311w1.h(this.d, this.e.g(this.g), this.h));
    }
}
