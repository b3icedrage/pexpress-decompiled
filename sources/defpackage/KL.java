package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.serialization.ContentConverterKt$deserialize$result$2", f = "ContentConverter.kt", l = {}, m = "invokeSuspend")
public final class KL extends AW1 implements Function2<Object, JM<? super Boolean>, Object> {
    public /* synthetic */ Object d;
    public final /* synthetic */ InterfaceC0942Ew e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KL(InterfaceC0942Ew interfaceC0942Ew, JM<? super KL> jm) {
        super(2, jm);
        this.e = interfaceC0942Ew;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        KL kl = new KL(this.e, jm);
        kl.d = obj;
        return kl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, JM<? super Boolean> jm) {
        return ((KL) create(obj, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return Boolean.valueOf(this.d != null || this.e.k());
    }
}
