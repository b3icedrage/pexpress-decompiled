package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$fromExtension$2", f = "KotlinxSerializationConverter.kt", l = {}, m = "invokeSuspend")
public final class C7382wL0 extends AW1 implements Function2<Object, JM<? super Boolean>, Object> {
    public /* synthetic */ Object d;
    public final /* synthetic */ InterfaceC0942Ew e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7382wL0(InterfaceC0942Ew interfaceC0942Ew, JM<? super C7382wL0> jm) {
        super(2, jm);
        this.e = interfaceC0942Ew;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C7382wL0 c7382wL0 = new C7382wL0(this.e, jm);
        c7382wL0.d = obj;
        return c7382wL0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, JM<? super Boolean> jm) {
        return ((C7382wL0) create(obj, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return Boolean.valueOf(this.d != null || this.e.k());
    }
}
