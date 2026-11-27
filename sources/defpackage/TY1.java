package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class TY1 implements InterfaceC6606sf0<Object> {

    @NotNull
    public final Throwable d;

    public TY1(@NotNull Throwable th) {
        this.d = th;
    }

    @Override // defpackage.InterfaceC6606sf0
    @Nullable
    public final Object a(@Nullable Object obj, @NotNull JM<? super Unit> jm) throws Throwable {
        throw this.d;
    }
}
