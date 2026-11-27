package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.engine.okhttp.OkHttpEngineKt$convertToOkHttpBody$3$1", f = "OkHttpEngine.kt", l = {204}, m = "invokeSuspend")
public final class B81 extends AW1 implements Function2<InterfaceC5583nl2, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ AbstractC1112Ha1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B81(AbstractC1112Ha1 abstractC1112Ha1, JM<? super B81> jm) {
        super(2, jm);
        this.g = abstractC1112Ha1;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        B81 b81 = new B81(this.g, jm);
        b81.e = obj;
        return b81;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC5583nl2 interfaceC5583nl2, JM<? super Unit> jm) {
        return ((B81) create(interfaceC5583nl2, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC5583nl2 interfaceC5583nl2 = (InterfaceC5583nl2) this.e;
            AbstractC1112Ha1.d dVar = (AbstractC1112Ha1.d) this.g;
            InterfaceC6245qw interfaceC6245qwI0 = interfaceC5583nl2.i0();
            this.d = 1;
            if (dVar.d(interfaceC6245qwI0, this) == mn) {
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
