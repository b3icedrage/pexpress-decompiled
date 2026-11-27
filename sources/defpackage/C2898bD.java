package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2898bD<T> implements InterfaceC3124cI1<T> {

    @NotNull
    public final ML0 a;

    @NotNull
    public final C3526eD<C4555ix<T>> b;

    /* JADX INFO: renamed from: bD$a */
    public static final class a extends ML0 implements Function0<T> {
        public final /* synthetic */ RI0 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RI0 ri0) {
            super(0);
            this.e = ri0;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [ML0, kotlin.jvm.functions.Function1] */
        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) new C4555ix((RJ0) C2898bD.this.a.invoke(this.e));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2898bD(@NotNull Function1<? super RI0<?>, ? extends RJ0<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.a = (ML0) compute;
        this.b = new C3526eD<>();
    }

    @Override // defpackage.InterfaceC3124cI1
    @Nullable
    public final RJ0<T> a(@NotNull RI0<Object> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.b.get(C7279vr.g(key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        C3697f21 c3697f21 = (C3697f21) obj;
        T t = c3697f21.a.get();
        if (t == null) {
            t = (T) c3697f21.a(new a(key));
        }
        return t.a;
    }
}
