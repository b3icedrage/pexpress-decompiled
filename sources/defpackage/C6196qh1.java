package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6196qh1 implements Function0 {
    public final EnumC6405rh1 d;

    public C6196qh1(EnumC6405rh1 enumC6405rh1) {
        this.d = enumC6405rh1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C1758Ph0 c1758Ph0C = C4194hP1.l.c(this.d.e);
        Intrinsics.checkNotNullExpressionValue(c1758Ph0C, "child(...)");
        return c1758Ph0C;
    }
}
