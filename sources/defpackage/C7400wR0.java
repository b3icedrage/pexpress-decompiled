package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7400wR0 extends AbstractC2849b0<C7189vR0, C7929yx0> {

    @NotNull
    public final C6457rx<InterfaceC6145qT> a;

    /* JADX INFO: renamed from: wR0$a */
    public static final class a implements InterfaceC3058c0<InterfaceC6145qT, a>, LT.a {

        @NotNull
        public final C7458wi<InterfaceC6145qT> a;

        public a(@NotNull C7458wi<InterfaceC6145qT> actualBuilder) {
            Intrinsics.checkNotNullParameter(actualBuilder, "actualBuilder");
            this.a = actualBuilder;
        }

        @Override // defpackage.InterfaceC3058c0
        @NotNull
        public final C7458wi<InterfaceC6145qT> a() {
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

        @Override // LT.a
        public final void e() {
            EnumC6172qb1 padding = EnumC6172qb1.e;
            Intrinsics.checkNotNullParameter(padding, "padding");
            t(new C3449dr(new Ml2()));
        }

        @Override // LT.a
        public final void h() {
            EnumC6172qb1 padding = EnumC6172qb1.e;
            Intrinsics.checkNotNullParameter(padding, "padding");
            t(new C3449dr(new C3274d11()));
        }

        @Override // LT.a
        public final void k(@NotNull EnumC6172qb1 enumC6172qb1) {
            EnumC6172qb1 padding = EnumC6172qb1.e;
            Intrinsics.checkNotNullParameter(padding, "padding");
            t(new C3449dr(new RT(padding)));
        }

        @Override // defpackage.InterfaceC3058c0
        public final void p(@NotNull Function1<? super a, Unit>[] function1Arr, @NotNull Function1<? super a, Unit> function1) {
            InterfaceC3058c0.a.a(this, function1Arr, function1);
        }

        @Override // defpackage.InterfaceC3058c0
        public final InterfaceC3058c0 s() {
            return new a(new C7458wi());
        }

        public final void t(@NotNull InterfaceC1132Hh0<? super InterfaceC6145qT> structure) {
            Intrinsics.checkNotNullParameter(structure, "structure");
            this.a.a(structure);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7400wR0(@NotNull C6457rx<? super InterfaceC6145qT> actualFormat) {
        Intrinsics.checkNotNullParameter(actualFormat, "actualFormat");
        this.a = actualFormat;
    }

    @Override // defpackage.AbstractC2849b0
    @NotNull
    public final C6457rx<InterfaceC6145qT> a() {
        return this.a;
    }

    @Override // defpackage.AbstractC2849b0
    public final InterfaceC2928bN b() {
        return C7820yR0.c;
    }

    @Override // defpackage.AbstractC2849b0
    public final C7189vR0 c(InterfaceC2928bN interfaceC2928bN) {
        C7929yx0 intermediate = (C7929yx0) interfaceC2928bN;
        Intrinsics.checkNotNullParameter(intermediate, "intermediate");
        return intermediate.b();
    }
}
