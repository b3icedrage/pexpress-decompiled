package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DK implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public DK(FC fc, C2086Tm1 c2086Tm1, AbstractC5706oM1 abstractC5706oM1, VE0 ve0) {
        this.d = 3;
        this.e = fc;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                S01 it = (S01) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                AbstractC5706oM1 abstractC5706oM1Q = it.t().q((EnumC6405rh1) this.e);
                Intrinsics.checkNotNullExpressionValue(abstractC5706oM1Q, "getPrimitiveArrayKotlinType(...)");
                return abstractC5706oM1Q;
            case 1:
                ZE0 typeParameter = (ZE0) obj;
                Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
                WO0 typeParameterResolver = (WO0) this.e;
                Integer num = (Integer) typeParameterResolver.d.get(typeParameter);
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                LO0 lo0 = typeParameterResolver.a;
                Intrinsics.checkNotNullParameter(lo0, "<this>");
                Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
                LO0 lo1 = new LO0(lo0.a, typeParameterResolver, lo0.c);
                InterfaceC5095lU interfaceC5095lU = typeParameterResolver.b;
                return new VO0(C2432Xo.g(lo1, interfaceC5095lU.k()), typeParameter, typeParameterResolver.c + iIntValue, interfaceC5095lU);
            case 2:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                C2905bF0 c2905bF0 = C4719jg1.b;
                function.c((String) this.e, c2905bF0, c2905bF0);
                return Unit.a;
            default:
                AbstractC6331rL0 kotlinTypeRefiner = (AbstractC6331rL0) obj;
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                QC qcF = C4900kZ.f((FC) this.e);
                if (qcF == null) {
                    return null;
                }
                kotlinTypeRefiner.w(qcF);
                return null;
        }
    }

    public /* synthetic */ DK(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }
}
