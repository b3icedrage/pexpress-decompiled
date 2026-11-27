package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class NY implements Function1 {
    public static final NY e = new NY(0);
    public static final NY g = new NY(1);
    public final /* synthetic */ int d;

    public /* synthetic */ NY(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                InterfaceC3383dZ withOptions = (InterfaceC3383dZ) obj;
                C2964bZ c2964bZ = XY.a;
                Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                EnumC1397Kr1.b bVar = EnumC1397Kr1.d;
                withOptions.l();
                withOptions.d(EnumC3173cZ.g);
                return Unit.a;
            case 1:
                InterfaceC1490Lx it = (InterfaceC1490Lx) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i = C0861Dv.l;
                InterfaceC3765fM1 functionDescriptor = (InterfaceC3765fM1) it;
                Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
                return Boolean.valueOf(RK0.z(functionDescriptor) && C4900kZ.b(functionDescriptor, new C3477e0(functionDescriptor, 2)) != null);
            default:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                Intrinsics.checkNotNullParameter("Spliterator", AppMeasurementSdk.ConditionalUserProperty.NAME);
                C2905bF0 c2905bF0 = C4719jg1.b;
                function.c("java/util/Spliterator", c2905bF0, c2905bF0);
                return Unit.a;
        }
    }
}
