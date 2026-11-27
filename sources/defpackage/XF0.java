package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface XF0 extends CoroutineContext.Element {

    public static final class a implements CoroutineContext.a<XF0> {
        public static final /* synthetic */ a d = new a();
    }

    @NotNull
    A20 A(boolean z, boolean z2, @NotNull Function1<? super Throwable, Unit> function1);

    @NotNull
    CancellationException C();

    boolean S0();

    @NotNull
    A20 W(@NotNull Function1<? super Throwable, Unit> function1);

    @Nullable
    Object b1(@NotNull JM<? super Unit> jm);

    @NotNull
    Sequence<XF0> c();

    boolean g();

    @Nullable
    XF0 getParent();

    boolean isCancelled();

    void l(@Nullable CancellationException cancellationException);

    boolean start();

    @NotNull
    WB v(@NotNull C3956gG0 c3956gG0);
}
