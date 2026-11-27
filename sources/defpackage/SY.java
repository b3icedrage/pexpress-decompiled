package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SY implements Function1 {
    public static final SY e = new SY(0);
    public static final SY g = new SY(1);
    public static final SY h = new SY(2);
    public final /* synthetic */ int d;

    public /* synthetic */ SY(int i) {
        this.d = i;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.d) {
            case 0:
                InterfaceC3383dZ withOptions = (InterfaceC3383dZ) obj;
                C2964bZ c2964bZ = XY.a;
                Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                withOptions.j();
                withOptions.d(C6702t60.d);
                withOptions.g(InterfaceC5467nD.b.a);
                withOptions.f();
                withOptions.h(EnumC1897Rb1.g);
                withOptions.a();
                withOptions.c();
                withOptions.m();
                withOptions.i();
                return Unit.a;
            case 1:
                Class cls = (Class) obj;
                Intrinsics.checkNotNull(cls);
                return C4753jp1.b(cls);
            default:
                P92 it = (P92) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                InterfaceC5044lD interfaceC5044lDC = it.V0().c();
                if (interfaceC5044lDC != null) {
                    Intrinsics.checkNotNullParameter(interfaceC5044lDC, "<this>");
                    if ((interfaceC5044lDC instanceof H62) && (((H62) interfaceC5044lDC).e() instanceof InterfaceC3714f62)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
