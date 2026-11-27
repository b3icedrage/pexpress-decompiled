package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Tb2 extends AbstractC2849b0<Rb2, C0712Bx0> {

    @NotNull
    public final C6457rx<Sb2> a;

    public static final class a implements InterfaceC3058c0<Sb2, a>, LT.d {

        @NotNull
        public final C7458wi<Sb2> a;

        public a(@NotNull C7458wi<Sb2> actualBuilder) {
            Intrinsics.checkNotNullParameter(actualBuilder, "actualBuilder");
            this.a = actualBuilder;
        }

        @Override // defpackage.InterfaceC3058c0
        @NotNull
        public final C7458wi<Sb2> a() {
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

        @Override // LT.d
        public final void l() {
            EnumC6172qb1 padding = EnumC6172qb1.e;
            Intrinsics.checkNotNullParameter(padding, "padding");
            t(new TL1(new C3449dr(new C5337mc2())));
        }

        @Override // LT.d
        public final void m() {
            EnumC6172qb1 padding = EnumC6172qb1.e;
            Intrinsics.checkNotNullParameter(padding, "padding");
            t(new C3449dr(new C4914kc2()));
        }

        @Override // defpackage.InterfaceC3058c0
        public final void p(@NotNull Function1<? super a, Unit>[] function1Arr, @NotNull Function1<? super a, Unit> function1) {
            InterfaceC3058c0.a.a(this, function1Arr, function1);
        }

        @Override // LT.d
        public final void q() {
            EnumC6172qb1 padding = EnumC6172qb1.e;
            Intrinsics.checkNotNullParameter(padding, "padding");
            t(new C3449dr(new C4704jc2()));
        }

        @Override // defpackage.InterfaceC3058c0
        public final InterfaceC3058c0 s() {
            return new a(new C7458wi());
        }

        public final void t(@NotNull InterfaceC1132Hh0<? super Sb2> structure) {
            Intrinsics.checkNotNullParameter(structure, "structure");
            this.a.a(structure);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Tb2(@NotNull C6457rx<? super Sb2> actualFormat) {
        Intrinsics.checkNotNullParameter(actualFormat, "actualFormat");
        this.a = actualFormat;
    }

    @Override // defpackage.AbstractC2849b0
    @NotNull
    public final C6457rx<Sb2> a() {
        return this.a;
    }

    @Override // defpackage.AbstractC2849b0
    public final InterfaceC2928bN b() {
        return Vb2.d;
    }

    @Override // defpackage.AbstractC2849b0
    public final Rb2 c(InterfaceC2928bN interfaceC2928bN) {
        C0712Bx0 intermediate = (C0712Bx0) interfaceC2928bN;
        Intrinsics.checkNotNullParameter(intermediate, "intermediate");
        return intermediate.b();
    }
}
