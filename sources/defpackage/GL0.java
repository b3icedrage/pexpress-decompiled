package defpackage;

import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$2", f = "KotlinxSerializationJsonExtensions.kt", l = {51}, m = "invokeSuspend")
public final class GL0 extends AW1 implements Function2<InterfaceC1958Rw, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ IL0 g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ RJ0<?> i;
    public final /* synthetic */ Charset j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GL0(IL0 il0, Object obj, RJ0<?> rj0, Charset charset, JM<? super GL0> jm) {
        super(2, jm);
        this.g = il0;
        this.h = obj;
        this.i = rj0;
        this.j = charset;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        GL0 gl0 = new GL0(this.g, this.h, this.i, this.j, jm);
        gl0.e = obj;
        return gl0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1958Rw interfaceC1958Rw, JM<? super Unit> jm) {
        return ((GL0) create(interfaceC1958Rw, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC1958Rw interfaceC1958Rw = (InterfaceC1958Rw) this.e;
            Object obj2 = this.h;
            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<*>");
            RJ0<?> rj0 = this.i;
            Intrinsics.c(rj0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            this.d = 1;
            if (IL0.c(this.g, (InterfaceC6396rf0) obj2, rj0, this.j, interfaceC1958Rw, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}
