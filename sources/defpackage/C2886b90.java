package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: b90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.core.utilities.EventsFileManager$1", f = "EventsFileManager.kt", l = {47}, m = "invokeSuspend")
public final class C2886b90 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C4144h90 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2886b90(C4144h90 c4144h90, JM<? super C2886b90> jm) {
        super(2, jm);
        this.e = c4144h90;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        return new C2886b90(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C2886b90) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            this.d = 1;
            if (C4144h90.b(this.e, this) == mn) {
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
