package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class LR0 {

    @NotNull
    public static final KW1 a = XO0.b(a.d);

    @NotNull
    public static final C8139zx0 b = new C8139zx0(0);

    public static final class a extends ML0 implements Function0<GR0> {
        public static final a d = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final GR0 invoke() {
            KR0 block = KR0.d;
            Intrinsics.checkNotNullParameter(block, "block");
            GR0.a aVar = new GR0.a(new C7458wi());
            block.invoke(aVar);
            return new GR0(InterfaceC3058c0.a.c(aVar));
        }
    }
}
