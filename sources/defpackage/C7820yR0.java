package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7820yR0 {

    @NotNull
    public static final KW1 a = XO0.b(a.d);

    @NotNull
    public static final KW1 b = XO0.b(b.d);

    @NotNull
    public static final C7929yx0 c = new C7929yx0(null, null, null, null);

    /* JADX INFO: renamed from: yR0$a */
    public static final class a extends ML0 implements Function0<KT<C7189vR0>> {
        public static final a d = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final KT<C7189vR0> invoke() {
            C7610xR0 block = C7610xR0.d;
            Intrinsics.checkNotNullParameter(block, "block");
            C7400wR0.a aVar = new C7400wR0.a(new C7458wi());
            block.invoke(aVar);
            return new C7400wR0(InterfaceC3058c0.a.c(aVar));
        }
    }

    /* JADX INFO: renamed from: yR0$b */
    public static final class b extends ML0 implements Function0<KT<C7189vR0>> {
        public static final b d = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final KT<C7189vR0> invoke() {
            C8030zR0 block = C8030zR0.d;
            Intrinsics.checkNotNullParameter(block, "block");
            C7400wR0.a aVar = new C7400wR0.a(new C7458wi());
            block.invoke(aVar);
            return new C7400wR0(InterfaceC3058c0.a.c(aVar));
        }
    }

    public static final void a(@Nullable Object obj, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (obj == null) {
            throw new NT(C4694ja0.a("Can not create a ", name, " from the given input: the field ", name, " is missing"));
        }
    }
}
