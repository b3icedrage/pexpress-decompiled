package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8082zg1<T> extends AbstractC5982pg1<T, T> {

    @NotNull
    public final InterfaceC1442Lg1 b;

    @NotNull
    public final KW1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8082zg1(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.b = preferencesRepository;
        this.c = XO0.b(new C0738Cg(this, 6));
    }

    public abstract T k();

    @NotNull
    public final InterfaceC6396rf0<T> l() {
        return (InterfaceC6396rf0) this.c.getValue();
    }

    @Nullable
    public Object m(@NotNull Function1<? super JM<? super T>, ? extends Object> function1, @NotNull JM<? super InterfaceC4740jl2> jm) {
        return this.b.b(this, new C7872yg1(function1, null), jm);
    }
}
