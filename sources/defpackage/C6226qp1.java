package defpackage;

import java.lang.reflect.Constructor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6226qp1 extends C2574Zj0 implements Function1<Constructor<?>, C7906yp1> {
    public static final C6226qp1 m = new C6226qp1(1);

    @Override // defpackage.AbstractC1568Mx, defpackage.JI0
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.functions.Function1
    public final C7906yp1 invoke(Constructor<?> constructor) {
        Constructor<?> p0 = constructor;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new C7906yp1(p0);
    }

    @Override // defpackage.AbstractC1568Mx
    public final InterfaceC5486nJ0 j() {
        return C2017Sp1.a.b(C7906yp1.class);
    }

    @Override // defpackage.AbstractC1568Mx
    public final String o() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }
}
