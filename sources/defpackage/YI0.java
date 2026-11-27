package defpackage;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class YI0 implements Function0 {
    public final AbstractC4649jL0 d;
    public final C3545eJ0.a e;
    public final C3545eJ0 g;

    public YI0(AbstractC4649jL0 abstractC4649jL0, C3545eJ0.a aVar, C3545eJ0 c3545eJ0) {
        this.d = abstractC4649jL0;
        this.e = aVar;
        this.g = c3545eJ0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC5044lD interfaceC5044lDC = this.d.V0().c();
        if (!(interfaceC5044lDC instanceof FC)) {
            throw new C3761fL0("Supertype not a class: " + interfaceC5044lDC);
        }
        Class<?> clsK = C7437wc2.k((FC) interfaceC5044lDC);
        C3545eJ0.a aVar = this.e;
        if (clsK == null) {
            throw new C3761fL0("Unsupported superclass of " + aVar + ": " + interfaceC5044lDC);
        }
        C3545eJ0 c3545eJ0 = this.g;
        boolean zA = Intrinsics.a(c3545eJ0.e.getSuperclass(), clsK);
        Class<T> cls = c3545eJ0.e;
        if (zA) {
            Type genericSuperclass = cls.getGenericSuperclass();
            Intrinsics.checkNotNull(genericSuperclass);
            return genericSuperclass;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
        int iU = C1526Mj.u(interfaces, clsK);
        if (iU >= 0) {
            Type type = cls.getGenericInterfaces()[iU];
            Intrinsics.checkNotNull(type);
            return type;
        }
        throw new C3761fL0("No superclass of " + aVar + " in Java reflection for " + interfaceC5044lDC);
    }
}
