package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: v81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7131v81 extends C4077gq0 {

    @NotNull
    public final a a = a.d;
    public final int b = 10;

    /* JADX INFO: renamed from: v81$a */
    public static final class a extends ML0 implements Function1<C6711t81.a, Unit> {
        public static final a d = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C6711t81.a aVar) {
            C6711t81.a aVar2 = aVar;
            Intrinsics.checkNotNullParameter(aVar2, "$this$null");
            aVar2.h = false;
            aVar2.i = false;
            aVar2.f = true;
            return Unit.a;
        }
    }
}
