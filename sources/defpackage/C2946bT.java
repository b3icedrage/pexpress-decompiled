package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.core.DataStoreImpl$writeActor$3", f = "DataStoreImpl.kt", l = {207}, m = "invokeSuspend")
public final class C2946bT extends AW1 implements Function2<AbstractC6373rZ0.a<Object>, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ IS<Object> g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2946bT(IS<Object> is, JM<? super C2946bT> jm) {
        super(2, jm);
        this.g = is;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C2946bT c2946bT = new C2946bT(this.g, jm);
        c2946bT.e = obj;
        return c2946bT;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC6373rZ0.a<Object> aVar, JM<? super Unit> jm) {
        return ((C2946bT) create(aVar, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            AbstractC6373rZ0.a aVar = (AbstractC6373rZ0.a) this.e;
            this.d = 1;
            if (IS.c(this.g, aVar, this) == mn) {
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
