package defpackage;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public final class XI0 implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ XI0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List listX;
        Object obj = this.e;
        switch (this.d) {
            case 0:
                C3545eJ0.a aVar = (C3545eJ0.a) obj;
                aVar.getClass();
                IJ0<Object>[] ij0Arr = C3545eJ0.a.p;
                IJ0<Object> ij0 = ij0Arr[10];
                Object objInvoke = aVar.k.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
                IJ0<Object> ij1 = ij0Arr[12];
                Object objInvoke2 = aVar.m.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke2, "getValue(...)");
                return CollectionsKt.Q((Collection) objInvoke, (Collection) objInvoke2);
            case 1:
                HJ0 hj0 = (HJ0) obj;
                InterfaceC1582Nb1 interfaceC1582Nb1A = hj0.a();
                boolean z = interfaceC1582Nb1A instanceof InterfaceC1076Go1;
                PI0<?> pi0 = hj0.a;
                if (z && Intrinsics.a(C7437wc2.g(pi0.o()), interfaceC1582Nb1A) && pi0.o().h() == InterfaceC1490Lx.a.e) {
                    InterfaceC4675jU interfaceC4675jUE = pi0.o().e();
                    Intrinsics.c(interfaceC4675jUE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class<?> clsK = C7437wc2.k((FC) interfaceC4675jUE);
                    if (clsK != null) {
                        return clsK;
                    }
                    throw new C3761fL0("Cannot determine receiver Java type of inherited declaration: " + interfaceC1582Nb1A);
                }
                InterfaceC2355Wx<?> interfaceC2355WxI = pi0.i();
                boolean z2 = interfaceC2355WxI instanceof Qc2;
                int i = hj0.b;
                if (!z2) {
                    if (!(interfaceC2355WxI instanceof Qc2.b)) {
                        return interfaceC2355WxI.b().get(i);
                    }
                    Class[] clsArr = (Class[]) ((Collection) ((Qc2.b) interfaceC2355WxI).d.get(i)).toArray(new Class[0]);
                    Type[] typeArr = (Type[]) Arrays.copyOf(clsArr, clsArr.length);
                    int length = typeArr.length;
                    if (length != 0) {
                        return length != 1 ? new HJ0.a(typeArr) : (Type) C1526Mj.A(typeArr);
                    }
                    throw new C3971gL0("Expected at least 1 type for compound type");
                }
                if (pi0.t()) {
                    Qc2 qc2 = (Qc2) interfaceC2355WxI;
                    IntRange intRangeD = qc2.d(i + 1);
                    int i2 = qc2.d(0).e + 1;
                    listX = CollectionsKt.X(qc2.b.b(), new IntRange(intRangeD.d - i2, intRangeD.e - i2, 1));
                } else {
                    Qc2 qc3 = (Qc2) interfaceC2355WxI;
                    listX = CollectionsKt.X(qc3.b.b(), qc3.d(i));
                }
                Type[] typeArr2 = (Type[]) listX.toArray(new Type[0]);
                Type[] typeArr3 = (Type[]) Arrays.copyOf(typeArr2, typeArr2.length);
                int length2 = typeArr3.length;
                if (length2 != 0) {
                    return length2 != 1 ? new HJ0.a(typeArr3) : (Type) C1526Mj.A(typeArr3);
                }
                throw new C3971gL0("Expected at least 1 type for compound type");
            default:
                RK0 rk0 = (RK0) obj;
                return Arrays.asList(rk0.k().A0(C4194hP1.l), rk0.k().A0(C4194hP1.n), rk0.k().A0(C4194hP1.o), rk0.k().A0(C4194hP1.m));
        }
    }
}
