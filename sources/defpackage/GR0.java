package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class GR0 extends AbstractC2849b0<FR0, C8139zx0> {

    @NotNull
    public final C6457rx<InterfaceC2966bZ1> a;

    public static final class a implements InterfaceC3058c0<InterfaceC2966bZ1, a>, LT.c {

        @NotNull
        public final C7458wi<InterfaceC2966bZ1> a;

        public a(@NotNull C7458wi<InterfaceC2966bZ1> actualBuilder) {
            Intrinsics.checkNotNullParameter(actualBuilder, "actualBuilder");
            this.a = actualBuilder;
        }

        @Override // defpackage.InterfaceC3058c0
        @NotNull
        public final C7458wi<InterfaceC2966bZ1> a() {
            return this.a;
        }

        @Override // defpackage.InterfaceC3058c0
        public final void b(@NotNull String str, @NotNull Function1<? super a, Unit> function1) {
            InterfaceC3058c0.a.b(this, str, function1);
        }

        @Override // defpackage.LT
        public final void d(@NotNull String str) {
            InterfaceC3058c0.a.d(this, str);
        }

        @Override // LT.c
        public final void g() {
            EnumC6172qb1 padding = EnumC6172qb1.e;
            Intrinsics.checkNotNullParameter(padding, "padding");
            t(new C3449dr(new C6679t01()));
        }

        @Override // LT.c
        public final void i() {
            EnumC6172qb1 padding = EnumC6172qb1.e;
            Intrinsics.checkNotNullParameter(padding, "padding");
            t(new C3449dr(new C7361wE1()));
        }

        @Override // LT.c
        public final void j() {
            EnumC6172qb1 padding = EnumC6172qb1.e;
            Intrinsics.checkNotNullParameter(padding, "padding");
            t(new C3449dr(new C4962kp0()));
        }

        @Override // LT.c
        public final void o() {
            t(new C3449dr(new C2070Th0(0)));
        }

        @Override // defpackage.InterfaceC3058c0
        public final void p(@NotNull Function1<? super a, Unit>[] function1Arr, @NotNull Function1<? super a, Unit> function1) {
            InterfaceC3058c0.a.a(this, function1Arr, function1);
        }

        @Override // defpackage.InterfaceC3058c0
        public final InterfaceC3058c0 s() {
            return new a(new C7458wi());
        }

        public final void t(@NotNull C3449dr structure) {
            Intrinsics.checkNotNullParameter(structure, "structure");
            this.a.a(structure);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GR0(@NotNull C6457rx<? super InterfaceC2966bZ1> actualFormat) {
        Intrinsics.checkNotNullParameter(actualFormat, "actualFormat");
        this.a = actualFormat;
    }

    @Override // defpackage.AbstractC2849b0
    @NotNull
    public final C6457rx<InterfaceC2966bZ1> a() {
        return this.a;
    }

    @Override // defpackage.AbstractC2849b0
    public final InterfaceC2928bN b() {
        return LR0.b;
    }

    @Override // defpackage.AbstractC2849b0
    public final FR0 c(InterfaceC2928bN interfaceC2928bN) {
        C8139zx0 intermediate = (C8139zx0) interfaceC2928bN;
        Intrinsics.checkNotNullParameter(intermediate, "intermediate");
        return intermediate.d();
    }
}
