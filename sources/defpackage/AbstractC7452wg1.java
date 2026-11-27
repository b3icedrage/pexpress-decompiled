package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7452wg1<T> extends AbstractC5982pg1<T, T> {

    @NotNull
    public final InterfaceC1442Lg1 b;

    @NotNull
    public final KW1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7452wg1(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.b = preferencesRepository;
        this.c = XO0.b(new C4039gg(this, 3));
    }

    @NotNull
    public final InterfaceC6396rf0<T> k() {
        return (InterfaceC6396rf0) this.c.getValue();
    }

    @Nullable
    public final Object l(@NotNull Function1<? super JM<? super T>, ? extends Object> function1, @NotNull JM<? super InterfaceC4740jl2> jm) {
        return j(this.b, new C7241vg1(function1, null), (LM) jm);
    }
}
