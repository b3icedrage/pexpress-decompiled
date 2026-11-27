package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serializeNullable$fromExtension$2", f = "KotlinxSerializationConverter.kt", l = {}, m = "invokeSuspend")
public final class C8012zL0 extends AW1 implements Function2<AbstractC1112Ha1, JM<? super Boolean>, Object> {
    public /* synthetic */ Object d;

    public C8012zL0() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C8012zL0 c8012zL0 = new C8012zL0(2, jm);
        c8012zL0.d = obj;
        return c8012zL0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC1112Ha1 abstractC1112Ha1, JM<? super Boolean> jm) {
        return ((C8012zL0) create(abstractC1112Ha1, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return Boolean.valueOf(((AbstractC1112Ha1) this.d) != null);
    }
}
