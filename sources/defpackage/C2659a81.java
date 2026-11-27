package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: a81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.content.ObservableContent$content$1", f = "ObservableContent.kt", l = {36}, m = "invokeSuspend")
public final class C2659a81 extends AW1 implements Function2<InterfaceC5583nl2, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C2883b81 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2659a81(C2883b81 c2883b81, JM<? super C2659a81> jm) {
        super(2, jm);
        this.g = c2883b81;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C2659a81 c2659a81 = new C2659a81(this.g, jm);
        c2659a81.e = obj;
        return c2659a81;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC5583nl2 interfaceC5583nl2, JM<? super Unit> jm) {
        return ((C2659a81) create(interfaceC5583nl2, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC5583nl2 interfaceC5583nl2 = (InterfaceC5583nl2) this.e;
            AbstractC1112Ha1.d dVar = (AbstractC1112Ha1.d) this.g.a;
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
