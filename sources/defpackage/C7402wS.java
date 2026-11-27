package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
public final class C7402wS extends AW1 implements Function2<InterfaceC6089qA0<Object>, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ List<InterfaceC7191vS<Object>> g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C7402wS(List<? extends InterfaceC7191vS<Object>> list, JM<? super C7402wS> jm) {
        super(2, jm);
        this.g = list;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C7402wS c7402wS = new C7402wS(this.g, jm);
        c7402wS.e = obj;
        return c7402wS;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC6089qA0<Object> interfaceC6089qA0, JM<? super Unit> jm) {
        return ((C7402wS) create(interfaceC6089qA0, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC6089qA0 interfaceC6089qA0 = (InterfaceC6089qA0) this.e;
            this.d = 1;
            if (LE.c(this.g, interfaceC6089qA0, this) == mn) {
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
