package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC4778jy extends F51 {

    /* JADX INFO: renamed from: jy$a */
    public static final class a implements InterfaceC4778jy {

        @NotNull
        public final Function1<Throwable, Unit> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function1<? super Throwable, Unit> function1) {
            this.d = function1;
        }

        @Override // defpackage.InterfaceC4778jy
        public final void a(@Nullable Throwable th) {
            this.d.invoke(th);
        }

        @NotNull
        public final String toString() {
            return "CancelHandler.UserSupplied[" + this.d.getClass().getSimpleName() + '@' + C3787fU.f(this) + ']';
        }
    }

    void a(@Nullable Throwable th);
}
