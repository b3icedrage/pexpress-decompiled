package defpackage;

import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class RY implements Function1 {
    public static final RY e = new RY(0);
    public static final RY g = new RY(1);
    public static final RY h = new RY(2);
    public final /* synthetic */ int d;

    public /* synthetic */ RY(int i) {
        this.d = i;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zR;
        QC qcF;
        AbstractC4649jL0 abstractC4649jL0N;
        boolean zR2;
        switch (this.d) {
            case 0:
                InterfaceC3383dZ withOptions = (InterfaceC3383dZ) obj;
                C2964bZ c2964bZ = XY.a;
                Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                withOptions.d(C6702t60.d);
                withOptions.g(InterfaceC5467nD.b.a);
                withOptions.h(EnumC1897Rb1.e);
                return Unit.a;
            case 1:
                Class<?> returnType = ((Method) obj).getReturnType();
                Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                return C4753jp1.b(returnType);
            default:
                InterfaceC2076Tj0 Checks = (InterfaceC2076Tj0) obj;
                U91 u91 = U91.a;
                Intrinsics.checkNotNullParameter(Checks, "$this$Checks");
                InterfaceC1076Go1 interfaceC1076Go1M0 = Checks.m0();
                if (interfaceC1076Go1M0 == null) {
                    interfaceC1076Go1M0 = Checks.r0();
                }
                boolean z = false;
                if (interfaceC1076Go1M0 != null) {
                    AbstractC4649jL0 abstractC4649jL0N2 = Checks.n();
                    if (abstractC4649jL0N2 != null) {
                        AbstractC4649jL0 type = interfaceC1076Go1M0.getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        zR = C0564Aa.r(abstractC4649jL0N2, type);
                    } else {
                        zR = false;
                    }
                    if (zR) {
                        z = true;
                    } else {
                        U91.a.getClass();
                        InterfaceC1232Io1 value = interfaceC1076Go1M0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        if (value instanceof C1411Kw0) {
                            FC fc = ((C1411Kw0) value).a;
                            if (fc.Q() && (qcF = C4900kZ.f(fc)) != null) {
                                InterfaceC5044lD interfaceC5044lDB = C7859yd0.b(C4900kZ.j(fc), qcF);
                                InterfaceC3714f62 interfaceC3714f62 = interfaceC5044lDB instanceof InterfaceC3714f62 ? (InterfaceC3714f62) interfaceC5044lDB : null;
                                if (interfaceC3714f62 == null || (abstractC4649jL0N = Checks.n()) == null) {
                                    zR2 = false;
                                } else {
                                    zR2 = C0564Aa.r(abstractC4649jL0N, interfaceC3714f62.b0());
                                }
                            } else {
                                zR2 = false;
                            }
                        } else {
                            zR2 = false;
                        }
                        if (zR2) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    return null;
                }
                return "receiver must be a supertype of the return type";
        }
    }
}
