package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4616jA0 implements InterfaceC4358iA0 {

    @NotNull
    public final Vg2 a;

    public C4616jA0(@NotNull Vg2 executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.a = executor;
    }

    @Override // defpackage.InterfaceC4358iA0
    @Nullable
    public final Object b(@NotNull Function1 function1, @NotNull LM lm) {
        return !this.a.h ? d(function1, lm) : Boolean.TRUE;
    }

    @Nullable
    public Object d(@NotNull Function1<? super CommonError, Unit> function1, @NotNull JM<? super Boolean> jm) {
        throw null;
    }
}
