package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class VL1<Target> implements InterfaceC7014uc0<Target> {

    @NotNull
    public final C1063Gk0 a;

    @Nullable
    public final Integer b;

    @Nullable
    public final Integer c;

    public /* synthetic */ class a extends C2784ak0 implements Function1<Target, Integer> {
        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Object obj) {
            return (Integer) ((InterfaceC6475s2) this.e).b(obj);
        }
    }

    public VL1(@NotNull C1063Gk0 field, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(field, "field");
        this.a = field;
        this.b = num;
        this.c = num2;
        if (num.intValue() >= 0) {
            return;
        }
        throw new IllegalArgumentException(("The minimum number of digits (" + num + ") is negative").toString());
    }

    @Override // defpackage.InterfaceC7014uc0
    @NotNull
    public final InterfaceC1210Ih0<Target> a() {
        a number = new a(1, this.a.a, InterfaceC6475s2.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        int iIntValue = this.b.intValue();
        Intrinsics.checkNotNullParameter(number, "number");
        WL1 wl1 = new WL1();
        if (iIntValue < 0) {
            throw new IllegalArgumentException(C1332Jw.a(iIntValue, "The minimum number of digits (", ") is negative").toString());
        }
        if (iIntValue <= 9) {
            return this.c != null ? new C3142cO1(wl1) : wl1;
        }
        throw new IllegalArgumentException(C1332Jw.a(iIntValue, "The minimum number of digits (", ") exceeds the length of an Int").toString());
    }

    @Override // defpackage.InterfaceC7014uc0
    @NotNull
    public final C7436wc1<Target> b() {
        C1063Gk0 c1063Gk0 = this.a;
        C6833tj1 setter = c1063Gk0.a;
        Intrinsics.checkNotNullParameter(setter, "setter");
        String name = c1063Gk0.b;
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.b;
        Integer num2 = this.c;
        ArrayList arrayListH = WE.h(C0957Fb.w(num, null, num2, setter, name, true));
        arrayListH.add(C0957Fb.w(num, 4, num2, setter, name, false));
        List listF = WE.f(new C1747Pd1("+"), new C7758y71(VE.c(new C7136v92(5, null, setter, name, false))));
        C5653o60 c5653o60 = C5653o60.d;
        arrayListH.add(new C7436wc1(listF, c5653o60));
        return new C7436wc1<>(c5653o60, arrayListH);
    }

    @Override // defpackage.InterfaceC7014uc0
    @NotNull
    public final InterfaceC0883Ec0<Target, Integer> c() {
        return this.a;
    }
}
