package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Wy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2358Wy extends AbstractC7124v62 {
    @Override // defpackage.AbstractC7124v62
    public final N62 h(InterfaceC6494s62 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        InterfaceC2540Yy interfaceC2540Yy = key instanceof InterfaceC2540Yy ? (InterfaceC2540Yy) key : null;
        if (interfaceC2540Yy == null) {
            return null;
        }
        if (interfaceC2540Yy.f().c()) {
            return new P62(interfaceC2540Yy.f().getType(), EnumC3610ed2.OUT_VARIANCE);
        }
        return interfaceC2540Yy.f();
    }
}
