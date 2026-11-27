package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {94}, m = "invokeSuspend")
public final class C6611sg1 extends AW1 implements Function2<AbstractC0662Bg1, JM<? super AbstractC0662Bg1>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ AW1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6611sg1(Function2<? super AbstractC0662Bg1, ? super JM<? super AbstractC0662Bg1>, ? extends Object> function2, JM<? super C6611sg1> jm) {
        super(2, jm);
        this.g = (AW1) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C6611sg1 c6611sg1 = new C6611sg1(this.g, jm);
        c6611sg1.e = obj;
        return c6611sg1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC0662Bg1 abstractC0662Bg1, JM<? super AbstractC0662Bg1> jm) {
        return ((C6611sg1) create(abstractC0662Bg1, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            AbstractC0662Bg1 abstractC0662Bg1 = (AbstractC0662Bg1) this.e;
            this.d = 1;
            obj = this.g.invoke(abstractC0662Bg1, this);
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        AbstractC0662Bg1 abstractC0662Bg2 = (AbstractC0662Bg1) obj;
        Intrinsics.c(abstractC0662Bg2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((Y11) abstractC0662Bg2).b.a.set(true);
        return abstractC0662Bg2;
    }
}
