package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class QK0 implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ QK0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zEquals;
        switch (this.d) {
            case 0:
                C5638o21 c5638o21 = (C5638o21) obj;
                T01 t01K = ((RK0) this.e).k();
                C1758Ph0 c1758Ph0 = C4194hP1.l;
                QY0 qy0V = t01K.A0(c1758Ph0).v();
                if (qy0V == null) {
                    RK0.a(11);
                    throw null;
                }
                InterfaceC5044lD interfaceC5044lDF = ((AbstractC3062c1) qy0V).f(c5638o21, S41.d);
                if (interfaceC5044lDF == null) {
                    throw new AssertionError("Built-in class " + c1758Ph0.c(c5638o21) + " is not found");
                }
                if (interfaceC5044lDF instanceof FC) {
                    return (FC) interfaceC5044lDF;
                }
                throw new AssertionError("Must be a class descriptor " + c5638o21 + ", but was " + interfaceC5044lDF);
            case 1:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.c((String) this.e, C4719jg1.b);
                return Unit.a;
            default:
                Method method = (Method) obj;
                boolean z = false;
                if (!method.isSynthetic()) {
                    if (((C7065up1) this.e).a.isEnum()) {
                        Intrinsics.checkNotNull(method);
                        String name = method.getName();
                        if (Intrinsics.a(name, "values")) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (Intrinsics.a(name, "valueOf")) {
                            zEquals = Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
                        } else {
                            zEquals = false;
                        }
                        if (!zEquals) {
                            z = true;
                        }
                    } else {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
