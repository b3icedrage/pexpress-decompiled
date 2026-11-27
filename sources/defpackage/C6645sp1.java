package defpackage;

import java.lang.reflect.Field;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: sp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6645sp1 extends C2574Zj0 implements Function1<Field, C0689Bp1> {
    public static final C6645sp1 m = new C6645sp1(1);

    @Override // defpackage.AbstractC1568Mx, defpackage.JI0
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0689Bp1 invoke(Field field) {
        Field p0 = field;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new C0689Bp1(p0);
    }

    @Override // defpackage.AbstractC1568Mx
    public final InterfaceC5486nJ0 j() {
        return C2017Sp1.a.b(C0689Bp1.class);
    }

    @Override // defpackage.AbstractC1568Mx
    public final String o() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }
}
