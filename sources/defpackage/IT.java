package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class IT extends AbstractC2849b0<C6984uT, HT> {

    @NotNull
    public final C6457rx<HT> a;

    public static final class a implements InterfaceC3058c0<HT, a>, LT.a, LT.c, LT.d, LT.b {

        @NotNull
        public final C7458wi<HT> a;

        public a(@NotNull C7458wi<HT> actualBuilder) {
            Intrinsics.checkNotNullParameter(actualBuilder, "actualBuilder");
            this.a = actualBuilder;
        }

        @Override // defpackage.InterfaceC3058c0
        @NotNull
        public final C7458wi<HT> a() {
            return this.a;
        }

        @Override // defpackage.InterfaceC3058c0
        public final void b(@NotNull String str, @NotNull Function1<? super a, Unit> function1) {
            InterfaceC3058c0.a.b(this, str, function1);
        }

        @Override // LT.a
        public final void c(@NotNull C3693f11 names) {
            Intrinsics.checkNotNullParameter(names, "names");
            Intrinsics.checkNotNullParameter(names, "names");
            t(new C3449dr(new C3483e11(names)));
        }

        @Override // defpackage.LT
        public final void d(@NotNull String str) {
            InterfaceC3058c0.a.d(this, str);
        }

        @Override // LT.a
        public final void e() {
            EnumC6172qb1 padding = EnumC6172qb1.e;
            Intrinsics.checkNotNullParameter(padding, "padding");
            Intrinsics.checkNotNullParameter(padding, "padding");
            t(new C3449dr(new Ml2()));
        }

        @Override // LT.d
        public final void f(@NotNull Tb2 format) {
            Intrinsics.checkNotNullParameter(format, "format");
            if (format != null) {
                u(format.a);
            }
        }

        @Override // LT.c
        public final void g() {
            EnumC6172qb1 padding = EnumC6172qb1.e;
            Intrinsics.checkNotNullParameter(padding, "padding");
            Intrinsics.checkNotNullParameter(padding, "padding");
            v(new C3449dr(new C6679t01()));
        }

        @Override // LT.a
        public final void h() {
            EnumC6172qb1 padding = EnumC6172qb1.e;
            Intrinsics.checkNotNullParameter(padding, "padding");
            Intrinsics.checkNotNullParameter(padding, "padding");
            t(new C3449dr(new C3274d11()));
        }

        @Override // LT.c
        public final void i() {
            EnumC6172qb1 padding = EnumC6172qb1.e;
            Intrinsics.checkNotNullParameter(padding, "padding");
            Intrinsics.checkNotNullParameter(padding, "padding");
            v(new C3449dr(new C7361wE1()));
        }

        @Override // LT.c
        public final void j() {
            EnumC6172qb1 padding = EnumC6172qb1.e;
            Intrinsics.checkNotNullParameter(padding, "padding");
            Intrinsics.checkNotNullParameter(padding, "padding");
            v(new C3449dr(new C4962kp0()));
        }

        @Override // LT.a
        public final void k(@NotNull EnumC6172qb1 padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            Intrinsics.checkNotNullParameter(padding, "padding");
            t(new C3449dr(new RT(padding)));
        }

        @Override // LT.d
        public final void l() {
            EnumC6172qb1 padding = EnumC6172qb1.e;
            Intrinsics.checkNotNullParameter(padding, "padding");
            u(new TL1(new C3449dr(new C5337mc2())));
        }

        @Override // LT.d
        public final void m() {
            EnumC6172qb1 padding = EnumC6172qb1.e;
            Intrinsics.checkNotNullParameter(padding, "padding");
            u(new C3449dr(new C4914kc2()));
        }

        @Override // LT.a
        public final void n(@NotNull KT<C7189vR0> format) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(format, "format");
            if (format instanceof C7400wR0) {
                t(((C7400wR0) format).a);
            }
        }

        @Override // LT.c
        public final void o() {
            v(new C3449dr(new C2070Th0(0)));
        }

        @Override // defpackage.InterfaceC3058c0
        public final void p(@NotNull Function1<? super a, Unit>[] function1Arr, @NotNull Function1<? super a, Unit> function1) {
            InterfaceC3058c0.a.a(this, function1Arr, function1);
        }

        @Override // LT.d
        public final void q() {
            EnumC6172qb1 padding = EnumC6172qb1.e;
            Intrinsics.checkNotNullParameter(padding, "padding");
            u(new C3449dr(new C4704jc2()));
        }

        @Override // LT.a
        public final void r(@NotNull UT names) {
            Intrinsics.checkNotNullParameter(names, "names");
            Intrinsics.checkNotNullParameter(names, "names");
            t(new C3449dr(new ST(names)));
        }

        @Override // defpackage.InterfaceC3058c0
        public final InterfaceC3058c0 s() {
            return new a(new C7458wi());
        }

        public final void t(@NotNull InterfaceC1132Hh0<? super InterfaceC6145qT> structure) {
            Intrinsics.checkNotNullParameter(structure, "structure");
            Intrinsics.checkNotNullParameter(structure, "structure");
            this.a.a(structure);
        }

        public final void u(@NotNull InterfaceC1132Hh0<? super Sb2> structure) {
            Intrinsics.checkNotNullParameter(structure, "structure");
            this.a.a(structure);
        }

        public final void v(@NotNull C3449dr structure) {
            Intrinsics.checkNotNullParameter(structure, "structure");
            Intrinsics.checkNotNullParameter(structure, "structure");
            this.a.a(structure);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IT(@NotNull C6457rx<? super HT> actualFormat) {
        Intrinsics.checkNotNullParameter(actualFormat, "actualFormat");
        this.a = actualFormat;
    }

    @Override // defpackage.AbstractC2849b0
    @NotNull
    public final C6457rx<HT> a() {
        return this.a;
    }

    @Override // defpackage.AbstractC2849b0
    public final InterfaceC2928bN b() {
        return JT.a;
    }

    @Override // defpackage.AbstractC2849b0
    public final C6984uT c(InterfaceC2928bN interfaceC2928bN) {
        HT intermediate = (HT) interfaceC2928bN;
        Intrinsics.checkNotNullParameter(intermediate, "intermediate");
        return new C6984uT(intermediate);
    }
}
