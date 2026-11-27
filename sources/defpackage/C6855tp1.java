package defpackage;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6855tp1 extends C2574Zj0 implements Function1<Method, C0923Ep1> {
    public static final C6855tp1 m = new C6855tp1(1);

    @Override // defpackage.AbstractC1568Mx, defpackage.JI0
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0923Ep1 invoke(Method method) {
        Method p0 = method;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new C0923Ep1(p0);
    }

    @Override // defpackage.AbstractC1568Mx
    public final InterfaceC5486nJ0 j() {
        return C2017Sp1.a.b(C0923Ep1.class);
    }

    @Override // defpackage.AbstractC1568Mx
    public final String o() {
        return "<init>(Ljava/lang/reflect/Method;)V";
    }
}
