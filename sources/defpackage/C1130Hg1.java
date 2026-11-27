package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Hg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {358}, m = "invokeSuspend")
public final class C1130Hg1 extends AW1 implements Function2<AbstractC0662Bg1, JM<? super AbstractC0662Bg1>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ AW1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1130Hg1(Function2<? super Y11, ? super JM<? super Unit>, ? extends Object> function2, JM<? super C1130Hg1> jm) {
        super(2, jm);
        this.g = (AW1) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C1130Hg1 c1130Hg1 = new C1130Hg1(this.g, jm);
        c1130Hg1.e = obj;
        return c1130Hg1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC0662Bg1 abstractC0662Bg1, JM<? super AbstractC0662Bg1> jm) {
        return ((C1130Hg1) create(abstractC0662Bg1, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Y11 y11 = (Y11) this.e;
            C1795Pt1.b(obj);
            return y11;
        }
        C1795Pt1.b(obj);
        Y11 y12 = new Y11(PW0.l(((AbstractC0662Bg1) this.e).a()), false);
        this.e = y12;
        this.d = 1;
        return this.g.invoke(y12, this) == mn ? mn : y12;
    }
}
